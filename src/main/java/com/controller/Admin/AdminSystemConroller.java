package com.controller.Admin;

import com.UUID.UUIDgenarater;
import com.controller.BaseController;
import com.dao.TestingMapper;
import com.dao.TestpaperMapper;
import com.dao.UserMapper;
import com.model.MsgBean;
import com.model.Testing;
import com.model.Testpaper;
import com.model.User;
import com.service.TestingService;
import com.service.TestpaperService;
import com.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class AdminSystemConroller extends BaseController {


    private final static Logger logger= LoggerFactory.getLogger(AdminUserConroller.class);
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TestingService testingService;
    @Autowired
    private TestingMapper testingMapper;

    @Autowired
    private TestpaperService testpaperService;
    @Autowired
    private TestpaperMapper testpaperMapper;

    @RequestMapping(value = "Admin/",method = RequestMethod.GET)
    public String index(HttpSession session, Model model){


        return "admin/index";
    }

    @RequestMapping(value = "adminlogin/",method = RequestMethod.GET)
    public String Login(HttpSession session, Model model){


        return "admin/login";
    }

    public MsgBean comLogin(User user, HttpSession session,Boolean isweb){
        if(user.getUname()==null){

//            model.addAttribute("message",new MsgBean(false,"账号不为空 ",false));
//            return "admin/login";
            return new MsgBean(false,"账号不为空 ",false);
        }
        //主体,当前状态为没有认证的状态“未认证”
        Subject subject = SecurityUtils.getSubject();
        // 登录后存放进shiro token
        User tempuser;
        //登录方法（认证是否通过）
        //使用subject调用securityManager,安全管理器调用Realm
        try {
            //利用异常操作
            //需要开始调用到Realm中
            UsernamePasswordToken token=new UsernamePasswordToken(user.getUname(),user.getPwd());
            logger.info("========================================");
            logger.info("1、进入认证方法");
            subject.login(token);

            tempuser = (User)subject.getPrincipal();

            if(session.getAttribute("UserData")==null&&isweb){
                session.setAttribute("UserData",subject);
            }

            logger.info("登录完成");

            return new MsgBean(true,"登录成功",true);


        } catch (AuthenticationException e) {


//            model.addAttribute("message",new MsgBean(false,"账号密码不正确 ",false));
            return new MsgBean(false,"账号密码不正确 ",false);
        }

    }

    @RequestMapping(value = "adminlogin/",method = RequestMethod.POST)
    @ResponseBody
    public MsgBean Login(@RequestBody User user, HttpSession session, Model model){

        return comLogin(user,session,true);

    }

    @RequestMapping(value = "Admin/quit/",method = RequestMethod.GET)
    public String adminloginout(HttpSession session, Model model){
        session.removeAttribute("UserData");
        Subject subject = SecurityUtils.getSubject();
        subject.logout();

        return "admin/login";
    }

//前台注册，后台不需要注册
    @RequestMapping(value = "register/",method = RequestMethod.POST)
    @ResponseBody
    public MsgBean instertById(@ModelAttribute User user) {
        user.setId(new UUIDgenarater().getUUID());
        return super.instertById(user, userService,userMapper);
    }

    @RequestMapping(value = "permison/",method = RequestMethod.GET)
    public String permison(HttpSession session, Model model){


        return "system/403";
    }

    @RequestMapping(value = "404/",method = RequestMethod.GET)
    public String noePage(HttpSession session, Model model){


        return "system/404";
    }

    @RequestMapping(value = "web/loginpage",method = RequestMethod.GET)
    public String login(HttpSession session, Model model){


        return "login";
    }

    @RequestMapping(value = "web/login/",method = RequestMethod.POST)
    @ResponseBody
    public MsgBean userlogin(@RequestBody User user, HttpSession session, Model model){


        return comLogin(user,session,true);
    }

    @RequestMapping(value = "web/exam",method = RequestMethod.GET)
    public String exam(HttpSession session, Model model){


        return "exam";
    }


    @RequestMapping(value = "web/kskm",method = RequestMethod.GET)
    public ModelAndView kskm(HttpSession session, Model model){
        ModelAndView modelAndView=new ModelAndView();
        testingService.setBaseDao(testingMapper);
        MsgBean testingM=testingService.selectAllByPage(1,5);
        List<Map> testingList=(List<Map>)testingM.getData();
        Map map=testingList.get(0);

        modelAndView.addObject("testlist",map.get("data"));

        modelAndView.setViewName("kskm");
        return modelAndView;
    }

    @RequestMapping(value = "web/grade",method = RequestMethod.GET)
    public String grade(HttpSession session, Model model){


        return "grade";
    }

    @RequestMapping(value = "web/main",method = RequestMethod.GET)
    public ModelAndView main(HttpSession session, Model model){


        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.addObject("user",session.getAttribute("UserData"));
        modelAndView.setViewName("main");
        return modelAndView;
    }



    @RequestMapping(value = "web/paper/{id}",method = RequestMethod.GET)
    public ModelAndView paper(@PathVariable("id")String id,HttpSession session, Model model){
        ModelAndView modelAndView=new ModelAndView();

        List<Testpaper> testpaperList=testpaperService.selectByTestid(id);
        modelAndView.addObject("paperlist",testpaperList);

        modelAndView.setViewName("paper");
        return modelAndView;
    }

}
