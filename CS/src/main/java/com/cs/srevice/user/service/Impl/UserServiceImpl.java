package com.cs.srevice.user.service.Impl;

import com.cs.srevice.user.dao.UserDao;
import com.cs.srevice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public String userLogin(String userName, Long password) {
       return userDao.userLogin(userName, password);
    }
}
