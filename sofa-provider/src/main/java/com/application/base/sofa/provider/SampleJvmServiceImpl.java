package com.application.base.sofa.provider;

import com.application.base.sofa.service.SampleSofaJvmService;

/**
 * @Author: 孤狼
 * @desc: 实现对应信息.
 */
public class SampleJvmServiceImpl implements SampleSofaJvmService {
    
    private String message;

    public SampleJvmServiceImpl(String message) {
        this.message = message;
    }

    public SampleJvmServiceImpl() {
    }

    @Override
    public String message() {
        System.out.println(message);
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
