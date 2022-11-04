package br.com.fatec.api.project.controller;

import br.com.fatec.api.project.crud.Conexao;
import br.com.fatec.api.project.model.*;
import br.com.fatec.api.project.repository.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin("*")

public class HomeController extends Conexao {

    @Autowired
    private EstacaoRepository repository;
    @Autowired
    private PrecipitacaoRepository precRep;
    @Autowired
    private EstadoRepository EstRep;
    @Autowired
    private PressaoAtmRepository pressaoRep;
    @Autowired
    private RadiacaoRepository radiacaoRep;
    @Autowired
    private TemperaturaRepository tempRep;
    @Autowired
    private UmidadeRepository umiRep;
    @Autowired
    private VentoRepository ventoRep;

    //Tela inicial
    @RequestMapping(value = "/home")
    public ModelAndView home() {
        ModelAndView andView = new ModelAndView("home");
        return andView;
    }

    //FILTRO DE ESTADOS POR REGIÃO
    @RequestMapping(method = RequestMethod.GET, value = "/{regiao}")
    public ModelAndView estados(@PathVariable("regiao") String regiao) {
        Iterable<Estado> lista = EstRep.findByRegiao(regiao);
        System.out.println(lista);
        ModelAndView andView = new ModelAndView("estados");
        andView.addObject("estados",lista);
        return andView;
    }
    //FILTRO POR ESTADO
    @GetMapping(value = "/{regiao}/{estado}")
    public List<Estacao> listarEstado(@PathVariable("regiao") String regiao, @PathVariable("estado") String estado) {
        List<Estacao> lista = repository.findByEstado(regiao, estado);
        return lista;
    }

    /*@GetMapping(value = "/{regiao}/{estado}/{estacao}/precipitacao")
    public List<Precipitacao> listarEstacao(@PathVariable("regiao") String regiao,@PathVariable("estado") String estado, @PathVariable("estacao") String estacao){
        List<Precipitacao> lista = precRep.findByEstacao(regiao, estado, estacao);
        return lista;
    }*/

//---------------------------------------------------------------------------------------------------------------------//

    //MOSTRAR PRECIPITACAO
    @GetMapping(value = "/precipitacao/{codigo}")
    public List<Precipitacao> listarPrec(@PathVariable("codigo") String estacao) {
        List<Precipitacao> lista = precRep.findByEstacao(estacao);
        return lista;
    }
    //FILTRAR PRECIPITACAO POR DATA
    @GetMapping(value = "/precipitacao/{estacao}/{data}")
    public List<Precipitacao> listarPrecData(@PathVariable("estacao") String codigo, @PathVariable("data") String precData) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = formatter.parse(precData);
        List<Precipitacao> lista = precRep.findByPrecData(dataCerta, codigo);
        return lista;
    }
    //FILTRAR PRECIPITACAO POR DATA/HORA
    @GetMapping(value = "/precipitacao/{estacao}/{data}/{hora}")
    public List<Precipitacao> listarPrecData(@PathVariable("estacao") String codigo, @PathVariable("hora") String precHora, @PathVariable("data") String precData) throws ParseException {
        SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = form.parse(precData);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date horaCerta = formatter.parse(precHora);

        List<Precipitacao> lista = precRep.findByPrecHora(dataCerta, horaCerta, codigo);
        return lista;
    }

//---------------------------------------------------------------------------------------------------------------------//

    //MOSTRAR PRESSAO ATMOSFERICA
    @GetMapping(value = "/pressao/{codigo}")
    public List<PressaoAtm> listarPressao(@PathVariable("codigo") String estacao) {
        List<PressaoAtm> lista = pressaoRep.findByEstacao(estacao);
        return lista;
    }
    //FILTRAR PRESSAO POR DATA
    /*@GetMapping(value = "/pressao/{estacao}/{data}")
    public List<PressaoAtm> listarPressaoData(@PathVariable("estacao") String codigo, @PathVariable("data") String pressaoData) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = formatter.parse(pressaoData);
        List<PressaoAtm> lista = pressaoRep.findByPressaoData(dataCerta, codigo);
        return lista;
    }*/
    //FILTRAR PRESSAO POR DATA/HORA
    @GetMapping(value = "/pressao/{estacao}/{data}/{hora}")
    public List<PressaoAtm> listarPressaoHora(@PathVariable("estacao") String codigo, @PathVariable("hora") String pressaoHora, @PathVariable("data") String pressaoData) throws ParseException {
        SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = form.parse(pressaoData);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date horaCerta = formatter.parse(pressaoHora);

        List<PressaoAtm> lista = pressaoRep.findByPressaoHora(dataCerta, horaCerta, codigo);
        return lista;
    }

