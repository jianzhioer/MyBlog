package com.lxf.blog.entity;

import com.lxf.blog.model.ArticleInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "t_article")
public class ArticleEntity {

    @Id
    private String articleId;
    private String title;
    @Column(name = "abstracts",columnDefinition = "text")
    private String abstracts;//摘要
    private String labelId;
    private String createTime;
    @Column(name = "context",columnDefinition = "longtext")
    private String context;
    private int clickNum;
    private int commentNum;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getClickNum() {
        return clickNum;
    }

    public void setClickNum(int clickNum) {
        this.clickNum = clickNum;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public ArticleEntity transformArticleInfo(ArticleInfo articleInfo){
        ArticleEntity articleEntity = new ArticleEntity();
        articleEntity.setTitle(articleInfo.getTitle());
        articleEntity.setArticleId(articleInfo.getArticleId());
        articleEntity.setAbstracts(articleInfo.getArticleId());
        articleEntity.setCommentNum(articleInfo.getCommentNum());
        articleEntity.setContext(articleInfo.getContext());
        articleEntity.setLabelId(articleInfo.getLabel());
        articleEntity.setClickNum(articleInfo.getClickNum());
        articleEntity.setCreateTime(articleInfo.getCreateTime());
        return articleEntity;
    }
}
