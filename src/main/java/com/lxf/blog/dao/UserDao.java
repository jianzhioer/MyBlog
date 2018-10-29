package com.lxf.blog.dao;

import com.lxf.blog.dao.base.BaseDao;
import com.lxf.blog.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserDao
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-18
 * @Version: 1.0
 */
@Repository
public class UserDao extends BaseDao<UserEntity,String> {

    public UserDao(){
        super(UserEntity.class);
    }

    @Override
    public UserEntity get(String id) {
        return super.get(id);
    }

    @Override
    public void save(UserEntity object) {
        super.save(object);
    }

    @Override
    public void update(UserEntity object) {
        super.update(object);
    }

    @Override
    public void delete(String id) {
        super.delete(id);
    }


}
