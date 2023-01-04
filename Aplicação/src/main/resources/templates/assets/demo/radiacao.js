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
if(dado[0]=="radiacao"){
$(document).ready(function(){
    console.log(dado[1])
    console.log("/radiacao/"+doc+"/"+dado[2])
    $.getJSON("/radiacao/range/"+dado[1]+"/"+dado[2]+"/"+dado[3],function(data){

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
        document.getElementById('radiacao1').className = 'btn btn-xlg btn-primary waves-effect waves-light';
    }

    var arrayHora = [];
    var arrayTotal = [];

    var arrayRadGlobal = [];


for (var i = 0; i<data.length; i++){

    const rad_data = new Date(data[i].rad_data);
    rad_data.setDate(rad_data.getDate()+1);
    arrayHora.push(rad_data.toLocaleDateString("pt-BR")+" - "+data[i].rad_hora.slice(0, -6)+"h");
    if(data[i].rad_global==-999){
        arrayRadGlobal.push(null);
    }else{
        arrayRadGlobal.push(data[i].rad_global);
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
      label: "Radiação Global(Kj/m²)",
      lineTension: 0.3,
      backgroundColor: "rgba(2,117,216,0.2)",
      borderColor: "rgba(2,117,216,1)",
      pointRadius: 1,
      pointBackgroundColor: "rgba(2,117,216,1)",
      pointBorderColor: "rgba(2,117,216,1)",
      pointHoverRadius: 1,
      pointHoverBackgroundColor: "rgba(2,117,216,1)",
      pointHitRadius: 40,
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
