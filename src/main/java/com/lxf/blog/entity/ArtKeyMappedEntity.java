package com.lxf.blog.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_artkeymap")
public class ArtKeyMappedEntity {

    private String articleID;
    private String keywordID;
    @Id
    private String id;

    public String getArticleID() {
        return articleID;
    }

    public void setArticleID(String articleID) {
        this.articleID = articleID;
    }

    public String getKeywordID() {
        return keywordID;
    }

    public void setKeywordID(String keywordID) {
        this.keywordID = keywordID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
