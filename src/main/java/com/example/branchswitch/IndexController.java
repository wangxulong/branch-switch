package com.example.branchswitch;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    public String index(){
        return "3";
    }
}
