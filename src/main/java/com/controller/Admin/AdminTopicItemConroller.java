package com.controller.Admin;

import com.UUID.UUIDgenarater;
import com.model.MsgBean;
import com.model.TopicItem;
import com.service.TopicItemService;
import com.util.FreemarkerUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Admin/TopicItem")
public class AdminTopicItemConroller {

    @Autowired
    private TopicItemService topicItemService;

    private final static Logger logger= LoggerFactory.getLogger(AdminUserConroller.class);

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean index(HttpServletRequest request) {

        String reslut="";
        Map<String,Object> map=new HashMap<>();
        request.getContextPath();
        map.put("request",request);
        List<TopicItem> topicItemList=new ArrayList<TopicItem>();

        try {
        topicItemList=topicItemService.quryAll(0,5);
        }catch (Exception e){
            logger.error(e.toString());
        }
        map.put("topicList",topicItemList);
        try {
            reslut= FreemarkerUtils.getTemplate("admin/topicManager.ftl",map);
        }catch (Exception e){
            logger.error(e.toString());
        }

        return new MsgBean(true,"返回页面成功！",reslut);

    }


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

        List<TopicItem> topicItemList=new ArrayList<TopicItem>();

        try {
           topicItemList =topicItemService.quryAll(page,count);
        }catch (Exception e){
            return new MsgBean(true,"查询成功",e.getMessage());
        }

        return new MsgBean(true,"查询成功",topicItemList);

    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    @ResponseBody
    public MsgBean instert(@RequestBody TopicItem topicItem) {
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
    public MsgBean updateByKey(@RequestBody TopicItem topicItem) {



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
            return new MsgBean(false,"删除失败",e.getMessage());
        }
        return new MsgBean(true,"删除成功",true);

    }
}
