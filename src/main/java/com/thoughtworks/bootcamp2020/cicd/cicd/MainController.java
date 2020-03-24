package com.thoughtworks.bootcamp2020.cicd.cicd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(path = "/")
    public String index(){
        return "Hello World!";
    }

}
