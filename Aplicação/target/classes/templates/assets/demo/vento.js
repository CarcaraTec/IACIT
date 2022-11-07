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
            console.log(dado[0])
if(dado[0]=="vento"){
$(document).ready(function(){
    console.log(dado[1])
    console.log("/vento/"+doc+"/"+dado[2])
    $.getJSON("/vento/"+dado[1]+"/"+dado[2],function(data){

    if(dado[1]!=null){

        document.getElementById("select1").innerHTML = "";
        $("#select1").append(inventory.find(isCherries).nome_estacao+" - |"+dado[1]+"|");
        $("#teste").append(inventory.find(isCherries).nome_estacao+" - |"+dado[1]+"|"+"     ("+dado[2]+")");

        document.getElementById('vento1').className = 'btn btn-xlg btn-primary waves-effect waves-light';
    }

    var arrayHora = [];
    var arrayTotal = [];

    var arrayPressaoEstacao = [];
    var arrayPressaoMax = [];
    var arrayPressaoMin = [];

    var arrayRadGlobal = [];

    var arrayTempAr = [];
    var arrayTempMax = [];
    var arrayTempMin = [];
    var arrayTempOrvalho = [];
    var arrayTempOrvalhoMax = [];
    var arrayTempOrvalhoMin = [];

    var arrayUmiAr = [];
    var arrayUmiMax = [];
    var arrayUmiMin = [];

    var arrayVentoRajada = [];
    var arrayVelHoraria = [];

for (var i = 0; i<24; i++){

    arrayHora.push(data[i].vento_hora.slice(11, -13));
    if(data[i].vento_rajada_max==-999){
        arrayVentoRajada.push(null);
    }else{
        arrayVentoRajada.push(data[i].vento_rajada_max);
    }

    if(data[i].vento_vel_horaria==-999){
            arrayVelHoraria.push(null);
        }else{
            arrayVelHoraria.push(data[i].vento_vel_horaria);
        }
}
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
      label: "Rajada Máxima(m/s)",
      lineTension: 0.3,
      backgroundColor: "rgba(255,99,71,0)",
      borderColor: "rgb(255,0,0)",
      pointRadius: 5,
      pointBackgroundColor: "rgb(255,0,0)",
      pointBorderColor: "rgba(255,255,255,0.8)",
      pointHoverRadius: 5,
      pointHoverBackgroundColor: "rgb(255,0,0)",
      pointHitRadius: 50,
      pointBorderWidth: 2,
      data: arrayVentoRajada,
    },
    {
          label: "Velocidade horária(m/s)",
          lineTension: 0.3,
          backgroundColor: "rgba(255,99,71,0)",
          borderColor: "rgba(2,117,216,1)",
          pointRadius: 5,
          pointBackgroundColor: "rgba(2,117,216,1)",
          pointBorderColor: "rgba(255,255,255,0.8)",
          pointHoverRadius: 5,
          pointHoverBackgroundColor: "rgba(2,117,216,1)",
          pointHitRadius: 50,
          pointBorderWidth: 2,
          data: arrayVelHoraria,
        }
    ],
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
          maxTicksLimit: 7
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
