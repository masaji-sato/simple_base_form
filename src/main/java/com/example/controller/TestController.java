package com.example.controller;

import com.example.model.A;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class TestController {

    @GetMapping(value = "/test")
    String getTest(@ModelAttribute A a, Model model) {
        model.addAttribute("a", new A());
        return "test";
    }

    @PostMapping(value = "/test")
    String postTest(@ModelAttribute @Valid A a, BindingResult bindingResult,
                    Model model) {
        return "test";
    }
}
