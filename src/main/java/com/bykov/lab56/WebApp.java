package com.bykov.lab56;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class WebApp {

    @GetMapping("/exchanger")
    public String printCourses() throws Exception {
        return Exchanger.getHTML("https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=5");
    }
}
