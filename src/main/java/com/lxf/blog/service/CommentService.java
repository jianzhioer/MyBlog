package com.lxf.blog.service;

import com.lxf.blog.entity.CommentEntity;

import java.util.List;

public interface CommentService {
    boolean createComment(CommentEntity commentEntity);
    boolean deleteComment(String commentId);
    boolean updateComment(CommentEntity commentEntity);
    List<CommentEntity> getCommentList(int pageSize,int pageNum);
}
