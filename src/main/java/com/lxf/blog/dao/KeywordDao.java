package com.lxf.blog.dao;

import com.lxf.blog.dao.base.BaseDao;
import com.lxf.blog.entity.KeywordEntity;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: KeywordDao
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-18
 * @Version: 1.0
 */
@Repository
public class KeywordDao extends BaseDao<KeywordEntity,String>{

    public KeywordDao(){
        super(KeywordEntity.class);
    }

    @Override
    public KeywordEntity get(String id) {
        return super.get(id);
    }

    @Override
    public void save(KeywordEntity object) {
        super.save(object);
    }

    @Override
    public void update(KeywordEntity object) {
        super.update(object);
    }

    @Override
    public void delete(String id) {
        super.delete(id);
    }
}
