package com.foodject.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodject.frame.Biz;
import com.foodject.mapper.UserMainMapper;
import com.foodject.vo.UserShopVO;


@Service
public class UserMainBiz implements Biz<Integer, UserShopVO> {

	@Autowired
	UserMainMapper dao;

	
	@Override
	public void register(UserShopVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(UserShopVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public UserShopVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<UserShopVO> get() throws Exception {
		return dao.selectall();
	}
	
	public List<UserShopVO> serchall(String obj) throws Exception{
		return dao.serchall(obj);
	}

}
