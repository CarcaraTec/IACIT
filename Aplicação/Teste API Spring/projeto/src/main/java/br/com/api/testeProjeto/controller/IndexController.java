package br.com.api.testeProjeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;

@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index.html";
    }
}
