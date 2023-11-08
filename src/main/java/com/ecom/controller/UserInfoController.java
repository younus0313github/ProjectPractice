package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.UserInfo;
import com.ecom.service.UserInfoService;

@RestController
@RequestMapping("UserInfo")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;

	// API -Get UserInfo By using Id
	@GetMapping("getUserInfo/{Id}")
	public ResponseEntity<UserInfo> getUserInfoById(@PathVariable("Id") Integer Id) {
		UserInfo userinfo = userInfoService.getUserInfoById(Id);
		return ResponseEntity.ok().body(userinfo);
	}
}
