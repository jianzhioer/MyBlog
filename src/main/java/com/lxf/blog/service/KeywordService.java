package com.lxf.blog.service;


import com.lxf.blog.entity.KeywordEntity;

import java.util.List;

public interface KeywordService {
    void createKeyword(String keyword);
    void deleteKeyword(String keywordId);
    void updateKeyword(KeywordEntity keywordEntity);
    List<String> getKeywordList();
}
