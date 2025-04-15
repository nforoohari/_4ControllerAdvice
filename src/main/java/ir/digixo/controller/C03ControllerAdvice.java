package ir.digixo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
// Global controller
// @ExceptionHandler,
// @InitBinder, or
// @ModelAttribute methods to be shared across multiple @Controller classes.
@RequestMapping("/")
public class C03ControllerAdvice {

    @ModelAttribute(name = "p")
    public String addAttribute() {
        return "Bita";
    }
}
