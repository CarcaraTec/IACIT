// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';

        var doc = window.location.pathname.slice(8);
        $(document).ready(function(){
            $.getJSON("/SE/SP",function(data){
                const dado = doc.split('=');
                document.getElementById('datepicker').value = dado[2].replaceAll("-","/") + " - " +dado[3].replaceAll("-","/");
                const languagesSelect = document.getElementById("languages-select");
                const inventory = data;
                function isCherries(fruit) {
                    return fruit.codigo === dado[1];
                }
            console.log(dado[0]);
            $("#teste").append(inventory.find(isCherries).nome_estacao+" - |"+dado[1]+"|"+"     ("+dado[2]+")");
            document.getElementById('select1').value = inventory.find(isCherries).nome_estacao+" - |"+dado[1]+"|"+"     ("+dado[2]+")";
            console.log(document.getElementById("languages-select").value)
if(dado[0]=="precipitacao"){
$(document).ready(function(){
    $.getJSON("/precipitacao/range/"+dado[1]+"/"+dado[2]+"/"+dado[3],function(data){
    console.log("tamanho do dado: "+data.length)
    if(dado[1]!=null){

        document.getElementById("select1").innerHTML = "";
        $("#select1").append(inventory.find(isCherries).nome_estacao+" - |"+dado[1]+"|");


        document.getElementById('precipitacao1').className = 'btn btn-xlg btn-primary waves-effect waves-light';
    }



    var arrayHora = [];
    var arrayTotal = [];

for (var i = 0; i<data.length; i++){
    const prec_data = new Date(data[i].prec_data);
    prec_data.setDate(prec_data.getDate()+1);
    arrayHora.push(prec_data.toLocaleDateString("pt-BR")+" - "+data[i].prec_hora.slice(0, -6)+"h");
    if(data[i].prec_total==-999){
        arrayTotal.push(null);
    }else{
        arrayTotal.push(data[i].prec_total);
    }
}

var myLineChart = 0;
var ctx = document.getElementById("myAreaChart");
myLineChart = new Chart(ctx, {
  type: 'line',
  data: {
    labels: arrayHora,
    datasets: [{
      label: "Precipitação(mm)",
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
