package com.lxf.blog.entity;

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
    private String abstracts;
    private String keywordId;
    private String labelId;
    private String createTime;
    @Column(name = "context",columnDefinition = "longtext")
    private String context;

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

    public String getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(String keywordId) {
        this.keywordId = keywordId;
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
}
