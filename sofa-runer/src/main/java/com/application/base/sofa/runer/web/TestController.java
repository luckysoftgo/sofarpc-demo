package com.application.base.sofa.runer.web;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.application.base.sofa.service.SampleSofaJvmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;


/**
 * @Author: 孤狼
 * @desc: 测试入口.
 */
@RestController
@RequestMapping("/sofaTest")
public class TestController {
	
	@SofaReference
	private SampleSofaJvmService sampleJvmService;
	
	@SofaReference(uniqueId = "annotationImpl")
	private SampleSofaJvmService sampleJvmServiceAnnotationImpl;
	
	@SofaReference(uniqueId = "serviceClientImpl")
	private SampleSofaJvmService sampleJvmServiceClientImpl;
	
	/**
	 * 没有设置 唯一Id 的访问方式.
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/serviceWithoutUniqueId")
	public String serviceWithoutUniqueId() throws IOException {
		return sampleJvmService.message();
	}
	
	/**
	 * 注解的访问方式处理.
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/annotationImplService")
	public String annotationImplService() throws IOException {
		return sampleJvmServiceAnnotationImpl.message();
	}
	
	/**
	 * 客户端实现的访问方式.
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/serviceClientImplService")
	public String serviceClientImplService() throws IOException {
		return sampleJvmServiceClientImpl.message();
	}
}