package com.lxf.blog.service.Impl;

import com.lxf.blog.dao.ArtKeyMappedDao;
import com.lxf.blog.dao.ArticleDao;
import com.lxf.blog.entity.ArtKeyMappedEntity;
import com.lxf.blog.entity.ArticleEntity;
import com.lxf.blog.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: TestService
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-22
 * @Version: 1.0
 */
@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Resource
    ArticleDao articleDao;
    @Resource
    ArtKeyMappedDao artKeyMappedDao;
    @Override
    public ArticleEntity getID(String id){
        return articleDao.test(1,1);
    }

    public boolean update(String id){
        ArticleEntity articleEntity = new ArticleEntity();
        articleEntity.setTitle("5522222");
        articleEntity.setArticleId(id);
        articleDao.update(articleEntity);
        return false;
    }

    @Override
    public List<ArtKeyMappedEntity> testQueryList(String id) {
        return artKeyMappedDao.getKeywordListByArticleId(id);
    }
}
