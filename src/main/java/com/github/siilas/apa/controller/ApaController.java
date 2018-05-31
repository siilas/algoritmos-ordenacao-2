package com.github.siilas.apa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.github.siilas.apa.model.Informacoes;
import com.github.siilas.apa.strategy.ProblemasStrategy;

@Controller
public class ApaController {

    @Autowired
    private ProblemasStrategy strategy;
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @PostMapping("/")
    public String resolver(@Valid Informacoes informacoes, BindingResult result, Model model) {
        if (!result.hasErrors()) {
            strategy.getStrategy(informacoes.getProblema()).resolver(informacoes);
        }
        return "index";
    }
    
}
