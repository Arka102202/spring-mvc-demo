package org.example.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomController {

    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public String showHomePage(){
        return "home-page";
    }

}
