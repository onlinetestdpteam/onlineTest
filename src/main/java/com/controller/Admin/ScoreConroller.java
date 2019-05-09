package com.controller.Admin;

import com.controller.BaseController;
import com.dao.ScoreMapper;
import com.dao.UserMapper;
import com.service.ScoreService;
import com.service.UserService;
import model.MsgBean;
import model.Score;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Admin/Score")
public class ScoreConroller extends BaseController<Score> {

    @Autowired
    private ScoreService scoreService;
    @Autowired
    private ScoreMapper scoreMapper;


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean queryById(@PathVariable("id")String id) {
        return super.queryById(id, scoreService,scoreMapper);
    }

    @RequestMapping(value = "/{page}/{count}",method = RequestMethod.GET)
    @ResponseBody
    public MsgBean queryAllByPage(@PathVariable("page") int page, @PathVariable("count") int count) {
        return super.queryAllByPage(page, count, scoreService,scoreMapper);
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    @ResponseBody
    public MsgBean instertById(@ModelAttribute Score score) {

        return super.instertById(score, scoreService,scoreMapper);
    }

    @RequestMapping(value = "/",method = RequestMethod.PUT)
    @ResponseBody
    public MsgBean updateByKey(@ModelAttribute Score score) {
        return super.updateByKey(score, scoreService,scoreMapper);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public MsgBean deleteById(@PathVariable("id") String id) {
        return super.deleteById(id, scoreService,scoreMapper);
    }
}
