package com.lxf.blog.service.Impl;

import com.lxf.blog.dao.CommentDao;
import com.lxf.blog.entity.CommentEntity;
import com.lxf.blog.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

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
    public void createComment(CommentEntity commentEntity) {
        commentEntity.setCommentId(UUID.randomUUID().toString());
        commentDao.save(commentEntity);
    }

    @Override
    public void deleteComment(String commentId) {
        commentDao.delete(commentId);
    }

    @Override
    public void updateComment(CommentEntity commentEntity) {
        commentDao.update(commentEntity);
    }

    @Override
    public List<CommentEntity> getCommentList(int pageSize, int pageNum ,String articleId) {
        return commentDao.getCommentListByArticleId(articleId);
    }
}
