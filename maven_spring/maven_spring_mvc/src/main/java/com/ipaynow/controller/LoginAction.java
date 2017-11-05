package com.ipaynow.controller;
import com.ipaynow.domain.UserExample;
import com.ipaynow.domain.req.LoginParam;
import com.ipaynow.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
@Controller
@RequestMapping("/loginAction")
public class LoginAction {
	@Resource
	private LoginService loginService;
	 @RequestMapping(value = "/login")
	public boolean login(LoginParam loginParam) {
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(loginParam.getUsername());
		criteria.andPasswordEqualTo(loginParam.getPassword());
		return loginService.userLogin(userExample);
	}
}
