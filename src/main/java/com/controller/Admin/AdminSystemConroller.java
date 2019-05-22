package com.controller.Admin;

import com.UUID.UUIDgenarater;
import com.controller.BaseController;
import com.dao.UserMapper;
import com.model.MsgBean;
import com.model.User;
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

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class AdminSystemConroller extends BaseController {


    private final static Logger logger= LoggerFactory.getLogger(AdminUserConroller.class);
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "Admin/",method = RequestMethod.GET)
    public String index(HttpSession session, Model model){


        return "admin/index";
    }

    @RequestMapping(value = "adminlogin/",method = RequestMethod.GET)
    public String Login(HttpSession session, Model model){


        return "admin/login";
    }

    @RequestMapping(value = "adminlogin/",method = RequestMethod.POST)
    @ResponseBody
    public MsgBean Login(@RequestBody User user, HttpSession session, Model model){

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

            if(session.getAttribute("UserData")==null){
                session.setAttribute("UserData",subject);
            }

            logger.info("登录完成");

            return new MsgBean(true,"登录成功",true);


        } catch (AuthenticationException e) {


//            model.addAttribute("message",new MsgBean(false,"账号密码不正确 ",false));
            return new MsgBean(false,"账号密码不正确 ",false);
        }

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

    @RequestMapping(value = "web/login",method = RequestMethod.GET)
    public String login(HttpSession session, Model model){


        return "login";
    }

    @RequestMapping(value = "web/exam",method = RequestMethod.GET)
    public String exam(HttpSession session, Model model){


        return "exam";
    }


    @RequestMapping(value = "web/kskm",method = RequestMethod.GET)
    public String kskm(HttpSession session, Model model){


        return "kskm";
    }

    @RequestMapping(value = "web/grade",method = RequestMethod.GET)
    public String grade(HttpSession session, Model model){


        return "grade";
    }

    @RequestMapping(value = "web/main",method = RequestMethod.GET)
    public String main(HttpSession session, Model model){


        return "main";
    }



    @RequestMapping(value = "web/paper",method = RequestMethod.GET)
    public String paper(HttpSession session, Model model){


        return "paper";
    }

}
