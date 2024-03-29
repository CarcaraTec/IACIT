// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';


        var doc = window.location.pathname.slice(8);
                $(document).ready(function(){
                    $.getJSON("/estacoes",function(data){
                        const dado = doc.split('=');
                        const languagesSelect = document.getElementById("languages-select");

        const inventory = data;
                        function isCherries(fruit) {
                            return fruit.codigo === dado[1];
                        }

if(dado[0]=="pressao"){
$(document).ready(function(){
    console.log(dado[1])
    console.log("/pressao/"+doc+"/"+dado[2])
    $.getJSON("/pressao/range/"+dado[1]+"/"+dado[2]+"/"+dado[3],function(data){

    if(dado[1]!=null){

        document.getElementById("select1").innerHTML = "";
        $("#select1").append(inventory.find(isCherries).nome_estacao+" - |"+dado[1]+"|");

        document.getElementById("selectEstado").innerHTML = "";

                $("#selectEstado").append(inventory.find(isCherries).estado);

                $(document).ready(function(){
                    $.getJSON("/estados",function(regiao){
                        function procurarEstado(estado) {
                         return estado.nome_estado === inventory.find(isCherries).estado;
                         }
                         document.getElementById("selectRegiao").innerHTML = "";
                         $("#selectRegiao").append(regiao.find(procurarEstado).regiao);

                    });
                    });

        document.getElementById('pressao1').className = 'btn btn-xlg btn-primary waves-effect waves-light';
    }

    var arrayHora = [];
    var arrayTotal = [];

    var arrayPressaoEstacao = [];
    var arrayPressaoMax = [];
    var arrayPressaoMin = [];

for (var i = 0; i<data.length; i++){

    const pressao_data = new Date(data[i].pressao_data);
    pressao_data.setDate(pressao_data.getDate()+1);
    arrayHora.push(pressao_data.toLocaleDateString("pt-BR")+" - "+data[i].pressao_hora.slice(0, -6)+"h");

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
      pointRadius: 1,
      pointBackgroundColor: "RGBA(0,128,0,1)",
      pointBorderColor: "rgba(0,128,0,1)",
      pointHoverRadius: 1,
      pointHoverBackgroundColor: "RGBA(0,128,0,1)",
      pointHitRadius: 40,
      pointBorderWidth: 1,
      data: arrayPressaoEstacao,
    },
    {
          label: "Máxima na hora ant.(mB)",
          lineTension: 0.3,
          backgroundColor: "rgba(255,99,71,0)",
          borderColor: "rgb(255,0,0)",
          pointRadius: 1,
          pointBackgroundColor: "rgb(255,0,0)",
          pointBorderColor: "rgba(255,0,0)",
          pointHoverRadius: 1,
          pointHoverBackgroundColor: "rgb(255,0,0)",
          pointHitRadius: 40,
          pointBorderWidth: 1,
          data: arrayPressaoMax,
        },
        {
              label: "Mínima na hora ant.(mB)",
              lineTension: 0.3,
              backgroundColor: "rgba(255,99,71,0)",
              borderColor: "rgba(2,117,216,1)",
              pointRadius: 1,
              pointBackgroundColor: "rgba(2,117,216,1)",
              pointBorderColor: "rgba(2,117,216,1)",
              pointHoverRadius: 1,
              pointHoverBackgroundColor: "rgba(2,117,216,1)",
              pointHitRadius: 40,
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

