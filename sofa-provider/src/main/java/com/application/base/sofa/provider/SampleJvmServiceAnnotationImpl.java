package com.application.base.sofa.provider;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.application.base.sofa.service.SampleSofaJvmService;

/**
 * @Author: 孤狼
 * @desc: 实现对应信息.
 */
@SofaService(uniqueId = "annotationImpl")
public class SampleJvmServiceAnnotationImpl implements SampleSofaJvmService {
    
    @Override
    public String message() {
        String message = "Hello, jvm service annotation implementation.";
        System.out.println(message);
        return message;
    }
    
}
