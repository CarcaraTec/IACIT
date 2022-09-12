const formulario = document.querySelector("form");
const Iprecipitacao_total = document.querySelector(".precipitacao_total");
const Ipressao_atmosferica_ao_nivel_da_estacao_horaria = document.querySelector(".pressao_atmosferica_ao_nivel_da_estacao_horaria");
const Ipressao_atmosferica_max_hora_ant = document.querySelector(".pressao_atmosferica_max_hora_ant");
const Ipressao_atmosferica_min_hora_ant = document.querySelector(".pressao_atmosferica_min_hora_ant");
const Iradiacao_global = document.querySelector(".radiacao_global");
const Itemperatura_ar_bulbo_seco_horaria = document.querySelector(".temperatura_ar_bulbo_seco_horaria");
const Itemperatura_ponto_orvalho = document.querySelector(".temperatura_ponto_orvalho");
const Itemperatura_maxima_hora_ant = document.querySelector(".temperatura_maxima_hora_ant");
const Itemperatura_minima_hora_ant = document.querySelector(".temperatura_minima_hora_ant");
const Itemperatura_orvalho_max_hora_ant = document.querySelector(".temperatura_orvalho_max_hora_ant");
const Itemperatura_orvalho_min_hora_ant = document.querySelector(".temperatura_orvalho_min_hora_ant");
const Iumidade_rel_max_hora_ant = document.querySelector(".umidade_rel_max_hora_ant");
const Iumidade_rel_min_hora_ant = document.querySelector(".umidade_rel_min_hora_ant");
const Iumidade_relativa_ar_horaria = document.querySelector(".umidade_relativa_ar_horaria");
const Ivento_direcao_horaria = document.querySelector(".vento_direcao_horaria");
const Ivento_rajada_maxima = document.querySelector(".vento_rajada_maxima");
const Ivento_velocidade_horaria = document.querySelector(".vento_velocidade_horaria");
const Idata_hora = document.querySelector(".data_hora");
const Ifk_estacao_id_estacao = document.querySelector(".fk_estacao_id_estacao");


function cadastrar(){
    fetch("http://localhost:8080/descritivo",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            precipitacao_total: Iprecipitacao_total.value,
            pressao_atmosferica_ao_nivel_da_estacao_horaria: Ipressao_atmosferica_ao_nivel_da_estacao_horaria.value,
            pressao_atmosferica_max_hora_ant: Ipressao_atmosferica_max_hora_ant.value,
            pressao_atmosferica_min_hora_ant: Ipressao_atmosferica_min_hora_ant.value,
            radiacao_global: Iradiacao_global.value,
            temperatura_ar_bulbo_seco_horaria: Itemperatura_ar_bulbo_seco_horaria.value,
            temperatura_ponto_orvalho: Itemperatura_ponto_orvalho.value,
            temperatura_maxima_hora_ant: Itemperatura_maxima_hora_ant.value,
            temperatura_minima_hora_ant: Itemperatura_minima_hora_ant.value,
            temperatura_orvalho_max_hora_ant: Itemperatura_orvalho_max_hora_ant.value,
            temperatura_orvalho_min_hora_ant: Itemperatura_orvalho_min_hora_ant.value,
            umidade_rel_max_hora_ant: Iumidade_rel_max_hora_ant.value,
            Iumidade_rel_min_hora_ant: Iumidade_rel_min_hora_ant.value,
            umidade_relativa_ar_horaria: Iumidade_relativa_ar_horaria.value,
            vento_direcao_horaria: Ivento_direcao_horaria.value,
            vento_rajada_maxima: Ivento_rajada_maxima.value,
            vento_velocidade_horaria: Ivento_velocidade_horaria.value,
            data_hora: Idata_hora.value,
            fk_estacao_id_estacao: Ifk_estacao_id_estacao.value
        })
    })
    .then(function(res) {console.log(res) })
    .catch(function(res) {console.log(res) })
};

function limpar(){
    Iprecipitacao_total.value = "";
    Ipressao_atmosferica_ao_nivel_da_estacao_horaria.value = "";
    Ipressao_atmosferica_max_hora_ant.value = "";
    Ipressao_atmosferica_min_hora_ant.value = "";
    Iradiacao_global.value = "";
    Itemperatura_ar_bulbo_seco_horaria.value = "";
    Itemperatura_ponto_orvalho.value = "";
    Itemperatura_maxima_hora_ant.value = "";
    Itemperatura_minima_hora_ant.value = "";
    Itemperatura_orvalho_max_hora_ant.value = "";
    Itemperatura_orvalho_min_hora_ant.value = "";
    Iumidade_rel_max_hora_ant.value = "";
    Iumidade_rel_min_hora_ant.value = "";
    Iumidade_relativa_ar_horaria.value = "";
    Ivento_direcao_horaria.value = "";
    Ivento_rajada_maxima.value = "";
    Ivento_velocidade_horaria.value = "";
    Idata_hora.value = "";
    Ifk_estacao_id_estacao.value = "";
}

formulario.addEventListener('submit', function(event){
    event.preventDefault();

    cadastrar();
    limpar();
});