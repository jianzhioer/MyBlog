package com.lxf.blog.dao;

import com.lxf.blog.dao.base.BaseDao;
import com.lxf.blog.entity.ArticleEntity;
import com.lxf.blog.model.LabelType;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

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
    public ArticleEntity get(String articleId){
        return super.get(articleId);
    }

    @Override
    public void update(ArticleEntity articleEntity){
        super.update(articleEntity);
    }

    @Override
    public void save(ArticleEntity articleEntity){
        super.save(articleEntity);
    }

    @Override
    public void delete(String articleId){
        super.delete(articleId);
    }

    public ArticleEntity test(int pageSize, int pageNum){
        String hql = "FROM ArticleEntity E WHERE E.articleId = :employee_id";
        Query query = getCurrentSession().createQuery(hql);
        query.setParameter("employee_id","123");
        return (ArticleEntity) query.uniqueResult();
    }

    public List<ArticleEntity> getAllArticleList(int pageSize, int pageNum){
        String hql = "FROM ArticleEntity A ORDER BY createTime DESC";
        Query query = getCurrentSession().createQuery(hql);
        query.setParameter("employee_id","123");
        return query.list();
    }

    public List<ArticleEntity> getAllArticleListByLabel(int pageSize, int pageNum ,LabelType labelType){
        String hql = "FROM ArticleEntity E WHERE E.labelType = :labile ORDER BY createTime DESC";
        Query query = getCurrentSession().createQuery(hql);
        query.setParameter("labile",labelType);
        return query.list();
    }

    public List<ArticleEntity> getAllArticleByArtIds(int pageSize, int pageNum ,List<String> artIds){
        String hql = "FROM ArticleEntity E WHERE E.articleId = (:artIds) ORDER BY createTime DESC";
        Query query = getCurrentSession().createQuery(hql);
        query.setParameterList("artIdS",artIds);
        return query.list();
    }
}
