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

if(dado[0]=="radiacao-mes"){
$(document).ready(function(){
    $.getJSON("/radiacao/A701",function(data){
            var arrayRadiacao = [];

            var mes = dado[2];
            for (var dia = 01; dia<32; dia++){
                for(var hora = 0; hora<24; hora++){
                    if(dia<10){
                        if(hora<10){
                            function isCherries(fruit){
                            return fruit.rad_data === "2021-"+mes+"-0"+dia+"T03:00:00.000+00:00" && fruit.rad_hora === "1970-01-01T0"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayRadiacao.push(log);
                            }
                        }
                        if(hora>=10){
                            function isCherries(fruit){
                            return fruit.rad_data === "2021-"+mes+"-0"+dia+"T03:00:00.000+00:00" && fruit.rad_hora === "1970-01-01T"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayRadiacao.push(log);
                            }
                        }
                    }
                    if(dia>=10){
                        if(hora<10){
                            function isCherries(fruit){
                            return fruit.rad_data === "2021-"+mes+"-"+dia+"T03:00:00.000+00:00" &&
                            fruit.rad_hora === "1970-01-01T0"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayRadiacao.push(log);
                            }
                        }
                        if(hora>=10){
                            function isCherries(fruit){
                            return fruit.rad_data === "2021-"+mes+"-"+dia+"T03:00:00.000+00:00" &&
                            fruit.rad_hora === "1970-01-01T"+hora+":00:00.000+00:00";
                            }
                            var log = data.find(isCherries);
                            if(log === undefined){
                            }else{
                            arrayRadiacao.push(log);
                            }
                    }
                    }
                }
            }


    var arrayHora = [];
    var arrayRadGlobal = [];

for (var i = 0; i<arrayRadiacao.length; i++){

    arrayHora.push(arrayRadiacao[i].rad_data.slice(0, -19)+" "+arrayRadiacao[i].rad_hora.slice(11, -13));
    if(arrayRadiacao[i].rad_global==-999){
        arrayRadGlobal.push(null);
    }else{
        arrayRadGlobal.push(arrayRadiacao[i].rad_global);
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
      label: "Radiação Global(Kj/m²)",
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
      data: arrayRadGlobal,
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
          min: 0,
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
