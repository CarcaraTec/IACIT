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

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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
    @PersistenceContext
    private EntityManager entityManager;

    //Tela inicial
    @RequestMapping(value = "/home")
    public ModelAndView home() {
        ModelAndView andView = new ModelAndView("home");
        return andView;
    }


    //FILTRO POR ESTADO
    @GetMapping(value = "/{regiao}/{estado}")
    public List<Estacao> listarEstado(@PathVariable("regiao") String regiao, @PathVariable("estado") String estado) {
        List<Estacao> lista = repository.findByEstado(regiao, estado);
        return lista;
    }

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
//    @GetMapping(value = "/precipitacao/{estacao}/{data}/{hora}")
//    public List<Precipitacao> listarPrecData(@PathVariable("estacao") String codigo, @PathVariable("hora") String precHora, @PathVariable("data") String precData) throws ParseException {
//        SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
//        Date dataCerta = form.parse(precData);
//        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
//        Date horaCerta = formatter.parse(precHora);
//
//        List<Precipitacao> lista = precRep.findByPrecHora(dataCerta, horaCerta, codigo);
//        return lista;
//    }

    private LocalDate formataDate(Object o) {
        if (!Objects.isNull(o)) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(sdf.format((Date) o), formatter);
        }
        return null;
    }
    //------------------------RANGE------------------------//
    @GetMapping(value = "/precipitacao/range/{estacao}/{data1}/{data2}")
    public List<Precipitacao> listarRangePrecipitacao(@PathVariable("estacao") String codigo, @PathVariable("data1") String precData, @PathVariable("data2") String precData1){
        Query query = entityManager.createNativeQuery("select * from precipitacao where prec_data between '"+precData+"' and '"+precData1+"' and fk_estacao_cod_wmo = '"+codigo+"'");
        List<Object[]> rows = query.getResultList();

        List<Precipitacao> list = new ArrayList<>();

        for (Object[] obj : rows) {
            list.add(new Precipitacao(
                    (Integer) obj[0],
                    (Date) obj[1],
                    (Date)obj[2],
                    (BigDecimal) obj[3],
                    (String) obj[4]
            ));
        }
        return list;
    }
//---------------------------------------------------------------------------------------------------------------------//

    //MOSTRAR PRESSAO ATMOSFERICA
    @GetMapping(value = "/pressao/{codigo}")
    public List<PressaoAtm> listarPressao(@PathVariable("codigo") String estacao) {
        List<PressaoAtm> lista = pressaoRep.findByEstacao(estacao);
        return lista;
    }

    //FILTRAR PRESSAO POR DATA
    @GetMapping(value = "/pressao/{estacao}/{data}")
    public List<PressaoAtm> listarPressaoData(@PathVariable("estacao") String codigo, @PathVariable("data") String pressaoData) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = formatter.parse(pressaoData);
        List<PressaoAtm> lista = pressaoRep.findByPressaoData(dataCerta, codigo);
        return lista;
    }

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

    //------------------------RANGE------------------------//
    @GetMapping(value = "/pressao/range/{estacao}/{data1}/{data2}")
    public List<PressaoAtm> listarRangePressao(@PathVariable("estacao") String codigo, @PathVariable("data1") String pressaoData, @PathVariable("data2") String pressaoData1){
        Query query = entityManager.createNativeQuery("select * from pressao_atmosferica where pre_data between '"+pressaoData+"' and '"+pressaoData1+"' and fk_estacao_cod_wmo = '"+codigo+"'");
        List<Object[]> rows = query.getResultList();

        List<PressaoAtm> list = new ArrayList<>();

        for (Object[] obj : rows) {
            list.add(new PressaoAtm(
                    (Integer) obj[0],
                    (Date) obj[1],
                    (Date)obj[2],
                    (BigDecimal) obj[3],
                    (BigDecimal) obj[4],
                    (BigDecimal) obj[5],
                    (String) obj[6]
            ));
        }
        return list;
    }
