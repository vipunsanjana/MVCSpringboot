package com.vipun.MVC;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String loadHome() {
        System.out.println("load home page....");
        return "index";
    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelMap modelMap){
//
//
//        int result = num1 + num2;
//
//        modelMap.addAttribute("result",result);
//
//        return "result";
//    }


    @RequestMapping("addUser")
    public String addUser(@ModelAttribute("user") User user, Model model){

        return "result";
    }


    @ModelAttribute
    public void showYear(Model model){

        model.addAttribute("year","2024");
    }

}