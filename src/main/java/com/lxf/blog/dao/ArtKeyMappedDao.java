package com.lxf.blog.dao;

import com.lxf.blog.dao.base.BaseDao;
import com.lxf.blog.entity.ArtKeyMappedEntity;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    public List<String> getKeywordListByArticleId(String articleId){
        String hql = "SELECT keywordName FROM ArtKeyMappedEntity A WHERE A.articleId = :artId";
        Query query = getCurrentSession().createQuery(hql);
        query.setParameter("artId",articleId);
        return query.list();
    }

    public List<String> getArticleListByKeywordName(String keywordName){
        String hql = "SELECT articleId FROM ArtKeyMappedEntity A WHERE A.keywordName = :keyName";
        Query query = getCurrentSession().createQuery(hql);
        query.setParameter("keyName",keywordName);
        return query.list();
    }
}
