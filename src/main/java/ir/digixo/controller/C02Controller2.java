package ir.digixo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c2")
public class C02Controller2 {

    @GetMapping("/m1")
    public String m1()
    {
        return "home";
    }
}
