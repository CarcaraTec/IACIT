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
if(dado[0]=="vento"){
$(document).ready(function(){
    console.log(dado[1])
    console.log("/vento/"+doc+"/"+dado[2])
    $.getJSON("/vento/range/"+dado[1]+"/"+dado[2]+"/"+dado[3],function(data){

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
        document.getElementById('vento1').className = 'btn btn-xlg btn-primary waves-effect waves-light';
    }

    var arrayHora = [];
    var arrayTotal = [];

    var arrayVentoRajada = [];
    var arrayVelHoraria = [];

for (var i = 0; i<data.length; i++){

    const vento_data = new Date(data[i].vento_data);
    vento_data.setDate(vento_data.getDate()+1);
    arrayHora.push(vento_data.toLocaleDateString("pt-BR")+" - "+data[i].vento_hora.slice(0, -6)+"h");

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
      pointRadius: 1,
      pointBackgroundColor: "rgb(255,0,0)",
      pointBorderColor: "rgba(255,0,0)",
      pointHoverRadius: 1,
      pointHoverBackgroundColor: "rgb(255,0,0)",
      pointHitRadius: 40,
      pointBorderWidth: 1,
      data: arrayVentoRajada,
    },
    {
          label: "Velocidade horária(m/s)",
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
