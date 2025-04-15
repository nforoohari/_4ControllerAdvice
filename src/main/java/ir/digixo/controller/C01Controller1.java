package ir.digixo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c1")
public class C01Controller1 {

    @GetMapping("/m1")
    public String m1() {
        return "home";
    }
}
