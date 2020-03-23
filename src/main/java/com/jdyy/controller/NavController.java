package com.jdyy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 谭俊彦
 * @version 1.0 2020-03-23 22:59
 * @description
 */
@RestController
public class NavController {

    /*
     * 注释@RestController 跳转页面就不能直接返回“index”。需要通过ModelAndView来转
     * 有文件夹前面加xx/xxxx
     * */
    @GetMapping("/nav")
    public ModelAndView navIndex(){
        return new ModelAndView("nav");
    }
}
