package com.lxf.blog.service;

import com.lxf.blog.entity.UserEntity;
import com.lxf.blog.model.UserInfo;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-25
 * @Version: 1.0
 */

public interface UserService {
    UserInfo getUserInfo();
    boolean createUserInfo(UserInfo userInfo);
    boolean updateUserInfo(UserInfo userInfo);
    boolean deleteUserInfo(String userId);
    boolean checkoutUserInfo(UserEntity userEntity);//登录检查接口
}
