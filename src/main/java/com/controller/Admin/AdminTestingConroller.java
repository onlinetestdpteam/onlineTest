package com.controller.Admin;

import com.UUID.UUIDgenarater;
import com.controller.BaseController;
import com.dao.TestingMapper;
import com.service.TestingService;
import com.model.MsgBean;
import com.model.Testing;
import com.util.FreemarkerUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/Admin/Testing")
public class AdminTestingConroller extends BaseController<Testing> {

    @Autowired
    private TestingService testingService;
    @Autowired
    private TestingMapper testingMapper;


    private final static Logger logger= LoggerFactory.getLogger(AdminUserConroller.class);

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean index(HttpServletRequest request) {
        String reslut="";
        Map<String,Object> map=new HashMap<>();
        request.getContextPath();
        map.put("request",request);
        map.put("comment","");
        try {
            reslut= FreemarkerUtils.getTemplate("admin/testingManager.ftl",map);
        }catch (Exception e){
            logger.error(e.toString());
        }

        return new MsgBean(true,"返回页面成功！",reslut);

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
    public MsgBean instertById(@ModelAttribute Testing testing) {
        testing.setId(new UUIDgenarater().getUUID());
        return super.instertById(testing, testingService,testingMapper);
    }

    @RequestMapping(value = "/",method = RequestMethod.PUT)
    @ResponseBody
    public MsgBean updateByKey(@ModelAttribute Testing testing) {
        return super.updateByKey(testing, testingService,testingMapper);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public MsgBean deleteById(@PathVariable("id") String id) {
        return super.deleteById(id, testingService,testingMapper);
    }
}
