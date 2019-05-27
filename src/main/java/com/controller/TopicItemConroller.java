package com.controller;

import com.UUID.UUIDgenarater;
import com.dao.ScoreMapper;
import com.model.MsgBean;
import com.model.Page;
import com.model.Score;
import com.model.TopicItem;
import com.service.ScoreService;
import com.service.TopicItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Mobile/TopicItem")
public class TopicItemConroller {

    @Autowired
    private TopicItemService topicItemService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean queryById(@PathVariable("id")String id) {

        TopicItem topicItem;
        try {
            topicItem=topicItemService.quryById(id);

        }catch (Exception e){

            return new MsgBean(true,"查询失败",e.getMessage());
        }


        return new MsgBean(true,"查询成功",topicItem);
    }

    @RequestMapping(value = "/{page}/{count}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean queryAllByPage(@PathVariable("page") int page, @PathVariable("count") int count) {

        Page<TopicItem> topicItemList=new Page<TopicItem>();

        try {
           topicItemList =topicItemService.quryAllByPage(page,count);
        }catch (Exception e){
            return new MsgBean(true,"查询成功",e.getMessage());
        }

        return new MsgBean(true,"查询成功",topicItemList);

    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    @ResponseBody
    public MsgBean instert(@ModelAttribute TopicItem topicItem) {
        topicItem.setId(new UUIDgenarater().getUUID());
        try {
            topicItemService.insert(topicItem);
        }catch (Exception e){
            return new MsgBean(true,"插入失败",e.getMessage());
        }

        return new MsgBean(true,"插入成功",true);
    }

    @RequestMapping(value = "/",method = RequestMethod.PUT)
    @ResponseBody
    public MsgBean updateByKey(@ModelAttribute TopicItem topicItem) {

        try {
            topicItemService.update(topicItem);
        }catch (Exception e){
            return new MsgBean(true,"更新失败",e.getMessage());
        }

        return new MsgBean(true,"更新成功",true);

    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public MsgBean deleteById(@PathVariable("id") String id) {


        try {
            topicItemService.delete(new TopicItem(id,"","","","","","","","",""));
        }catch (Exception e){
            return new MsgBean(true,"删除失败",e.getMessage());
        }
        return new MsgBean(true,"删除成功",true);

    }
}
