package com.somethingelse.somethingelseapp.controllers;

import com.somethingelse.somethingelseapp.services.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SomeController {
    private SomeService someService;

    @Autowired
    public SomeController(SomeService someService) {
        this.someService = someService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", someService.getJoke());
        return "SomeView";
    }
}
