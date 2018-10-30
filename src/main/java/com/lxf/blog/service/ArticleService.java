package com.lxf.blog.service;

import com.lxf.blog.model.ArticleInfo;
import com.lxf.blog.model.LabelType;

import java.util.List;

public interface ArticleService {
    List<ArticleInfo> getAllArticle(int pageSize,int pageNum);
    List<ArticleInfo> getArticleByLabel(LabelType labelType, int pageSize, int pageNum);
    List<ArticleInfo> getArticleByKeyword(String keywordName,int pageSize,int pageNum);
    ArticleInfo getArticle(String articleId);
    void createArticle(ArticleInfo articleInfo);
    void deleteArticle(String articleId);
    void updateArticle(ArticleInfo articleInfo);


}
