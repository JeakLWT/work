package com.ipaynow.controller.login;

import com.ipaynow.domain.UserExample;
import com.ipaynow.domain.req.LoginParam;
import com.ipaynow.service.LoginService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class LoginAction {
	@Resource
	private LoginService loginService;

	public boolean login(LoginParam loginParam) {
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(loginParam.getUserName());
		criteria.andPasswordEqualTo(loginParam.getPassword());
		return loginService.userLogin(userExample);
	}
}
