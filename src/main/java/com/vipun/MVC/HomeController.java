package com.vipun.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String loadHome() {
        System.out.println("load home page....");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(){

        return "result.jsp";
    }

}