package com.lxf.blog.service.Impl;

import com.lxf.blog.dao.ArtKeyMappedDao;
import com.lxf.blog.dao.ArticleDao;
import com.lxf.blog.entity.ArtKeyMappedEntity;
import com.lxf.blog.entity.ArticleEntity;
import com.lxf.blog.model.ArticleInfo;
import com.lxf.blog.model.LabelType;
import com.lxf.blog.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
        List<ArticleEntity> lists = articleDao.getAllArticleList(pageSize,pageNum);
        List<ArticleInfo> newlist = new ArrayList<>();
        for(ArticleEntity articleEntity : lists){
            ArticleInfo articleInfo = new ArticleInfo().transFromArticleEntity(articleEntity);
            newlist.add(addKeywordList(articleInfo));
        }
        return newlist;
    }

    @Override
    public List<ArticleInfo> getArticleByLabel(LabelType labelType, int pageSize, int pageNum) {
        List<ArticleEntity> lists = articleDao.getAllArticleListByLabel(pageSize,pageNum,labelType);
        List<ArticleInfo> newlist = new ArrayList<>();
        for(ArticleEntity articleEntity : lists){
            ArticleInfo articleInfo = new ArticleInfo().transFromArticleEntity(articleEntity);
            newlist.add(addKeywordList(articleInfo));
        }
        return newlist;
    }

    @Override
    public List<ArticleInfo> getArticleByKeyword(String keywordName, int pageSize, int pageNum) {
        List<ArticleInfo> newlist = new ArrayList<>();
        List<String> articleIdList = new ArrayList<>();
        articleIdList = artKeyMappedDao.getArticleListByKeywordName(keywordName);
        for (String articleId : articleIdList){
            newlist.add(getArticle(articleId));
        }
        return newlist;
    }

    @Override
    public ArticleInfo getArticle(String articleId) {
        ArticleEntity articleEntity = articleDao.get(articleId);
        ArticleInfo articleInfo = new ArticleInfo().transFromArticleEntity(articleEntity);
        List<String> keywordList = new ArrayList<>();
        keywordList = artKeyMappedDao.getKeywordListByArticleId(articleId);
        articleInfo.setKeywordList(keywordList);
        return articleInfo;
    }

    @Override
    public void createArticle(ArticleInfo articleInfo) {
        List<String> keywordsList = articleInfo.getKeywordList();
        ArticleEntity articleEntity = new ArticleEntity().transFromArticleInfo(articleInfo);
        articleEntity.setArticleId(UUID.randomUUID().toString());
        for (String keyword : keywordsList) {
            ArtKeyMappedEntity artKeyMappedEntity = new ArtKeyMappedEntity();
            artKeyMappedEntity.setId(UUID.randomUUID().toString());
            artKeyMappedEntity.setArticleId(articleEntity.getArticleId());
            artKeyMappedEntity.setKeywordName(keyword);
            artKeyMappedDao.save(artKeyMappedEntity);
        }
        articleDao.save(articleEntity);
    }

    @Override
    public void deleteArticle(String articleId) {
        articleDao.delete(articleId);
    }

    @Override
    public void updateArticle(ArticleInfo articleInfo) {
        ArticleEntity articleEntity = new ArticleEntity().transFromArticleInfo(articleInfo);
        articleDao.update(articleEntity);
    }

    private ArticleInfo addKeywordList(ArticleInfo articleInfo){
        List<String> keywordList = new ArrayList<>();
        keywordList = artKeyMappedDao.getKeywordListByArticleId(articleInfo.getArticleId());
        articleInfo.setKeywordList(keywordList);
        return articleInfo;
    }
}
