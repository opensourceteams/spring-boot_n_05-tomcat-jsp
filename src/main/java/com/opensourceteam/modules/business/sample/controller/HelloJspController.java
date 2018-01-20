package com.opensourceteam.modules.business.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 开发人:刘文
 * 日期:  2017/11/25.
 * 功能描述:
 */
@Controller
@RequestMapping("/jsp")
public class HelloJspController {

    Logger logger = LoggerFactory.getLogger(HelloJspController.class);

    @RequestMapping("/hello")
    String hello(String message) {

        return "hello";
    }


}
