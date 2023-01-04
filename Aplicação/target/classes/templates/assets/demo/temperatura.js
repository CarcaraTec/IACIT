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
            console.log(dado[0])
if(dado[0]=="temperatura"){
$(document).ready(function(){
    console.log(dado[1])
    console.log("/temperatura/"+doc+"/"+dado[2])
    $.getJSON("/temperatura/range/"+dado[1]+"/"+dado[2]+"/"+dado[3],function(data){

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

        document.getElementById('temperatura1').className = 'btn btn-xlg btn-primary waves-effect waves-light';
    }

    var arrayHora = [];
    var arrayTotal = [];


    var arrayTempAr = [];
    var arrayTempMax = [];
    var arrayTempMin = [];
    var arrayTempOrvalho = [];
    var arrayTempOrvalhoMax = [];
    var arrayTempOrvalhoMin = [];


for (var i = 0; i<data.length; i++){

    const temp_data = new Date(data[i].temp_data);
    temp_data.setDate(temp_data.getDate()+1);
    arrayHora.push(temp_data.toLocaleDateString("pt-BR")+" - "+data[i].temp_hora.slice(0, -6)+"h");

    if(data[i].temp_ar==-999){
        arrayTempAr.push(null);
    }else{
        arrayTempAr.push(data[i].temp_ar);
    }

    if(data[i].temp_max==-999){
            arrayTempMax.push(null);
        }else{
            arrayTempMax.push(data[i].temp_max);
        }

    if(data[i].temp_min==-999){
            arrayTempMin.push(null);
        }else{
            arrayTempMin.push(data[i].temp_min);
        }

    if(data[i].temp_ponto_orvalho==-999){
            arrayTempOrvalho.push(null);
        }else{
            arrayTempOrvalho.push(data[i].temp_ponto_orvalho);
        }

    if(data[i].temp_orvalho_max==-999){
            arrayTempOrvalhoMax.push(null);
         }else{
            arrayTempOrvalhoMax.push(data[i].temp_orvalho_max);
         }

    if(data[i].temp_orvalho_min==-999){
                arrayTempOrvalhoMin.push(null);
             }else{
                arrayTempOrvalhoMin.push(data[i].temp_orvalho_min);
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
      label: "Ar Bulbo Seco(ºC)",
      lineTension: 0.3,
      backgroundColor: "rgba(255,99,71,0)",
      borderColor: "RGBA(255,165,0,1)",
      pointRadius: 1,
      pointBackgroundColor: "RGBA(255,165,0,1)",
      pointBorderColor: "rgba(255,165,0,1)",
      pointHoverRadius: 1,
      pointHoverBackgroundColor: "RGBA(255,165,0,1)",
      pointHitRadius: 40,
      pointBorderWidth: 1,
      data: arrayTempAr,
    },
    {
          label: "Máxima na hora ant.(ºC)",
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
          data: arrayTempMax,
        },
        {
              label: "Mínima na hora ant.(ºC)",
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
              data: arrayTempMin,
            },
            {
                          label: "Ponto de Orvalho(ºC)",
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
                          data: arrayTempOrvalho,
                        },
                        {
                                                  label: "Orvalho Máx na hora ant.(ºC)",
                                                  lineTension: 0.3,
                                                  backgroundColor: "rgba(255,99,71,0)",
                                                  borderColor: "RGBA( 0, 100, 0, 1 )",
                                                  pointRadius: 1,
                                                  pointBackgroundColor: "RGBA( 0, 100, 0, 1 )",
                                                  pointBorderColor: "rgba( 0, 100, 0, 1 )",
                                                  pointHoverRadius: 1,
                                                  pointHoverBackgroundColor: "RGBA( 0, 100, 0, 1 )",
                                                  pointHitRadius: 40,
                                                  pointBorderWidth: 1,
                                                  data: arrayTempOrvalhoMax,
                                                },
                                                {
                                                                                                  label: "Orvalho Mín na hora ant.(ºC)",
                                                                                                  lineTension: 0.3,
                                                                                                  backgroundColor: "rgba(255,99,71,0)",
                                                                                                  borderColor: "RGBA( 152, 251, 152, 1 )",
                                                                                                  pointRadius: 1,
                                                                                                  pointBackgroundColor: "RGBA( 152, 251, 152, 1 )",
                                                                                                  pointBorderColor: "rgba( 152, 251, 152, 1 )",
                                                                                                  pointHoverRadius: 1,
                                                                                                  pointHoverBackgroundColor: "RGBA( 152, 251, 152, 1 )",
                                                                                                  pointHitRadius: 40,
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
