package com.lxf.blog.service;

import com.lxf.blog.entity.UserEntity;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-25
 * @Version: 1.0
 */

public interface UserService {
    UserEntity getUserInfo(String userId);
    void createUserInfo(UserEntity userInfo);
    void updateUserInfo(UserEntity userInfo);
    void deleteUserInfo(String userId);
    boolean checkoutUserInfo(UserEntity userEntity);//登录检查接口
}
