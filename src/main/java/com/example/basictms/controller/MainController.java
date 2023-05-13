package com.example.basictms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MainController {
    @RequestMapping(path = "/",method = RequestMethod.GET)
    public ModelAndView getMainPage() {
        ModelAndView modelAndView = new ModelAndView("main-page.html");
        return modelAndView;
    }
}
