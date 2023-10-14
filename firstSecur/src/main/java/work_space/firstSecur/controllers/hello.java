package work_space.firstSecur.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {
    @GetMapping("/hello")
    public String helloWorld() {
        return "hello";
    }
}
