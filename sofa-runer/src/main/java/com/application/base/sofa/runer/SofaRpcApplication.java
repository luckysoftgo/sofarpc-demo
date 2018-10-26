package com.application.base.sofa.runer;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.application.base.sofa.runer.rpc.service.RpcDemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: 孤狼
 * @desc: 启动项目.
 */
@SpringBootApplication
@ImportResource({ "classpath*:rpc-demo.xml" })
public class SofaRpcApplication {
	
	/**
	 * 函数入口.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SofaRpcApplication.class);
		springApplication.run(args);
	}
}
