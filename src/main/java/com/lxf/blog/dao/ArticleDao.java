package com.lxf.blog.dao;

import com.lxf.blog.dao.base.BaseDao;
import com.lxf.blog.entity.ArticleEntity;
import org.springframework.stereotype.Repository;


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
}
