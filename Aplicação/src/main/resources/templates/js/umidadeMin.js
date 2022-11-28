$(document).ready(function(){
    $.getJSON("/umidade_min",function(data){

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
                                 const prec_data = new Date(tempMin[i].umi_data);
                                     prec_data.setDate(prec_data.getDate()+1);

                                 $("#umiEstacao"+i).prepend(esta.nome_estacao)
                                 $("#umidadeMin"+i).prepend("Umidade Mínima: "+tempMin[i].umi_min+"%")
                                 $("#umidadeMax"+i).prepend("Umidade Máxima: "+tempMin[i].umi_max+"%")
                                 $("#UmidadeMedia"+i).prepend("Umidade Média: "+tempMin[i].umi_ar+"%")
                                 $("#umidadeData"+i).prepend("DATA: "+prec_data.toLocaleDateString("pt-BR"))

                                const a = document.querySelector("#verDetalhesU"+i);
                                a.href = "/charts=umidade="+tempMin[i].estacao+"="+tempMin[i].umi_data+"="+tempMin[i].umi_data;
                                    }

                            });
                        });
                console.log(tempMin)
                //console.log("Resultado do indexOf: "+estacoes.indexOf("abacaxi"))


    });
});
                