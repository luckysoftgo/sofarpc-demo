package com.application.base.test;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.application.base.sofa.runer.SofaRpcApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import com.application.base.sofa.service.SampleSofaJvmService;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Author: 孤狼
 * @desc: junit 测试.
 */

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SofaRpcApplication.class})
public class SofaBootWithModulesTest {
	
	@SofaReference
	private SampleSofaJvmService sampleJvmService;
	
	@SofaReference(uniqueId = "annotationImpl")
	private SampleSofaJvmService sampleJvmServiceAnnotationImpl;
	
	@SofaReference(uniqueId = "serviceClientImpl")
	private SampleSofaJvmService sampleJvmServiceClientImpl;
	
	@Test
	public void test() {
		
		System.out.println("===================《测试数据》=====================");
		System.out.println(sampleJvmService.message());;
		System.out.println(sampleJvmServiceAnnotationImpl.message());
		System.out.println(sampleJvmServiceClientImpl.message());
		
		Assert.assertEquals("Hello, jvm service xml implementation.", sampleJvmService.message());
		Assert.assertEquals("Hello, jvm service annotation implementation.",
				sampleJvmServiceAnnotationImpl.message());
		Assert.assertEquals("Hello, jvm service service client implementation.",
				sampleJvmServiceClientImpl.message());
	}
}
