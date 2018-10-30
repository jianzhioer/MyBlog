package com.lxf.blog.service.Impl;

import com.lxf.blog.dao.UserDao;
import com.lxf.blog.entity.UserEntity;
import com.lxf.blog.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.UUID;

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
    public UserEntity getUserInfo(String userId) {
        UserEntity userEntity = userDao.get(userId);
        userEntity.setPassword("********");
        return userEntity;
    }

    @Override
    public void createUserInfo(UserEntity userInfo) {
        userInfo.setUserId(UUID.randomUUID().toString());
        userDao.save(userInfo);
    }

    @Override
    public void updateUserInfo(UserEntity userInfo) {
        userDao.update(userInfo);
    }

    @Override
    public void deleteUserInfo(String userId) {
        userDao.delete(userId);
    }

    @Override
    public boolean checkoutUserInfo(UserEntity userEntity) {
        UserEntity userEntityInDb = new UserEntity();
        userEntityInDb = userDao.getUserEntityByName(userEntity.getUsername());
        return userEntityInDb.equals(userEntity);
    }
}
