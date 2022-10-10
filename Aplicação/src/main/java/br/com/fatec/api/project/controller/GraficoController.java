package br.com.fatec.api.project.controller;

import br.com.fatec.api.project.model.Umidade;
import br.com.fatec.api.project.repository.UmidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class GraficoController {

    @Autowired
    private UmidadeRepository umiRep;

    @RequestMapping("/teste")
    public ModelAndView mostraTeste() {
        ModelAndView andView = new ModelAndView("teste");
        return andView;
    }
}
