package com.ruomu.service;


import com.ruomu.pojo.User;

public interface UserService {
	
	
	  int deleteByPrimaryKey(Integer id) throws Exception;

	    int insert(User record) throws Exception;

	    int insertSelective(User record) throws Exception;

	    User selectByPrimaryKey(Integer id) throws Exception;

	    int updateByPrimaryKeySelective(User record) throws Exception;

	    int updateByPrimaryKeyWithBLOBs(User record) throws Exception;

	    int updateByPrimaryKey(User record) throws Exception;
	
	    User selectByZhangHao(String zhanghao);
}
