package com.lxf.blog.service;

import com.lxf.blog.model.ArticleInfo;

import java.util.List;

public interface ArticleService {
    List<ArticleInfo> getAllArticle(int pageSize,int pageNum);
    List<ArticleInfo> getArticleByLabel(String labelName,int pageSize,int pageNum);
    List<ArticleInfo> getArticleByKeyword(String keywordName,int pageSize,int pageNum);
    boolean createArticle(ArticleInfo articleInfo);
    boolean deleteArticle(String articleId);
    boolean updateArticle(ArticleInfo articleInfo);


}
