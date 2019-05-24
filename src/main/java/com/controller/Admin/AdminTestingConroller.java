package com.controller.Admin;

import com.UUID.UUIDgenarater;
import com.controller.BaseController;
import com.dao.TestingMapper;
import com.dao.TestpaperMapper;
import com.model.Testpaper;
import com.model.TopicItem;
import com.service.TestingService;
import com.model.MsgBean;
import com.model.Testing;
import com.service.TestpaperService;
import com.service.TopicItemService;
import com.util.FreemarkerUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Admin/Testing")
public class AdminTestingConroller extends BaseController<Testing> {

    @Autowired
    private TestingService testingService;
    @Autowired
    private TestingMapper testingMapper;

    @Autowired
    private TestpaperService testpaperService;
    @Autowired
    private TestpaperMapper testpaperMapper;
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
        testingService.setBaseDao(testingMapper);
        MsgBean paperList=testingService.selectAllByPage(1,5);
        List<Map> tempList=(List<Map>) paperList.getData();
        Map tempManp=tempList.get(0);

        map.put("testlist",tempManp.get("data"));
        try {
            reslut= FreemarkerUtils.getTemplate("admin/testingManager.ftl",map);
        }catch (Exception e){
            logger.error(e.toString());
        }

        return new MsgBean(true,"返回页面成功！",reslut);

    }

    @RequestMapping(value = "/exam/{id}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean exam(@PathVariable("id")String id, HttpSession session, Model model) throws Exception{
        ModelAndView modelAndView=new ModelAndView();
        testpaperService.setBaseDao(testpaperMapper);
        MsgBean testingM=testpaperService.selectById(id);
        Testpaper testpaper=(Testpaper)testingM.getData();

        List<TopicItem> topicItemList=topicItemService.quryBySubject(testpaper.getSubject(),"0",0,50);


        MsgBean msgBean=new MsgBean(true,"返回数据成功",topicItemList);
        return msgBean;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean queryById(@PathVariable("id")String id) {
        return super.queryById(id, testingService,testingMapper);
    }

    @RequestMapping(value = "/{page}/{count}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean queryAllByPage(@PathVariable("page") int page, @PathVariable("count") int count) {
        return super.queryAllByPage(page, count, testingService,testingMapper);
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    @ResponseBody
    public MsgBean instertById(@RequestBody Testing testing) {
        testing.setId(new UUIDgenarater().getUUID());
        return super.instertById(testing, testingService,testingMapper);
    }

    @RequestMapping(value = "/",method = RequestMethod.PUT)
    @ResponseBody
    public MsgBean updateByKey(@RequestBody Testing testing) {
        return super.updateByKey(testing, testingService,testingMapper);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public MsgBean deleteById(@PathVariable("id") String id) {
        return super.deleteById(id, testingService,testingMapper);
    }
}
