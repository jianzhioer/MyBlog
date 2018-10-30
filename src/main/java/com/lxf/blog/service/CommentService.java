package com.lxf.blog.service;

import com.lxf.blog.entity.CommentEntity;

import java.util.List;

public interface CommentService {
    void createComment(CommentEntity commentEntity);
    void deleteComment(String commentId);
    void updateComment(CommentEntity commentEntity);
    List<CommentEntity> getCommentList(int pageSize,int pageNum ,String articleId);
}
