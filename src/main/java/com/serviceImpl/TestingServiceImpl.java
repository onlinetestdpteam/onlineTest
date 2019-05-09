package com.serviceImpl;

import com.dao.BaseDao;
import com.dao.SubjectMapper;
import com.dao.TestingMapper;
import com.service.SubjectService;
import com.service.TestingService;
import model.Subject;
import model.Testing;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestingServiceImpl extends BaseServiceImpl<Testing> implements TestingService {

    @Autowired
    private TestingMapper testingMapper;
    private BaseDao<User> baseDao;

    @Override
    public void setBaseDao(Object object) {
        this.testingMapper=(TestingMapper)object;
        super.setBaseDao(this.testingMapper);
    }
}
