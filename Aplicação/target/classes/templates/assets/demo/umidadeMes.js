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

if(dado[0]=="umidade-mes"){
$(document).ready(function(){
    $.getJSON("/umidade/A701",function(data){
            var arrayUmidade = [];

            var mes = dado[2];
            for (var dia = 01; dia<32; dia++){
                for(var hora = 0; hora<24; hora++){
                    if(dia<10){
                        if(hora<10){
                            function isCherries(fruit){
                            return fruit.umi_data === "2021-"+mes+"-0"+dia+"T03:00:00.000+00:00" && fruit.umi_hora === "1970-01-01T0"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayUmidade.push(log);
                            }
                        }
                        if(hora>=10){
                            function isCherries(fruit){
                            return fruit.umi_data === "2021-"+mes+"-0"+dia+"T03:00:00.000+00:00" && fruit.umi_hora === "1970-01-01T"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayUmidade.push(log);
                            }
                        }
                    }
                    if(dia>=10){
                        if(hora<10){
                            function isCherries(fruit){
                            return fruit.umi_data === "2021-"+mes+"-"+dia+"T03:00:00.000+00:00" &&
                            fruit.umi_hora === "1970-01-01T0"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayUmidade.push(log);
                            }
                        }
                        if(hora>=10){
                            function isCherries(fruit){
                            return fruit.umi_data === "2021-"+mes+"-"+dia+"T03:00:00.000+00:00" &&
                            fruit.umi_hora === "1970-01-01T"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayUmidade.push(log);
                            }
                    }
                    }
                }
            }


    var arrayHora = [];
    var arrayUmiAr = [];
    var arrayUmiMax = [];
    var arrayUmiMin = [];

for (var i = 0; i<arrayUmidade.length; i++){

    arrayHora.push(arrayUmidade[i].umi_data.slice(0, -19)+" "+arrayUmidade[i].umi_hora.slice(11, -13));
    if(arrayUmidade[i].umi_ar==-999){
        arrayUmiAr.push(null);
    }else{
        arrayUmiAr.push(arrayUmidade[i].umi_ar);
    }

    if(arrayUmidade[i].umi_max==-999){
            arrayUmiMax.push(null);
        }else{
            arrayUmiMax.push(arrayUmidade[i].umi_max);
        }

    if(arrayUmidade[i].umi_min==-999){
                arrayUmiMin.push(null);
            }else{
                arrayUmiMin.push(arrayUmidade[i].umi_min);
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
        label: "Ar(%)",
              lineTension: 0.1,
              backgroundColor: "rgba(255,99,71,0)",
              borderColor: "rgba(255,140,0,1)",
              pointRadius: 1,
              pointBackgroundColor: "rgba(255,140,0,1)",
              pointBorderColor: "rgba(255,255,255,0.8)",
              pointHoverRadius: 1,
              pointHoverBackgroundColor: "rgba(255,140,0,1)",
              pointHitRadius: 1,
              pointBorderWidth: 1,
              data: arrayUmiAr,
            },
            {
                  label: "Máxima(%)",
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
                  data: arrayUmiMax,
                },
                {
                      label: "Mínima(%)",
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
                      data: arrayUmiMin,
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
