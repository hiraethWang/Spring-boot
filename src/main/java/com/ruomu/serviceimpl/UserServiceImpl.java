package com.ruomu.serviceimpl;

import com.ruomu.mapper.UserMapper;
import com.ruomu.pojo.User;
import com.ruomu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("UserService")
public class UserServiceImpl implements UserService {


	@Autowired
	private UserMapper usermapper;

	@Override
	public int deleteByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) throws Exception {
		return 0;
	}


	@Override
	public int insertSelective(User record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		User user =usermapper.selectByPrimaryKey(id);
		return user;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(User record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByZhangHao(String zhanghao) {
		// TODO Auto-generated method stub
		User user = usermapper.selectByZhangHao(zhanghao);
		return user;
	}


}
