package com.huppert.autocode.control;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by Huppert on 2018/5/7.
 */
@RestController
public class HelloControl {

    @RequestMapping(value="hello",method = RequestMethod.GET)
    public String Hello(){
        return "hello";
    }
}
