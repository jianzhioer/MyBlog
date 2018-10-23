package com.lxf.blog.service;

import com.lxf.blog.dao.ArticleDao;
import com.lxf.blog.entity.ArticleEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: TestService
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-22
 * @Version: 1.0
 */
@Service
public class TestService {
    @Resource
    ArticleDao articleDao;

    public ArticleEntity getID(String id){
        return articleDao.get(id);
    }

    public ArticleEntity update(String id){
        ArticleEntity articleEntity = new ArticleEntity();
        articleEntity.setTitle("5522222");
        articleEntity.setArticleId(id);
        articleDao.update(articleEntity);
        return articleEntity;
    }
}
