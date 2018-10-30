package com.lxf.blog.service.Impl;

import com.lxf.blog.dao.CommentDao;
import com.lxf.blog.entity.CommentEntity;
import com.lxf.blog.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: CommentServiceImpl
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-25
 * @Version: 1.0
 */
@Service
@Transactional
public class CommentServiceImpl implements CommentService {

    @Resource
    CommentDao commentDao;

    @Override
    public boolean createComment(CommentEntity commentEntity) {
        return false;
    }

    @Override
    public boolean deleteComment(String commentId) {
        return false;
    }

    @Override
    public boolean updateComment(CommentEntity commentEntity) {
        return false;
    }

    @Override
    public List<CommentEntity> getCommentList(int pageSize, int pageNum) {
        return null;
    }
}
