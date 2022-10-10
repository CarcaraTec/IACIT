package br.com.fatec.api.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
