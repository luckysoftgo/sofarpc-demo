package com.application.base.sofa.runer.rpc.service;

import javax.ws.rs.*;
/**
 * @Author: 孤狼
 * @desc:
 */

@Path("/webapi/rest/person")
@Consumes("application/json;charset=UTF-8")
@Produces("application/json;charset=UTF-8")
public interface RpcDemoService {
	
	/**
	 * rpc接口测试使用.
	 * @param string
	 * @return
	 */
	@GET
	@Path("/sayName/{string}")
	String sayName(@PathParam("string") String string);
	
}
