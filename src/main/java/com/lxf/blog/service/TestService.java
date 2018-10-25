package com.lxf.blog.service;

import com.lxf.blog.entity.ArticleEntity;

public interface TestService  {
    ArticleEntity getID(String id);
    boolean update(String id);
}
