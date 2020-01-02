package com.bawei.service;

import java.util.List;

import com.bawei.entity.User;
import com.github.pagehelper.PageInfo;

public interface UserService {

	PageInfo<User> selects(Integer page,Integer pageSize);
}
