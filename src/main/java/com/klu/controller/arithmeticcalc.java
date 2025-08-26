package com.klu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class arithmeticcalc {

    @GetMapping("add/{A}/{B}")
    public String add(@PathVariable("A") int a, @PathVariable("B") int b) {
        return ""+(a + b);
    }

    @GetMapping("sub/{A}/{B}")
    public String sub(@PathVariable("A") int a, @PathVariable("B") int b) {
        return (a - b);
    }

    @GetMapping("mul/{A}/{B}")
    public String mul(@PathVariable("A") int a, @PathVariable("B") int b) {
        return (a * b);
    }

    @GetMapping("div/{A}/{B}")
    public String div(@PathVariable("A") int a, @PathVariable("B") int b) {
        if (b == 0) {
            return "Error: Division by zero is not allowed!";
        }
        double result = (double) a / b;
        return result;
    }
}
