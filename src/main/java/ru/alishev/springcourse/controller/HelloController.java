package ru.alishev.springcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "surname", required = false) String surname,
                           Model model){
    //    System.out.println(name + " " + surname);
        model.addAttribute("message", "Hello " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }
    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") int a,
                             @RequestParam("b") String b,
                             @RequestParam("c") int c,
                             Model model){

        double result;

        switch (b){
            case "miltip": result = a * c;
            break;
            case "div": result = a / (double)c;
            break;
            case "subs": result = a - c;
            break;
            case "add": result = a + c;
            break;
            default: result = 0;
        }

        model.addAttribute("result",result);

        return "first/calculator";
    }
}
