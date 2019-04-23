package com.fn.biz.controller;

import java.io.IOException;

import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fn.dto.WechatValidateDto;
import com.fn.utils.constants.SysConstants;
import com.fn.utils.encrypt.Sha1Util;
import com.fn.web.enums.ResultType;
import com.fn.web.exception.FuiouException;

@RestController
@RequestMapping("/news")
public class WechatMutualController {

	private static Logger log = LoggerFactory.getLogger(WechatMutualController.class);
	
	@RequestMapping(value="/receive",method = RequestMethod.GET)
	public String validate(WechatValidateDto dto)
			throws ServletException, IOException {
		log.info("微信服务器连接验证请求参数"+dto.toString());
		try {
			checkSignature(dto);
		} catch (Exception e) {
			dto.setEchostr("fail");
			e.printStackTrace();
		}
		return dto.getEchostr();
	}
	/**
	 * 验证服务器连接
	 * 
	 * @param req
	 * @throws FuiouException
	 * @throws Exception
	 */
	private void checkSignature(WechatValidateDto dto) throws FuiouException, Exception {
		String strToken = Sha1Util.getSHA1(SysConstants.APP_KEY, dto.getTimestamp(), dto.getNonce());
		log.info("生成签名：" + strToken);
		if (!dto.getSignature().equals(strToken)) {
			throw new FuiouException(ResultType.TOKEN_FAIL);
		}
	}
}
