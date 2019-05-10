package com.service;

import com.model.TopicItem;

import java.util.List;
import java.util.Map;

public interface TopicItemService {

    List<TopicItem> quryBySubject(String subject, String type,int start,int size) throws Exception;

    List<TopicItem> quryAll(int start,int size) throws Exception;

    public void update(TopicItem entity) throws Exception;
    public void save(TopicItem entity) throws Exception;
    public void insert(TopicItem entity) throws Exception;
    public void delete(TopicItem user) throws Exception;

    TopicItem quryById(String id) throws Exception;

}
