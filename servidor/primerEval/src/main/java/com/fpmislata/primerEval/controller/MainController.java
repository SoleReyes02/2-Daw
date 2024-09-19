package com.fpmislata.primerEval.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @GetMapping
    public void index(){
        System.out.println("index option");
    }
    @GetMapping("/books")
    public void books(){
        System.out.println("books option");
    }
    @GetMapping("/books/{id}")
    public void book(@PathVariable int id){
        System.out.println("books option "+ id);
    }

}
