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
    UserEntity getUserInfo();
    boolean createUserInfo(UserEntity userInfo);
    boolean updateUserInfo(UserEntity userInfo);
    boolean deleteUserInfo(String userId);
    boolean checkoutUserInfo(UserEntity userEntity);//登录检查接口
}
