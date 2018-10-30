package com.lxf.blog.service.Impl;

import com.lxf.blog.dao.ArtKeyMappedDao;
import com.lxf.blog.dao.ArticleDao;
import com.lxf.blog.model.ArticleInfo;
import com.lxf.blog.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: ArticleServiceImpl
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-25
 * @Version: 1.0
 */
@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

    @Resource
    ArticleDao articleDao;

    @Resource
    ArtKeyMappedDao artKeyMappedDao;

    @Override
    public List<ArticleInfo> getAllArticle(int pageSize, int pageNum) {
        return null;
    }

    @Override
    public List<ArticleInfo> getArticleByLabel(String labelName, int pageSize, int pageNum) {
        return null;
    }

    @Override
    public List<ArticleInfo> getArticleByKeyword(String keywordName, int pageSize, int pageNum) {
        return null;
    }

    @Override
    public ArticleInfo getArticle(String articleId) {
        return null;
    }

    @Override
    public boolean createArticle(ArticleInfo articleInfo) {
        return false;
    }

    @Override
    public boolean deleteArticle(String articleId) {
        return false;
    }

    @Override
    public boolean updateArticle(ArticleInfo articleInfo) {
        return false;
    }
}
