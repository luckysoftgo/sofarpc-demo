package com.application.base.sofa.provider;

import com.alipay.sofa.runtime.api.aware.ClientFactoryAware;
import com.alipay.sofa.runtime.api.client.ClientFactory;
import com.alipay.sofa.runtime.api.client.ServiceClient;
import com.alipay.sofa.runtime.api.client.param.ServiceParam;
import com.application.base.sofa.service.SampleSofaJvmService;

/**
 * @Author: 孤狼
 * @desc: 实现对应信息.
 */
public class PublishServiceWithClient implements ClientFactoryAware {
    
    /**
     * 客户工厂
     */
    private ClientFactory clientFactory;
    
    /**
     * 初始化操作.
     */
    public void init() {
        ServiceClient serviceClient = clientFactory.getClient(ServiceClient.class);
        ServiceParam serviceParam = new ServiceParam();
        serviceParam.setInstance(new SampleJvmServiceImpl(
            "Hello, jvm service service client implementation."));
        serviceParam.setInterfaceType(SampleSofaJvmService.class);
        serviceParam.setUniqueId("serviceClientImpl");
        serviceClient.service(serviceParam);
    }

    @Override
    public void setClientFactory(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }
    
}
