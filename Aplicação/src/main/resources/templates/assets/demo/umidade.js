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
if(dado[0]=="umidade"){
$(document).ready(function(){
    console.log(dado[1])
    console.log("/umidade/"+doc+"/"+dado[2])
    $.getJSON("/umidade/"+dado[1]+"/"+dado[2],function(data){

    if(dado[1]!=null){

        document.getElementById("select1").innerHTML = "";
        $("#select1").append(inventory.find(isCherries).nome_estacao+" - |"+dado[1]+"|");
        $("#teste").append(inventory.find(isCherries).nome_estacao+" - |"+dado[1]+"|"+"     ("+dado[2]+")");

        document.getElementById('umidade1').className = 'btn btn-xlg btn-primary waves-effect waves-light';
    }

    var arrayHora = [];
    var arrayTotal = [];

    var arrayUmiAr = [];
    var arrayUmiMax = [];
    var arrayUmiMin = [];


for (var i = 0; i<24; i++){

    arrayHora.push(data[i].umi_hora.slice(11, -13));
    if(data[i].umi_ar==-999){
        arrayUmiAr.push(null);
    }else{
        arrayUmiAr.push(data[i].umi_ar);
    }

    if(data[i].umi_max==-999){
            arrayUmiMax.push(null);
        }else{
            arrayUmiMax.push(data[i].umi_max);
        }

    if(data[i].umi_min==-999){
            arrayUmiMin.push(null);
        }else{
            arrayUmiMin.push(data[i].umi_min);
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
      label: "Ar(%)",
      lineTension: 0.3,
      backgroundColor: "rgba(255,99,71,0)",
      borderColor: "rgba(255,140,0,1)",
      pointRadius: 5,
      pointBackgroundColor: "rgba(255,140,0,1)",
      pointBorderColor: "rgba(255,255,255,0.8)",
      pointHoverRadius: 5,
      pointHoverBackgroundColor: "rgba(255,140,0,1)",
      pointHitRadius: 50,
      pointBorderWidth: 2,
      data: arrayUmiAr,
    },
    {
          label: "Máxima(%)",
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
          data: arrayUmiMax,
        },
        {
              label: "Mínima(%)",
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
