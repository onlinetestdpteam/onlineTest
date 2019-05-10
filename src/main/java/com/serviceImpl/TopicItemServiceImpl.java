package com.serviceImpl;

import com.service.TopicItemService;
import com.model.TopicItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class TopicItemServiceImpl implements TopicItemService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<TopicItem> quryBySubject(String subject, String type,int start,int size) throws Exception {

        Query query = new Query();
        TopicItem topicItem=new TopicItem();
        topicItem.setId("1");
        query.skip(start);
        query.limit(size);
        query.addCriteria(new Criteria("type").is(type));

        return this.mongoTemplate.find(query, TopicItem.class);

    }

    @Override
    public List<TopicItem> quryAll(int start, int size) throws Exception {
        Query query = new Query();
        query.skip(start);
        query.limit(size);
        return this.mongoTemplate.find(query, TopicItem.class);
    }

    @Override
    public void update(TopicItem entity) throws Exception {



        Query query = new Query();
        query.addCriteria(new Criteria("_id").is(entity.getId()));
        Update update = new Update();
        update.set("description", entity.getDescription());
        update.set("title", entity.getTitle());
        update.set("type", entity.getType());
        update.set("ansItems", entity.getAnsItems());
        update.set("answer", entity.getAnswer());

        this.mongoTemplate.updateFirst(query, update, TopicItem.class);
    }

    @Override
    public void save(TopicItem entity) throws Exception {
        this.mongoTemplate.save(entity);
    }

    @Override
    public void insert(TopicItem entity) throws Exception {
        this.mongoTemplate.insert(entity);
    }

    @Override
    public void delete(TopicItem item) throws Exception {
        this.mongoTemplate.remove(item);
    }


    @Override
    public TopicItem quryById(String id) throws Exception {

        Query query = new Query();

        query.addCriteria(new Criteria("id").is(id));

        return this.mongoTemplate.findOne(query, TopicItem.class);
    }
}
