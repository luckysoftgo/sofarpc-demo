package com.application.base.sofa.runer.rpc.service.impl;

import com.application.base.sofa.runer.rpc.service.RpcDemoService;
import org.springframework.stereotype.Service;

/**
 * @Author: 孤狼
 * @desc:
 */
@Service
public class RpcDemoServiceImpl implements RpcDemoService {
	
	@Override
	public String sayName(String string) {
		return "Hi dear " + string + "!";
	}
	
}
