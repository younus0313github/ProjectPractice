package com.ecom.serviceImpl;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.exceptiontracker.EcomException;
import com.ecom.model.UserInfo;
import com.ecom.repository.UserInfoRepository;
import com.ecom.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@Override
	public UserInfo getUserInfoById(Integer Id) {
		UserInfo ui = userInfoRepository.findById(Id).get();
		if (ui == null) {
			throw new EcomException("Invalid UserId" + Id);
		}
		return ui;
	}

}
