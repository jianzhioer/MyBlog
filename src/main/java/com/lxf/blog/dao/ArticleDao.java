package com.lxf.blog.dao;

import com.lxf.blog.dao.base.BaseDao;
import com.lxf.blog.entity.ArticleEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;


/**
 * @ClassName: ArticleDao
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-18
 * @Version: 1.0
 */
@Repository
public class ArticleDao extends BaseDao<ArticleEntity, String> {
    public ArticleDao() {
        super(ArticleEntity.class);
    }
    @Override
    public ArticleEntity get(String id) {
        String hql = "from ArticleEntity where articleId =:id ORDER BY createTime DESC";
        Query query = em.createQuery(hql);
        query.setParameter("id",id);
        return (ArticleEntity) query.getSingleResult();
    }

    @Override
    public void update(ArticleEntity entity) {
        if (null == entity) {
            throw new IllegalArgumentException();
        }
        super.update(entity);
    }
}
