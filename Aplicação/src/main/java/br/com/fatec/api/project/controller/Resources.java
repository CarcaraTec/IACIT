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

    @GetMapping(value = "/perfil.html")
    public ModelAndView perfil() {
        ModelAndView andView = new ModelAndView("userPerfil.html");
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

    @GetMapping(value = "/js/selectPop.js")
    public ModelAndView selectPop() {
        ModelAndView andView = new ModelAndView("js/selectPop.js");
        return andView;
    }

    @GetMapping(value = "/js/temperaturaMinimo.js")
    public ModelAndView temperaturaMinimo() {
        ModelAndView andView = new ModelAndView("js/temperaturaMinimo.js");
        return andView;
    }

    @GetMapping(value = "/js/umidadeMin.js")
    public ModelAndView umidadeMin() {
        ModelAndView andView = new ModelAndView("js/umidadeMin.js");
        return andView;
    }

    @GetMapping(value = "/js/umidadeMax.js")
    public ModelAndView umidadeMax() {
        ModelAndView andView = new ModelAndView("js/umidadeMax.js");
        return andView;
    }

    @GetMapping(value = "/js/configNew.js")
    public ModelAndView configNew() {
        ModelAndView andView = new ModelAndView("js/configNew.js");
        return andView;
    }

    @GetMapping(value = "/js/temperaturaMaximo.js")
    public ModelAndView temperaturaMaximo() {
        ModelAndView andView = new ModelAndView("js/temperaturaMaximo.js");
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

    @GetMapping(value = "/config.js")
    public ModelAndView configjs() {
        ModelAndView andView = new ModelAndView("config.js");
        return andView;
    }

    @GetMapping(value = "/unlog.js")
    public ModelAndView unlogjs() {
        ModelAndView andView = new ModelAndView("unlog.js");
        return andView;
    }
    @GetMapping(value = "/password.html")
    public ModelAndView passwordHTML() {
        ModelAndView andView = new ModelAndView("password.html");
        return andView;
    }

    @GetMapping(value = "/configurações.html")
    public ModelAndView configuraçõeshtml() {
        ModelAndView andView = new ModelAndView("configurações.html");
        return andView;
    }

    @GetMapping(value = "/password.js")
    public ModelAndView password() {
        ModelAndView andView = new ModelAndView("password.js");
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

    @GetMapping(value = "/js/funcoesButtons.js")
    public ModelAndView funcoesButtons() {
        ModelAndView andView = new ModelAndView("js/funcoesButtons.js");
        return andView;
    }
}
