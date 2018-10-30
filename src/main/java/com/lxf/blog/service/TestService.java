package com.lxf.blog.service;

import com.lxf.blog.entity.ArtKeyMappedEntity;
import com.lxf.blog.entity.ArticleEntity;

import java.util.List;

public interface TestService  {
    ArticleEntity getID(String id);
    boolean update(String id);
    List<ArtKeyMappedEntity> testQueryList(String id);
}
