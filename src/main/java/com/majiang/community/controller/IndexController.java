package com.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(@RequestParam(name="name",required = false,defaultValue ="IT")String name,
    Model model){
        model.addAttribute("name",name);
        return "Index";
    }
}
