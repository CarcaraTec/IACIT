// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';


        var doc = window.location.pathname.slice(8);
        $("#select1").append("Estações:");
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
                    return fruit.codigo === dado[0];
                }
            console.log(inventory.find(isCherries));


$(document).ready(function(){
    console.log(dado[1])
    console.log("/precipitacao/"+doc+"/"+dado[1])
    $.getJSON("/precipitacao/"+dado[0]+"/"+dado[1],function(data){

    if(dado[1]!=null){

        document.getElementById("select1").innerHTML = "";
        $("#select1").append(inventory.find(isCherries).nome_estacao+" - |"+dado[0]+"|");
        $("#teste").append(inventory.find(isCherries).nome_estacao+" - |"+dado[0]+"|"+"     ("+dado[1]+")");
        $("#languages-select").append(1);

        document.getElementById('precipitacao').className = 'btn btn-xlg btn-primary waves-effect waves-light';
    }



    var arrayHora = [];
    var arrayTotal = [];

for (var i = 0; i<24; i++){
    arrayHora.push(data[i].prec_hora.slice(11, -13));
    if(data[i].prec_total==-999){
        arrayTotal.push(0);
    }else{
        arrayTotal.push(data[i].prec_total);
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
      label: "(mm)",
      lineTension: 0.3,
      backgroundColor: "rgba(2,117,216,0.2)",
      borderColor: "rgba(2,117,216,1)",
      pointRadius: 5,
      pointBackgroundColor: "rgba(2,117,216,1)",
      pointBorderColor: "rgba(255,255,255,0.8)",
      pointHoverRadius: 5,
      pointHoverBackgroundColor: "rgba(2,117,216,1)",
      pointHitRadius: 50,
      pointBorderWidth: 2,
      data: arrayTotal,
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
          min: 0,
          max: 100,
          maxTicksLimit: 24
        },
        gridLines: {
          color: "rgba(0, 0, 0, .125)",
        }
      }],
    },
    legend: {
      display: false
    }
  }
});
});
});
});
});
