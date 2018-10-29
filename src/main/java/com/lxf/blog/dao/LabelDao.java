package com.lxf.blog.dao;

import com.lxf.blog.dao.base.BaseDao;
import com.lxf.blog.entity.LabelEntity;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: LabelEntity
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-18
 * @Version: 1.0
 */
@Repository
public class LabelDao extends BaseDao<LabelEntity,String>{

    public LabelDao(){
        super(LabelEntity.class);
    }

    @Override
    public LabelEntity get(String id) {
        return super.get(id);
    }

    @Override
    public void save(LabelEntity object) {
        super.save(object);
    }

    @Override
    public void update(LabelEntity object) {
        super.update(object);
    }

    @Override
    public void delete(String id) {
        super.delete(id);
    }
}
