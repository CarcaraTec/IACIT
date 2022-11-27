$(document).ready(function(){
    $.getJSON("/temperatura_min",function(data){

         var estacoes = []
        for(var i = 0; i<data.length;i++){
        if(estacoes.indexOf(data[i].estacao) == -1 || estacoes.length == 0)
            estacoes.push(data[i].estacao)
        }

        //console.log(estacoes)
            const inventory = data;
            var tempMin = []
            for(var i = 0;i<estacoes.length;i++){
                function isCherries(fruit){
                     return fruit.estacao === estacoes[i];
                           }
                var usuario = inventory.find(isCherries);
                tempMin.push(usuario)
                }


                $(document).ready(function(){
                        $.getJSON("/SE/SP",function(data2){
                        console.log("SP dado 1: "+data2[0].nome_estacao)
                            function nomeEstacao(nomear){

                                 return nomear.codigo == estacoes[0];
                                      }
                                 var esta = data2.find(nomeEstacao);
                                 const prec_data = new Date(tempMin[0].temp_data);
                                     prec_data.setDate(prec_data.getDate()+1);

                                 $("#tempMinEstacao").prepend("Nome da Estação: "+esta.nome_estacao)
                                 $("#tempMin").prepend("Temperatura Mínima: "+tempMin[0].temp_min+"°C")
                                 $("#tempMax").prepend("Temperatura Máxima: "+tempMin[0].temp_max+"°C")
                                 $("#tempMinOrvalhoMin").prepend("Ponto de Orvalho Mínimo: "+tempMin[0].temp_orvalho_min+"°C")
                                 $("#tempMinOrvalho").prepend("Ponto de Orvalho: "+tempMin[0].temp_ponto_orvalho+"°C")
                                 $("#tempMinOrvalhoMax").prepend("Ponto de Orvalho Máximo: "+tempMin[0].temp_orvalho_max+"°C")
                                 $("#tempData").prepend("DATA: "+prec_data.toLocaleDateString("pt-BR"))

                            });
                        });
                console.log(tempMin)
                //console.log("Resultado do indexOf: "+estacoes.indexOf("abacaxi"))


    });
});
                