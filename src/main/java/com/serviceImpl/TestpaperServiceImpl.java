package com.serviceImpl;

import com.dao.BaseDao;
import com.dao.TestingMapper;
import com.dao.TestpaperMapper;
import com.service.TestingService;
import com.service.TestpaperService;
import model.Testing;
import model.Testpaper;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestpaperServiceImpl extends BaseServiceImpl<Testpaper> implements TestpaperService {

    @Autowired
    private TestpaperMapper testpaperMapper;
    private BaseDao<User> baseDao;

    @Override
    public void setBaseDao(Object object) {
        this.testpaperMapper=(TestpaperMapper)object;
        super.setBaseDao(this.testpaperMapper);
    }
}
