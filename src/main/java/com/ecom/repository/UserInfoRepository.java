package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

}
