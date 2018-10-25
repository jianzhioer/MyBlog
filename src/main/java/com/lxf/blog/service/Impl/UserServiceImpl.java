package com.lxf.blog.service.Impl;

import com.lxf.blog.entity.UserEntity;
import com.lxf.blog.model.UserInfo;
import com.lxf.blog.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Override
    public UserInfo getUserInfo() {
        return null;
    }

    @Override
    public boolean createUserInfo(UserInfo userInfo) {
        return false;
    }

    @Override
    public boolean updateUserInfo(UserInfo userInfo) {
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