//---------------------------------------------------------------------------------------------------------------------//

    //MOSTRAR RADIAÇÃO
    @GetMapping(value = "/radiacao/{codigo}")
    public List<Radiacao> listarRadiacao(@PathVariable("codigo") String estacao) {
        List<Radiacao> lista = radiacaoRep.findByEstacao(estacao);
        return lista;
    }
    //FILTRAR RADIAÇÃO POR DATA
    /*@GetMapping(value = "/radiacao/{estacao}/{data}")
    public List<Radiacao> listarRadiacaoData(@PathVariable("estacao") String codigo, @PathVariable("data") String radData) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = formatter.parse(radData);
        List<Radiacao> lista = radiacaoRep.findByRadData(dataCerta, codigo);
        return lista;
    }*/
    //FILTRAR RADIAÇÃO POR DATA/HORA
    @GetMapping(value = "/radiacao/{estacao}/{data}/{hora}")
    public List<Radiacao> listarRadiacaoHora(@PathVariable("estacao") String codigo, @PathVariable("hora") String radHora, @PathVariable("data") String radData) throws ParseException {
        SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = form.parse(radData);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date horaCerta = formatter.parse(radHora);

        List<Radiacao> lista = radiacaoRep.findByRadHora(dataCerta, horaCerta, codigo);
        return lista;
    }

//---------------------------------------------------------------------------------------------------------------------//

    //MOSTRAR TEMPERATURA
    @GetMapping(value = "/temperatura/{codigo}")
    public List<Temperatura> listarTemperatura(@PathVariable("codigo") String estacao) {
        List<Temperatura> lista = tempRep.findByEstacao(estacao);
        return lista;
    }
    //FILTRAR TEMPERATURA POR DATA
    /*@GetMapping(value = "/temperatura/{estacao}/{data}")
    public List<Temperatura> listarTemperaturaData(@PathVariable("estacao") String codigo, @PathVariable("data") String tempData) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = formatter.parse(tempData);
        List<Temperatura> lista = tempRep.findByTempData(dataCerta, codigo);
        return lista;
    }*/
    //FILTRAR TEMPERATURA POR DATA/HORA
    @GetMapping(value = "/temperatura/{estacao}/{data}/{hora}")
    public List<Temperatura> listarTemperaturaHora(@PathVariable("estacao") String codigo, @PathVariable("hora") String tempHora, @PathVariable("data") String tempData) throws ParseException {
        SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = form.parse(tempData);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date horaCerta = formatter.parse(tempHora);
        List<Temperatura> lista = tempRep.findByTempHora(dataCerta, horaCerta, codigo);
        return lista;
    }

//---------------------------------------------------------------------------------------------------------------------//

    //MOSTRAR UMIDADE
    @GetMapping(value = "/umidade/{codigo}")
    public List<Umidade> listarUmidade(@PathVariable("codigo") String estacao) {
        List<Umidade> lista = umiRep.findByEstacao(estacao);
        return lista;
    }
    //FILTRAR TODOS POR DATA
    @GetMapping(value = "/grafico/{estacao}/{data}")
    public ModelAndView listarData(@PathVariable("estacao") String codigo, @PathVariable("data") String umiData) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = formatter.parse(umiData);
        ModelAndView andView = new ModelAndView("grafico");

        Iterable<Precipitacao> listaPrecipitacao = precRep.findByPrecData(dataCerta, codigo);
        andView.addObject("graficoPrecipitacao",listaPrecipitacao);

        Iterable<PressaoAtm> listaPressao = pressaoRep.findByPressaoData(dataCerta, codigo);
        andView.addObject("graficoPressao",listaPressao);

        Iterable<Radiacao> listaRadiacao = radiacaoRep.findByRadData(dataCerta, codigo);
        andView.addObject("graficoRadiacao",listaRadiacao);

        Iterable<Temperatura> listaTemp = tempRep.findByTempData(dataCerta, codigo);
        andView.addObject("graficoTemp",listaTemp);

        Iterable<Umidade> listaUmidade = umiRep.findByUmiData(dataCerta, codigo);
        andView.addObject("grafico",listaUmidade);

        Iterable<Vento> listaVento = ventoRep.findByVentoData(dataCerta, codigo);
        andView.addObject("graficoVento",listaVento);
        return andView;
    }
    //FILTRAR UMIDADE POR DATA/HORA
    @GetMapping(value = "/umidade/{estacao}/{data}/{hora}")
    public List<Umidade> listarUmidadeHora(@PathVariable("estacao") String codigo, @PathVariable("hora") String umiHora, @PathVariable("data") String umiData) throws ParseException {
        SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = form.parse(umiData);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date horaCerta = formatter.parse(umiHora);

        List<Umidade> lista = umiRep.findByUmiHora(dataCerta, horaCerta, codigo);
        return lista;
    }
