package com.application.base.sofa.runer.rpc.filter;

import com.alipay.sofa.rpc.core.exception.SofaRpcException;
import com.alipay.sofa.rpc.core.request.SofaRequest;
import com.alipay.sofa.rpc.core.response.SofaResponse;
import com.alipay.sofa.rpc.filter.Filter;
import com.alipay.sofa.rpc.filter.FilterInvoker;

/**
 * @Author: 孤狼
 * @desc:
 */
public class RpcDemoFilter extends Filter {
	
	@Override
	public SofaResponse invoke(FilterInvoker invoker, SofaRequest request) throws SofaRpcException {
		
		System.out.println("RpcDemo  Filter before");
		try {
			return invoker.invoke(request);
		} finally {
			System.out.println("RpcDemo Filter after");
		}
	}
}