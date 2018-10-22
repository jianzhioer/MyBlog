package com.lxf.blog.dao;

import com.lxf.blog.dao.base.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: LabelEntity
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-18
 * @Version: 1.0
 */
@Repository
public class LabelEntity extends BaseDao<LabelEntity,String> {
    public LabelEntity(){
        super(LabelEntity.class);
    }
}
