// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';


        var doc = window.location.pathname.slice(8);
        $(document).ready(function(){
            $.getJSON("/SE/SP",function(data){
                const dado = doc.split('=');
                const languagesSelect = document.getElementById("languages-select");
                var languagesList = [];
                for (var i = 0; i<data.length; i++){
                languagesList.push(data[i].nome_estacao+" - |"+data[i].codigo+"|");
                }
                languagesList.forEach((language) => {
                  option = new Option(language, language.toLowerCase());
                  languagesSelect.options[languagesSelect.options.length] = option;
                });
                const inventory = data;
                function isCherries(fruit) {
                    return fruit.codigo === dado[1];
                }

if(dado[0]=="pressao-mes"){
$(document).ready(function(){
    $.getJSON("/pressao/A701",function(data){
            var arrayPressao = [];

            var mes = dado[2];
            for (var dia = 01; dia<32; dia++){
                for(var hora = 0; hora<24; hora++){
                    if(dia<10){
                        if(hora<10){
                            function isCherries(fruit){
                            return fruit.pressao_data === "2021-"+mes+"-0"+dia+"T03:00:00.000+00:00" && fruit.pressao_hora === "1970-01-01T0"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayPressao.push(log);
                            }
                        }
                        if(hora>=10){
                            function isCherries(fruit){
                            return fruit.pressao_data === "2021-"+mes+"-0"+dia+"T03:00:00.000+00:00" && fruit.pressao_hora === "1970-01-01T"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayPressao.push(log);
                            }
                        }
                    }
                    if(dia>=10){
                        if(hora<10){
                            function isCherries(fruit){
                            return fruit.pressao_data === "2021-"+mes+"-"+dia+"T03:00:00.000+00:00" &&
                            fruit.pressao_hora === "1970-01-01T0"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayPressao.push(log);
                            }
                        }
                        if(hora>=10){
                            function isCherries(fruit){
                            return fruit.pressao_data === "2021-"+mes+"-"+dia+"T03:00:00.000+00:00" &&
                            fruit.pressao_hora === "1970-01-01T"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayPressao.push(log);
                            }
                    }
                    }
                }
            }


    var arrayHora = [];
    var arrayPressaoEstacao = [];
    var arrayPressaoMax = [];
    var arrayPressaoMin = [];

for (var i = 0; i<arrayPressao.length; i++){

    arrayHora.push(arrayPressao[i].pressao_data.slice(0, -19)+" "+arrayPressao[i].pressao_hora.slice(11, -13));
    if(arrayPressao[i].pressao_estacao==-999){
        arrayPressaoEstacao.push(null);
    }else{
        arrayPressaoEstacao.push(arrayPressao[i].pressao_estacao);
    }

    if(arrayPressao[i].pressao_max==-999){
            arrayPressaoMax.push(null);
        }else{
            arrayPressaoMax.push(arrayPressao[i].pressao_max);
        }

    if(arrayPressao[i].pressao_min==-999){
                arrayPressaoMin.push(null);
            }else{
                arrayPressaoMin.push(arrayPressao[i].pressao_min);
            }
}
console.log(arrayHora)
    console.log(arrayHora.length)
//card-header
// Area Chart Example
var myLineChart = 0;
var ctx = document.getElementById("myAreaChart");
myLineChart = new Chart(ctx, {
  type: 'line',
  data: {
      labels: arrayHora,
      datasets: [{
        label: "Nível da estação(mB)",
        lineTension: 0.1,
        backgroundColor: "rgba(255,99,71,0)",
        borderColor: "RGBA(0,128,0,1)",
        pointRadius: 1,
        pointBackgroundColor: "RGBA(0,128,0,1)",
        pointBorderColor: "rgba(255,255,255,0.8)",
        pointHoverRadius: 1,
        pointHoverBackgroundColor: "RGBA(0,128,0,1)",
        pointHitRadius: 1,
        pointBorderWidth: 1,
        data: arrayPressaoEstacao,
      },
      {
            label: "Máxima na hora ant.(mB)",
            lineTension: 0.1,
            backgroundColor: "rgba(255,99,71,0)",
            borderColor: "rgb(255,0,0)",
            pointRadius: 1,
            pointBackgroundColor: "rgb(255,0,0)",
            pointBorderColor: "rgba(255,255,255,0.8)",
            pointHoverRadius: 1,
            pointHoverBackgroundColor: "rgb(255,0,0)",
            pointHitRadius: 1,
            pointBorderWidth: 1,
            data: arrayPressaoMax,
          },
          {
                label: "Mínima na hora ant.(mB)",
                lineTension: 0.1,
                backgroundColor: "rgba(255,99,71,0)",
                borderColor: "rgba(2,117,216,1)",
                pointRadius: 1,
                pointBackgroundColor: "rgba(2,117,216,1)",
                pointBorderColor: "rgba(255,255,255,0.8)",
                pointHoverRadius: 1,
                pointHoverBackgroundColor: "rgba(2,117,216,1)",
                pointHitRadius: 1,
                pointBorderWidth: 1,
                data: arrayPressaoMin,
              }],
  },
  options: {
    scales: {
      xAxes: [{
        time: {
          unit: 'date'
        },
        gridLines: {
          display: false
        },
        ticks: {
          maxTicksLimit: 30
        }
      }],
      yAxes: [{
        ticks: {
          maxTicksLimit: arrayHora.length
        },
        gridLines: {
          color: "rgba(0, 0, 0, .125)",
        }
      }],
    },
    legend: {
      display: true
    }
  }
});
});
});
}
});
});
