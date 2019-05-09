package com.controller.Admin;

import com.controller.BaseController;
import com.dao.SitedataMapper;
import com.dao.SubjectMapper;
import com.service.SitedataService;
import com.service.SubjectService;
import model.MsgBean;
import model.Sitedata;
import model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Admin/Subject")
public class SubjectConroller extends BaseController<Subject> {

    @Autowired
    private SubjectService subjectService;
    @Autowired
    private SubjectMapper subjectMapper;


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean queryById(@PathVariable("id")String id) {
        return super.queryById(id, subjectService,subjectMapper);
    }

    @RequestMapping(value = "/{page}/{count}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean queryAllByPage(@PathVariable("page") int page, @PathVariable("count") int count) {
        return super.queryAllByPage(page, count, subjectService,subjectMapper);
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    @ResponseBody
    public MsgBean instertById(@ModelAttribute Subject subject) {

        return super.instertById(subject, subjectService,subjectMapper);
    }

    @RequestMapping(value = "/",method = RequestMethod.PUT)
    @ResponseBody
    public MsgBean updateByKey(@ModelAttribute Subject subject) {
        return super.updateByKey(subject, subjectService,subjectMapper);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public MsgBean deleteById(@PathVariable("id") String id) {
        return super.deleteById(id, subjectService,subjectMapper);
    }
}
