package com.mycom.water.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanss  Date 2018/10/16
 */
@Controller
public class WelcomeController {

    @RequestMapping(value = "/water", method = RequestMethod.GET)
    public String welcome(){
        return "welcome";
    }
}
