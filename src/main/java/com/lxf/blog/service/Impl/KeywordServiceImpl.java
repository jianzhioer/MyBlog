package com.lxf.blog.service.Impl;

import com.lxf.blog.service.KeywordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    @Override
    public boolean createKeyword(String keyword) {
        return false;
    }

    @Override
    public boolean deleteKeyword(String Keyword) {
        return false;
    }

    @Override
    public boolean updateKeyword(String Keyword) {
        return false;
    }

    @Override
    public List<String> getKeywordList() {
        return null;
    }
}
