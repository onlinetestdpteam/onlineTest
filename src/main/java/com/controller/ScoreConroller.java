package com.controller;

import com.UUID.UUIDgenarater;
import com.controller.Admin.AdminUserConroller;
import com.dao.ScoreMapper;
import com.model.User;
import com.service.ScoreService;
import com.model.MsgBean;
import com.model.Score;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/Mobile/Score")
public class ScoreConroller extends BaseController<Score> {

    @Autowired
    private ScoreService scoreService;
    @Autowired
    private ScoreMapper scoreMapper;

    private final static Logger logger= LoggerFactory.getLogger(AdminUserConroller.class);

    @RequestMapping(value = "web/grade/{score}/{subject}",method = RequestMethod.GET)
    public String grade(@PathVariable("score")String score,@PathVariable("subject")String subject,HttpSession session, Model model){

        Score scoreObject=new Score();
        scoreObject.setId(new UUIDgenarater().getUUID());
        scoreObject.setSubject(subject);
        User login = (User) SecurityUtils.getSubject().getPrincipal();
        String userid=login.getId();
        scoreObject.setStuid(userid);
        scoreObject.setTestscore(Integer.valueOf(score));
        scoreService.setBaseDao(scoreMapper);
        MsgBean scoremsgBean=scoreService.instert(scoreObject);
        if(scoremsgBean.isStatus()){
            logger.info("添加成绩成功！");
        }
//        selectByAllByUserId
        List<Score> scoreList=scoreService.selectByAllByUserId(userid);
        model.addAttribute("scoreList",scoreList);

        return "grade";
    }




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
    public MsgBean instertById(@RequestBody Score score) {
        score.setId(new UUIDgenarater().getUUID());
        return super.instertById(score, scoreService,scoreMapper);
    }

    @RequestMapping(value = "/",method = RequestMethod.PUT)
    @ResponseBody
    public MsgBean updateByKey(@RequestBody Score score) {
        return super.updateByKey(score, scoreService,scoreMapper);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public MsgBean deleteById(@PathVariable("id") String id) {
        return super.deleteById(id, scoreService,scoreMapper);
    }
}
