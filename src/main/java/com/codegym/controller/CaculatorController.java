package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaculatorController {
    @GetMapping("/bd")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @PostMapping("/home")
    public ModelAndView result(@RequestParam("number1") String number1, @RequestParam("number2") String number2, @RequestParam("aaa") String aaa) {
        ModelAndView modelAndView = new ModelAndView("home");
        float num1 = Integer.parseInt(number1);
        float num2 = Integer.parseInt(number2);
        double rs = 0;
        String mes = "";
        if (aaa.equals("Addtion")) {
            rs = num1 + num2;
            modelAndView.addObject("result", rs);
        }
        if (aaa.equals("Subtraction")) {
            rs = num1 - num2;
            modelAndView.addObject("result", rs);
        }
        if (aaa.equals("Multiplication")) {
            rs = num1 * num2;
            modelAndView.addObject("result", rs);
        }
        if (aaa.equals("Divistion")) {
            if (num2 != 0) {
                rs = num1 / num2;
                modelAndView.addObject("result", rs);
            } else {
                mes = "Mau so khac 0";
            }
        }
        modelAndView.addObject("mes", mes);
        return modelAndView;
    }
}
