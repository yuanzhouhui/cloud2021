package com.bright.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.bright.springcloud.entities.CommonResult;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2021-01-31 14:31
 */
public class CustomerBlockHandler {
	public static CommonResult handlerException1(BlockException exception) {
		return new CommonResult(4444, "按客户自定义,global handler handlerException---1");
	}

	public static CommonResult handlerException2(BlockException exception) {
		return new CommonResult(4444, "按客户自定义,global handler handlerException---2");
	}
}
