package com.havryliuk.springrestfulapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/Demo")
public class DemoRestController {
    //додаю гет запит за адресою api/v1/Demo/Hello
    @RequestMapping("Hello")
    String HelloDemo(){
        return "Hello world";
    }

}