//---------------------------------------------------------------------------------------------------------------------//

    //MOSTRAR RADIAÇÃO
    @GetMapping(value = "/radiacao/{codigo}")
    public List<Radiacao> listarRadiacao(@PathVariable("codigo") String estacao) {
        List<Radiacao> lista = radiacaoRep.findByEstacao(estacao);
        return lista;
    }

    //FILTRAR RADIAÇÃO POR DATA
    @GetMapping(value = "/radiacao/{estacao}/{data}")
    public List<Radiacao> listarRadiacaoData(@PathVariable("estacao") String codigo, @PathVariable("data") String radData) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = formatter.parse(radData);
        List<Radiacao> lista = radiacaoRep.findByRadData(dataCerta, codigo);
        return lista;
    }

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

    //------------------------RANGE------------------------//
    @GetMapping(value = "/radiacao/range/{estacao}/{data1}/{data2}")
    public List<Radiacao> listarRangeRadiacao(@PathVariable("estacao") String codigo, @PathVariable("data1") String pressaoData, @PathVariable("data2") String pressaoData1){
        Query query = entityManager.createNativeQuery("select * from radiacao_global where rad_data between '"+pressaoData+"' and '"+pressaoData1+"' and fk_estacao_cod_wmo = '"+codigo+"'");
        List<Object[]> rows = query.getResultList();

        List<Radiacao> list = new ArrayList<>();

        for (Object[] obj : rows) {
            list.add(new Radiacao(
                    (Integer) obj[0],
                    (Date) obj[1],
                    (Date)obj[2],
                    (BigDecimal) obj[3],
                    (String) obj[4]
            ));
        }
        return list;
    }
//---------------------------------------------------------------------------------------------------------------------//

    //MOSTRAR TEMPERATURA
    @GetMapping(value = "/temperatura/{codigo}")
    public List<Temperatura> listarTemperatura(@PathVariable("codigo") String estacao) {
        List<Temperatura> lista = tempRep.findByEstacao(estacao);
        return lista;
    }

    //FILTRAR TEMPERATURA POR DATA
    @GetMapping(value = "/temperatura/{estacao}/{data}")
    public List<Temperatura> listarTemperaturaData(@PathVariable("estacao") String codigo, @PathVariable("data") String tempData) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = formatter.parse(tempData);
        List<Temperatura> lista = tempRep.findByTempData(dataCerta, codigo);
        return lista;
    }

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

    //------------------------RANGE------------------------//
    @GetMapping(value = "/temperatura/range/{estacao}/{data1}/{data2}")
    public List<Temperatura> listarRangeTemperatura(@PathVariable("estacao") String codigo, @PathVariable("data1") String Data, @PathVariable("data2") String Data1){
        Query query = entityManager.createNativeQuery("select * from temperatura where temp_data between '"+Data+"' and '"+Data1+"' and fk_estacao_cod_wmo = '"+codigo+"'");
        List<Object[]> rows = query.getResultList();

        List<Temperatura> list = new ArrayList<>();

        for (Object[] obj : rows) {
            list.add(new Temperatura(
                    (Integer) obj[0],
                    (Date) obj[1],
                    (Date)obj[2],
                    (BigDecimal) obj[3],
                    (BigDecimal) obj[4],
                    (BigDecimal) obj[5],
                    (BigDecimal) obj[6],
                    (BigDecimal) obj[7],
                    (BigDecimal) obj[8],
                    (String) obj[9]
            ));
        }
        return list;
    }

