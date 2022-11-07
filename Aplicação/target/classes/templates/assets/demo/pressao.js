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
if(dado[0]=="pressao"){
$(document).ready(function(){
    console.log(dado[1])
    console.log("/pressao/"+doc+"/"+dado[2])
    $.getJSON("/pressao/"+dado[1]+"/"+dado[2],function(data){

    if(dado[1]!=null){

        document.getElementById("select1").innerHTML = "";
        $("#select1").append(inventory.find(isCherries).nome_estacao+" - |"+dado[1]+"|");
        $("#teste").append(inventory.find(isCherries).nome_estacao+" - |"+dado[1]+"|"+"     ("+dado[2]+")");

        document.getElementById('pressao1').className = 'btn btn-xlg btn-primary waves-effect waves-light';
    }

    var arrayHora = [];
    var arrayTotal = [];

    var arrayPressaoEstacao = [];
    var arrayPressaoMax = [];
    var arrayPressaoMin = [];

for (var i = 0; i<24; i++){

    arrayHora.push(data[i].pressao_hora.slice(11, -13));

    if(data[i].pressao_estacao==-999){
        arrayPressaoEstacao.push(null);
    }else{
        arrayPressaoEstacao.push(data[i].pressao_estacao);
    }

    if(data[i].pressao_max==-999){
            arrayPressaoMax.push(null);
        }else{
            arrayPressaoMax.push(data[i].pressao_max);
        }

    if(data[i].pressao_min==-999){
                arrayPressaoMin.push(null);
            }else{
                arrayPressaoMin.push(data[i].pressao_min);
            }
}
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
      lineTension: 0.3,
      backgroundColor: "rgba(255,99,71,0)",
      borderColor: "RGBA(0,128,0,1)",
      pointRadius: 5,
      pointBackgroundColor: "RGBA(0,128,0,1)",
      pointBorderColor: "rgba(255,255,255,0.8)",
      pointHoverRadius: 5,
      pointHoverBackgroundColor: "RGBA(0,128,0,1)",
      pointHitRadius: 50,
      pointBorderWidth: 2,
      data: arrayPressaoEstacao,
    },
    {
          label: "Máxima na hora ant.(mB)",
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
          data: arrayPressaoMax,
        },
        {
              label: "Mínima na hora ant.(mB)",
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
          maxTicksLimit: 7
        }
      }],
      yAxes: [{
        ticks: {
          maxTicksLimit: 24
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
