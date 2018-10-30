package com.lxf.blog.service.Impl;

import com.lxf.blog.dao.KeywordDao;
import com.lxf.blog.entity.KeywordEntity;
import com.lxf.blog.service.KeywordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName: KeywordServiceImpl
 * @Description: TODO
 * @Author: sx-9530
 * @CreateDate: 18-10-25
 * @Version: 1.0
 */
@Service
@Transactional
public class KeywordServiceImpl implements KeywordService {

    @Resource
    KeywordDao keywordDao;

    @Override
    public void createKeyword(String keyword) {
        KeywordEntity keywordEntity  = new KeywordEntity();
        keywordEntity.setKeywordId(UUID.randomUUID().toString());
        keywordEntity.setValue(keyword);
        keywordDao.save(keywordEntity);
    }

    @Override
    public void deleteKeyword(String keywordId) {
        keywordDao.delete(keywordId);
    }

    @Override
    public void updateKeyword(KeywordEntity keywordEntity) {
        keywordDao.update(keywordEntity);
    }

    @Override
    public List<String> getKeywordList() {
        return keywordDao.getKeywordList();
    }
}
