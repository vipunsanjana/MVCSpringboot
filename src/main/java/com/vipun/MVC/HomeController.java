package com.vipun.MVC;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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
    public String add(HttpServletRequest request){

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        int result = num1 + num2;

        HttpSession session = request.getSession();
        session.setAttribute("result",result);

        return "result.jsp";
    }

}