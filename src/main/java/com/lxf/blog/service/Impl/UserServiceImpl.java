package com.lxf.blog.service.Impl;

import com.lxf.blog.dao.UserDao;
import com.lxf.blog.entity.UserEntity;
import com.lxf.blog.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-25
 * @Version: 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public UserEntity getUserInfo() {
        return null;
    }

    @Override
    public boolean createUserInfo(UserEntity userInfo) {
        return false;
    }

    @Override
    public boolean updateUserInfo(UserEntity userInfo) {
        return false;
    }

    @Override
    public boolean deleteUserInfo(String userId) {
        return false;
    }

    @Override
    public boolean checkoutUserInfo(UserEntity userEntity) {
        return false;
    }
}
