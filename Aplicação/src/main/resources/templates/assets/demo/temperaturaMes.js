// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';


        var doc = window.location.pathname.slice(8);
        $(document).ready(function(){
            $.getJSON("/SE/SP",function(data){
                const dado = doc.split('=');
                const languagesSelect = document.getElementById("languages-select");
//                var languagesList = [];
//                for (var i = 0; i<data.length; i++){
//                languagesList.push(data[i].nome_estacao+" - |"+data[i].codigo+"|");
//                }
//                languagesList.forEach((language) => {
//                  option = new Option(language, language.toLowerCase());
//                  languagesSelect.options[languagesSelect.options.length] = option;
//                });
                const inventory = data;
                function isCherries(fruit) {
                    return fruit.codigo === dado[1];
                }

if(dado[0]=="temperatura-mes"){
$(document).ready(function(){
    $.getJSON("/temperatura/A701",function(data){
            var arrayTemperatura = [];

            var mes = dado[2];
            for (var dia = 01; dia<32; dia++){
                for(var hora = 0; hora<24; hora++){
                    if(dia<10){
                        if(hora<10){
                            function isCherries(fruit){
                            return fruit.temp_data === "2021-"+mes+"-0"+dia+"T03:00:00.000+00:00" && fruit.temp_hora === "1970-01-01T0"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayTemperatura.push(log);
                            }
                        }
                        if(hora>=10){
                            function isCherries(fruit){
                            return fruit.temp_data === "2021-"+mes+"-0"+dia+"T03:00:00.000+00:00" && fruit.temp_hora === "1970-01-01T"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayTemperatura.push(log);
                            }
                        }
                    }
                    if(dia>=10){
                        if(hora<10){
                            function isCherries(fruit){
                            return fruit.temp_data === "2021-"+mes+"-"+dia+"T03:00:00.000+00:00" &&
                            fruit.temp_hora === "1970-01-01T0"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayTemperatura.push(log);
                            }
                        }
                        if(hora>=10){
                            function isCherries(fruit){
                            return fruit.temp_data === "2021-"+mes+"-"+dia+"T03:00:00.000+00:00" &&
                            fruit.temp_hora === "1970-01-01T"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayTemperatura.push(log);
                            }
                    }
                    }
                }
            }


    var arrayHora = [];

    var arrayTempAr = [];
    var arrayTempMax = [];
    var arrayTempMin = [];
    var arrayTempOrvalho = [];
    var arrayTempOrvalhoMax = [];
    var arrayTempOrvalhoMin = [];

for (var i = 0; i<arrayTemperatura.length; i++){

    arrayHora.push(arrayTemperatura[i].temp_data.slice(0, -19)+" "+arrayTemperatura[i].temp_hora.slice(11, -13));

    if(arrayTemperatura[i].temp_ar==-999){
        arrayTempAr.push(null);
    }else{
        arrayTempAr.push(arrayTemperatura[i].temp_ar);
    }

    if(arrayTemperatura[i].temp_max==-999){
            arrayTempMax.push(null);
        }else{
            arrayTempMax.push(arrayTemperatura[i].temp_max);
        }

    if(arrayTemperatura[i].temp_min==-999){
            arrayTempMin.push(null);
        }else{
            arrayTempMin.push(arrayTemperatura[i].temp_min);
        }

    if(arrayTemperatura[i].temp_ponto_orvalho==-999){
            arrayTempOrvalho.push(null);
        }else{
            arrayTempOrvalho.push(arrayTemperatura[i].temp_ponto_orvalho);
        }

    if(arrayTemperatura[i].temp_orvalho_max==-999){
            arrayTempOrvalhoMax.push(null);
        }else{
            arrayTempOrvalhoMax.push(arrayTemperatura[i].temp_orvalho_max);
        }

    if(arrayTemperatura[i].temp_orvalho_min==-999){
            arrayTempOrvalhoMin.push(null);
        }else{
            arrayTempOrvalhoMin.push(arrayTemperatura[i].temp_orvalho_min);
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
        label: "Ar Bulbo Seco(ºC)",
              lineTension: 0.1,
              backgroundColor: "rgba(255,99,71,0)",
              borderColor: "RGBA(255,165,0,1)",
              pointRadius: 1,
              pointBackgroundColor: "RGBA(255,165,0,1)",
              pointBorderColor: "rgba(255,255,255,0.8)",
              pointHoverRadius: 1,
              pointHoverBackgroundColor: "RGBA(255,165,0,1)",
              pointHitRadius: 1,
              pointBorderWidth: 1,
              data: arrayTempAr,
            },
            {
                  label: "Máxima na hora ant.(ºC)",
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
                  data: arrayTempMax,
                },
                {
                      label: "Mínima na hora ant.(ºC)",
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
                      data: arrayTempMin,
                    },
                    {
                                  label: "Ponto de Orvalho(ºC)",
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
                                  data: arrayTempOrvalho,
                                },
                                {
                                                          label: "Orvalho Máx na hora ant.(ºC)",
                                                          lineTension: 0.1,
                                                          backgroundColor: "rgba(255,99,71,0)",
                                                          borderColor: "RGBA( 0, 100, 0, 1 )",
                                                          pointRadius: 1,
                                                          pointBackgroundColor: "RGBA( 0, 100, 0, 1 )",
                                                          pointBorderColor: "rgba(255,255,255,0.8)",
                                                          pointHoverRadius: 1,
                                                          pointHoverBackgroundColor: "RGBA( 0, 100, 0, 1 )",
                                                          pointHitRadius: 1,
                                                          pointBorderWidth: 1,
                                                          data: arrayTempOrvalhoMax,
                                                        },
                                                        {
                                                                                                          label: "Orvalho Mín na hora ant.(ºC)",
                                                                                                          lineTension: 0.1,
                                                                                                          backgroundColor: "rgba(255,99,71,0)",
                                                                                                          borderColor: "RGBA( 152, 251, 152, 1 )",
                                                                                                          pointRadius: 1,
                                                                                                          pointBackgroundColor: "RGBA( 152, 251, 152, 1 )",
                                                                                                          pointBorderColor: "rgba(255,255,255,0.8)",
                                                                                                          pointHoverRadius: 1,
                                                                                                          pointHoverBackgroundColor: "RGBA( 152, 251, 152, 1 )",
                                                                                                          pointHitRadius: 1,
                                                                                                          pointBorderWidth: 1,
                                                                                                          data: arrayTempOrvalhoMin,
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
