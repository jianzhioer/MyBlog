package com.lxf.blog.service;


import java.util.List;

public interface KeywordService {
    boolean createKeyword(String keyword);
    boolean deleteKeyword(String Keyword);
    boolean updateKeyword(String Keyword);
    List<String> getKeywordList();
}
