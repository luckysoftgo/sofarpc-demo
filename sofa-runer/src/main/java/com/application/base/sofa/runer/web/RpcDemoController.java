package com.application.base.sofa.runer.web;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.application.base.sofa.runer.rpc.service.RpcDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @Author: 孤狼
 * @desc:
 */

@RestController
@RequestMapping("/sofaRpc")
public class RpcDemoController {
	
	@Autowired
	RpcDemoService rpcDemoReferenceBolt;
	
	@Autowired
	RpcDemoService rpcDemoReferenceRest;
	
	@RequestMapping("/rpcRest")
	public String rpcRestTest() throws IOException {
		return rpcDemoReferenceRest.sayName("bruce");
	}
	
	@RequestMapping("/rpcBolt")
	public String rpcBoltTest() throws IOException {
		return rpcDemoReferenceBolt.sayName("rocky");
	}

}
