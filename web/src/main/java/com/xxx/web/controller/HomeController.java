package com.xxx.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController extends BaseController {

    @RequestMapping(value = "index.html", method = RequestMethod.GET)
    public void index() {

    }

}
