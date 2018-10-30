package com.lxf.blog.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_artkeymap")
public class ArtKeyMappedEntity {

    private String articleId;
    private String keywordName;
    @Id
    private String id;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleID) {
        this.articleId = articleID;
    }

    public String getKeywordName() {
        return keywordName;
    }

    public void setKeywordName(String keywordName) {
        this.keywordName = keywordName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
