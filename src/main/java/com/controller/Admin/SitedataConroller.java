package com.controller.Admin;

import com.controller.BaseController;
import com.dao.ScoreMapper;
import com.dao.SitedataMapper;
import com.service.ScoreService;
import com.service.SitedataService;
import model.MsgBean;
import model.Score;
import model.Sitedata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Admin/Sitedata")
public class SitedataConroller extends BaseController<Sitedata> {

    @Autowired
    private SitedataService sitedataService;
    @Autowired
    private SitedataMapper sitedataMapper;


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean queryById(@PathVariable("id")String id) {
        return super.queryById(id, sitedataService,sitedataMapper);
    }

    @RequestMapping(value = "/{page}/{count}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean queryAllByPage(@PathVariable("page") int page, @PathVariable("count") int count) {
        return super.queryAllByPage(page, count, sitedataService,sitedataMapper);
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    @ResponseBody
    public MsgBean instertById(@ModelAttribute Sitedata sitedata) {

        return super.instertById(sitedata, sitedataService,sitedataMapper);
    }

    @RequestMapping(value = "/",method = RequestMethod.PUT)
    @ResponseBody
    public MsgBean updateByKey(@ModelAttribute Sitedata sitedata) {
        return super.updateByKey(sitedata, sitedataService,sitedataMapper);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public MsgBean deleteById(@PathVariable("id") String id) {
        return super.deleteById(id, sitedataService,sitedataMapper);
    }
}
