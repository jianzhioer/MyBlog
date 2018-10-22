package com.lxf.blog.dao;

import com.lxf.blog.dao.base.BaseDao;
import com.lxf.blog.entity.CommentEntity;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: CommentDao
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-18
 * @Version: 1.0
 */
@Repository
public class CommentDao extends BaseDao<CommentEntity,String> {
    public CommentDao(){
        super(CommentEntity.class);
    }
}
