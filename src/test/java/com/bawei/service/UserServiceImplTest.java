package com.bawei.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bawei.entity.User;
import com.github.pagehelper.PageInfo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml" )
public class UserServiceImplTest {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	UserService userService;
	@Test
	public void testSelects() {
		PageInfo<User> info = userService.selects(1, 3);
		for (int i = 0; i < info.getList().size(); i++) {
			logger.info("hello:{}",info.getList().get(i));
		}
	}
	
	

}
