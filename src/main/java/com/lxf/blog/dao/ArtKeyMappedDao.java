package com.lxf.blog.dao;

import com.lxf.blog.dao.base.BaseDao;
import com.lxf.blog.entity.ArtKeyMappedEntity;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: ArtKeyMappedDao
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-18
 * @Version: 1.0
 */
@Repository
public class ArtKeyMappedDao extends BaseDao<ArtKeyMappedEntity,String> {

    public ArtKeyMappedDao() {
        super(ArtKeyMappedEntity.class);
    }

    @Override
    public ArtKeyMappedEntity get(String id) {
        return super.get(id);
    }

    @Override
    public void save(ArtKeyMappedEntity object) {
        super.save(object);
    }

    @Override
    public void update(ArtKeyMappedEntity object) {
        super.update(object);
    }

    @Override
    public void delete(String id) {
        super.delete(id);
    }
}
