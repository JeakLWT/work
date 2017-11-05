package com.ipaynow.service;

import com.ipaynow.domain.User;
import com.ipaynow.domain.UserExample;
import com.ipaynow.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginService {
	@Resource
	private UserMapper userMapper;

	public boolean userLogin(UserExample userExample) {
		List<User> userList = userMapper.selectByExample(userExample);
		if (CollectionUtils.isEmpty(userList)) {
			return false;
		}
		return true;
	}
}