//---------------------------------------------------------------------------------------------------------------------//

    //MOSTRAR UMIDADE
    @GetMapping(value = "/umidade/{codigo}")
    public List<Umidade> listarUmidade(@PathVariable("codigo") String estacao) {
        List<Umidade> lista = umiRep.findByEstacao(estacao);
        return lista;
    }

    //FILTRAR UMIDADE POR DATA
    @GetMapping(value = "/umidade/{estacao}/{data}")
    public List<Umidade> listarUmidadeData(@PathVariable("estacao") String codigo, @PathVariable("data") String umiData) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = formatter.parse(umiData);
        List<Umidade> lista = umiRep.findByUmiData(dataCerta, codigo);
        return lista;
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

    //------------------------RANGE------------------------//
    @GetMapping(value = "/umidade/range/{estacao}/{data1}/{data2}")
    public List<Umidade> listarRangeUmidade(@PathVariable("estacao") String codigo, @PathVariable("data1") String Data, @PathVariable("data2") String Data1){
        Query query = entityManager.createNativeQuery("select * from umidade where umi_data between '"+Data+"' and '"+Data1+"' and fk_estacao_cod_wmo = '"+codigo+"'");
        List<Object[]> rows = query.getResultList();

        List<Umidade> list = new ArrayList<>();

        for (Object[] obj : rows) {
            list.add(new Umidade(
                    (Integer) obj[0],
                    (Date) obj[1],
                    (Date)obj[2],
                    (BigDecimal) obj[3],
                    (BigDecimal) obj[4],
                    (BigDecimal) obj[5],
                    (String) obj[6]
            ));
        }
        return list;
    }

    //-----------------------------------------------------------------------------------------------------------//

    //FILTRAR TODOS POR DATA
    @GetMapping(value = "/grafico/{estacao}/{data}")
    public ModelAndView listarData(@PathVariable("estacao") String codigo, @PathVariable("data") String umiData) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = formatter.parse(umiData);
        ModelAndView andView = new ModelAndView("grafico");

        Iterable<Precipitacao> listaPrecipitacao = precRep.findByPrecData(dataCerta, codigo);
        andView.addObject("graficoPrecipitacao", listaPrecipitacao);

        Iterable<PressaoAtm> listaPressao = pressaoRep.findByPressaoData(dataCerta, codigo);
        andView.addObject("graficoPressao", listaPressao);

        Iterable<Radiacao> listaRadiacao = radiacaoRep.findByRadData(dataCerta, codigo);
        andView.addObject("graficoRadiacao", listaRadiacao);

        Iterable<Temperatura> listaTemp = tempRep.findByTempData(dataCerta, codigo);
        andView.addObject("graficoTemp", listaTemp);

        Iterable<Umidade> listaUmidade = umiRep.findByUmiData(dataCerta, codigo);
        andView.addObject("grafico", listaUmidade);

        Iterable<Vento> listaVento = ventoRep.findByVentoData(dataCerta, codigo);
        andView.addObject("graficoVento", listaVento);
        return andView;
    }

//---------------------------------------------------------------------------------------------------------------------//

    //MOSTRAR VENTO
    @GetMapping(value = "/vento/{codigo}")
    public List<Vento> listarVento(@PathVariable("codigo") String estacao) {
        List<Vento> lista = ventoRep.findByEstacao(estacao);
        return lista;
    }

    //FILTRAR VENTO POR DATA
    @GetMapping(value = "/vento/{estacao}/{data}")
    public List<Vento> listarVentoData(@PathVariable("estacao") String codigo, @PathVariable("data") String ventoData) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataCerta = formatter.parse(ventoData);
        List<Vento> lista = ventoRep.findByVentoData(dataCerta, codigo);
        return lista;
    }

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

    //------------------------RANGE------------------------//
    @GetMapping(value = "/vento/range/{estacao}/{data1}/{data2}")
    public List<Vento> listarRangeVento(@PathVariable("estacao") String codigo, @PathVariable("data1") String Data, @PathVariable("data2") String Data1){
        Query query = entityManager.createNativeQuery("select * from vento where ven_data between '"+Data+"' and '"+Data1+"' and fk_estacao_cod_wmo = '"+codigo+"'");
        List<Object[]> rows = query.getResultList();

        List<Vento> list = new ArrayList<>();

        for (Object[] obj : rows) {
            list.add(new Vento(
                    (Integer) obj[0],
                    (Date) obj[1],
                    (Date)obj[2],
                    (BigDecimal) obj[3],
                    (BigDecimal) obj[4],
                    (BigDecimal) obj[5],
                    (String) obj[6]
            ));
        }
        return list;
    }

}
//---------------------------------------------------------------------------------------------------------------------//