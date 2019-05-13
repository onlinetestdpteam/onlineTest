package com.controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class AdminSystemConroller {

    @RequestMapping(value = "Admin/",method = RequestMethod.GET)
    public String index(HttpSession session, Model model){


        return "admin/index";
    }

    @RequestMapping(value = "adminlogin/",method = RequestMethod.GET)
    public String Login(HttpSession session, Model model){


        return "admin/login";
    }
}
