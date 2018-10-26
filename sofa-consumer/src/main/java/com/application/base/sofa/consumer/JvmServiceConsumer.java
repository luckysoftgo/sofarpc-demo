package com.application.base.sofa.consumer;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.aware.ClientFactoryAware;
import com.alipay.sofa.runtime.api.client.ClientFactory;
import com.alipay.sofa.runtime.api.client.ReferenceClient;
import com.alipay.sofa.runtime.api.client.param.ReferenceParam;
import org.springframework.beans.factory.annotation.Autowired;
import com.application.base.sofa.service.SampleSofaJvmService;

/**
 * @Author: 孤狼
 * @desc: 客户端的使用
 */
public class JvmServiceConsumer implements ClientFactoryAware {
	
	/**
	 * 客户工厂
	 */
	private ClientFactory clientFactory;
	
	@Autowired
	private SampleSofaJvmService sampleJvmService;
	
	@SofaReference(uniqueId = "annotationImpl")
	private SampleSofaJvmService sampleJvmServiceByFieldAnnotation;
	
	/**
	 * 初始化操作.
	 */
	public void init() {
		sampleJvmService.message();
		sampleJvmServiceByFieldAnnotation.message();
		
		ReferenceClient referenceClient = clientFactory.getClient(ReferenceClient.class);
		ReferenceParam<SampleSofaJvmService> referenceParam = new ReferenceParam<>();
		referenceParam.setInterfaceType(SampleSofaJvmService.class);
		referenceParam.setUniqueId("serviceClientImpl");
		SampleSofaJvmService sampleJvmServiceClientImpl = referenceClient.reference(referenceParam);
		sampleJvmServiceClientImpl.message();
	}
	
	@Override
	public void setClientFactory(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}
}