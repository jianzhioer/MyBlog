package com.lxf.blog.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_keyword")
public class KeywordEntity {
    @Id
    private String keywordID;
    private String value;

    public String getKeywordID() {
        return keywordID;
    }

    public void setKeywordID(String keywordID) {
        this.keywordID = keywordID;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
