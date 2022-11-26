package br.com.fatec.api.project.controller;

import br.com.fatec.api.project.repository.UmidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Resources {


    //--------------------------------------------MAPEAMENTO DE HTMLS CSS E JS------------------------------------------//
    @GetMapping(value = "/index.html")
    public ModelAndView template() {
        ModelAndView andView = new ModelAndView("index");
        return andView;
    }

    @GetMapping(value = "/css/styles.css")
    public ModelAndView css() {
        ModelAndView andView = new ModelAndView("css/styles.css");
        return andView;
    }

    @GetMapping(value = "/js/datatables-simple-demo.js")
    public ModelAndView simpledemo() {
        ModelAndView andView = new ModelAndView("js/datatables-simple-demo.js");
        return andView;
    }

    @GetMapping(value = "/js/scripts.js")
    public ModelAndView scripts() {
        ModelAndView andView = new ModelAndView("js/scripts.js");
        return andView;
    }

    @GetMapping(value = "/assets/demo/chart-area-demo.js")
    public ModelAndView chartarea() {
        ModelAndView andView = new ModelAndView("assets/demo/chart-area-demo.js");
        return andView;
    }

    @GetMapping(value = "/assets/demo/datatables-demo.js")
    public ModelAndView datatables() {
        ModelAndView andView = new ModelAndView("assets/demo/datatables-demo.js");
        return andView;
    }

    @GetMapping(value = "/charts={codigo}")
    public ModelAndView chartsEs(@PathVariable("codigo") String estacao) {
        ModelAndView andView = new ModelAndView("charts");
        return andView;
    }

    @GetMapping(value = "/charts.html")
    public ModelAndView charts() {
        ModelAndView andView = new ModelAndView("charts.html");
        return andView;
    }

    @GetMapping(value = "/tables.html")
    public ModelAndView tables() {
        ModelAndView andView = new ModelAndView("tables.html");
        return andView;
    }

    @GetMapping(value = "/register.html")
    public ModelAndView register() {
        ModelAndView andView = new ModelAndView("register.html");
        return andView;
    }

    @GetMapping(value = "/login.html")
    public ModelAndView login() {
        ModelAndView andView = new ModelAndView("login.html");
        return andView;
    }

    @GetMapping(value = "/register.js")
    public ModelAndView registerjs() {
        ModelAndView andView = new ModelAndView("register.js");
        return andView;
    }

    @GetMapping(value = "/log.js")
    public ModelAndView logjs() {
        ModelAndView andView = new ModelAndView("log.js");
        return andView;
    }

    @GetMapping(value = "/unlog.js")
    public ModelAndView unlogjs() {
        ModelAndView andView = new ModelAndView("unlog.js");
        return andView;
    }

    @GetMapping(value = "/assets/demo/pressao.js")
    public ModelAndView pressaoarea() {
        ModelAndView andView = new ModelAndView("assets/demo/pressao.js");
        return andView;
    }

    @GetMapping(value = "/assets/demo/radiacao.js")
    public ModelAndView radiacaoarea() {
        ModelAndView andView = new ModelAndView("assets/demo/radiacao.js");
        return andView;
    }

    @GetMapping(value = "/assets/demo/temperatura.js")
    public ModelAndView temperaturaarea() {
        ModelAndView andView = new ModelAndView("assets/demo/temperatura.js");
        return andView;
    }

    @GetMapping(value = "/assets/demo/umidade.js")
    public ModelAndView umidadearea() {
        ModelAndView andView = new ModelAndView("assets/demo/umidade.js");
        return andView;
    }

    @GetMapping(value = "/assets/demo/vento.js")
    public ModelAndView ventoarea() {
        ModelAndView andView = new ModelAndView("assets/demo/vento.js");
        return andView;
    }

    @GetMapping(value = "/assets/demo/pressaoMes.js")
    public ModelAndView pressaoMesArea() {
        ModelAndView andView = new ModelAndView("assets/demo/pressaoMes.js");
        return andView;
    }

    @GetMapping(value = "/assets/demo/radiacaoMes.js")
    public ModelAndView radiacaoMesArea() {
        ModelAndView andView = new ModelAndView("assets/demo/radiacaoMes.js");
        return andView;
    }

    @GetMapping(value = "/assets/demo/temperaturaMes.js")
    public ModelAndView temperaturaMesArea() {
        ModelAndView andView = new ModelAndView("assets/demo/temperaturaMes.js");
        return andView;
    }

    @GetMapping(value = "/assets/demo/umidadeMes.js")
    public ModelAndView umidadeMesArea() {
        ModelAndView andView = new ModelAndView("assets/demo/umidadeMes.js");
        return andView;
    }

    @GetMapping(value = "/assets/demo/ventoMes.js")
    public ModelAndView ventoJaneiroarea() {
        ModelAndView andView = new ModelAndView("assets/demo/ventoMes.js");
        return andView;
    }
    @GetMapping(value = "/assets/demo/precipitacaoMes.js")
    public ModelAndView precMesArea() {
        ModelAndView andView = new ModelAndView("assets/demo/precipitacaoMes.js");
        return andView;
    }

    @GetMapping(value = "/js/funcoesButtons.js")
    public ModelAndView funcoesButtons() {
        ModelAndView andView = new ModelAndView("js/funcoesButtons.js");
        return andView;
    }
}