//---------------------------------------------------------------------------------------------------------------------//

    //MOSTRAR VENTO
    @GetMapping(value = "/vento/{codigo}")
    public List<Vento> listarVento(@PathVariable("codigo") String estacao) {
        List<Vento> lista = ventoRep.findByEstacao(estacao);
        return lista;
    }
    //FILTRAR VENTO POR DATA
    /*@GetMapping(value = "/vento/{estacao}/{data}")
    public ModelAndView listarVentoData(@PathVariable("estacao") String codigo, @PathVariable("data") String ventoData) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = formatter.parse(ventoData);
        ModelAndView andView = new ModelAndView("grafico");
        Iterable<Vento> lista = ventoRep.findByVentoData(dataCerta, codigo);
        andView.addObject("graficoVento",lista);
        return andView;
    }*/
    //FILTRAR VENTO POR DATA/HORA
    @GetMapping(value = "/vento/{estacao}/{data}/{hora}")
    public List<Vento> listarVentoHora(@PathVariable("estacao") String codigo, @PathVariable("hora") String ventoHora, @PathVariable("data") String ventoData) throws ParseException {
        SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = form.parse(ventoData);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date horaCerta = formatter.parse(ventoHora);

        List<Vento> lista = ventoRep.findByVentoHora(dataCerta, horaCerta, codigo);
        return lista;
    }

    @GetMapping (value = "/index.html")
    public ModelAndView template (){
        ModelAndView andView = new ModelAndView("index");
        return andView;
    }
    @GetMapping (value = "/css/styles.css")
    public ModelAndView css (){
        ModelAndView andView = new ModelAndView("css/styles.css");
        return andView;
    }
    @GetMapping (value = "/js/datatables-simple-demo.js")
    public ModelAndView simpledemo (){
        ModelAndView andView = new ModelAndView("js/datatables-simple-demo.js");
        return andView;
    }
    @GetMapping (value = "/js/scripts.js")
    public ModelAndView scripts (){
        ModelAndView andView = new ModelAndView("js/scripts.js");
        return andView;
    }
    @GetMapping (value = "/assets/demo/chart-area-demo.js")
    public ModelAndView chartarea (){
        ModelAndView andView = new ModelAndView("assets/demo/chart-area-demo.js");
        return andView;
    }
    @GetMapping (value = "/assets/demo/datatables-demo.js")
    public ModelAndView datatables (){
        ModelAndView andView = new ModelAndView("assets/demo/datatables-demo.js");
        return andView;
    }
    @GetMapping (value = "/charts={codigo}")
    public ModelAndView chartsEs (@PathVariable("codigo") String estacao){
        ModelAndView andView = new ModelAndView("charts");
        return andView;
    }
    @GetMapping (value = "/charts.html")
    public ModelAndView charts (){
        ModelAndView andView = new ModelAndView("charts.html");
        return andView;
    }
    @GetMapping("/getValorMensalidade")
    public ResponseEntity<?> getValorMensalidade(){
        Conexao1 conexao = new Conexao1();
        return ResponseEntity.ok(Conexao1.postDados("https://uctdemo.bitrix24.com/rest/448/mh895nfply8yvk9z/crm.lead.add.json?FIELDS[SECOND NAME]=sadasdas&FIELDS[NAME]=da&FIELDS[LEAD NAME]=","a"));
    }
//---------------------------------------------------------------------------------------------------------------------//
}