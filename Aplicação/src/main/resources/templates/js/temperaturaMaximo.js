$(document).ready(function(){
    $.getJSON("/temperatura_max",function(data){

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
                        $.getJSON("/estacoes",function(data2){
                        console.log("SP dado 1: "+data2[0].nome_estacao)
                        for(var i = 0;i<5;i++){
                            function nomeEstacao(nomear){

                                 return nomear.codigo == estacoes[i];
                                      }
                                 var esta = data2.find(nomeEstacao);
                                 const prec_data = new Date(tempMin[i].temp_data);
                                     prec_data.setDate(prec_data.getDate()+1);

                                 $("#tempMinEstacaoM"+i).prepend(esta.nome_estacao)
                                 $("#tempMinM"+i).prepend("Temperatura Mínima: "+tempMin[i].temp_min+"°C")
                                 $("#tempMaxM"+i).prepend("Temperatura Máxima: "+tempMin[i].temp_max+"°C")
                                 $("#tempMinOrvalhoMinM"+i).prepend("Ponto de Orvalho Mínimo: "+tempMin[i].temp_orvalho_min+"°C")
                                 $("#tempMinOrvalhoM"+i).prepend("Ponto de Orvalho: "+tempMin[i].temp_ponto_orvalho+"°C")
                                 $("#tempMinOrvalhoMaxM"+i).prepend("Ponto de Orvalho Máximo: "+tempMin[i].temp_orvalho_max+"°C")
                                 $("#tempDataM"+i).prepend("DATA: "+prec_data.toLocaleDateString("pt-BR"))

                                const a = document.querySelector("#verDetalhesM"+i);
                                a.href = "/charts=temperatura="+tempMin[i].estacao+"="+tempMin[i].temp_data+"="+tempMin[i].temp_data;
                                    }

                            });
                        });
                console.log(tempMin)
                //console.log("Resultado do indexOf: "+estacoes.indexOf("abacaxi"))


    });
});
                