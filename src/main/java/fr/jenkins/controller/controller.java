package fr.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:
 * @description:
 * @author: M. Maxiaoyu
 * @create: 2019-01-24 16:31
 **/
@RestController
@RequestMapping("/info")
public class controller {
    @RequestMapping("/")
    public String affich(){
        return "hello jenkins";
    }
}
