package br.com.fatec.api.project.controller;

import com.sun.source.util.SourcePositions;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLOutput;

public class IndexController {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

}
