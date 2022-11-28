
    console.log("valor da regiao: "+ document.getElementById('selectRegiao').value)
    console.log("valor do estado: "+ document.getElementById('selectEstado').value)


    var selectRegiao = document.getElementById("regioes-select").value;
        function selecionar(){
            var elem = document.getElementById("estados-select");
            elem.options.length = 0;
            $('#estados-select').append(new Option("Estado", "abc"))
        $(document).ready(function(){
          selectRegiao = document.getElementById("regioes-select").value;
          $.getJSON("/estados/"+selectRegiao,function(data){
              const dado = doc.split('=');
              const estadosSelect = document.getElementById("estados-select");
              var estadosList = [];
              for (var i = 0; i<data.length; i++){
              estadosList.push(data[i].nome_estado);
              }
              estadosList.forEach((language) => {
                option = new Option(language, language.toLowerCase());
                estadosSelect.options[estadosSelect.options.length] = option;
              });
            });
          });
          }

          var selectEstado = 0;
          var dado = doc.split('=');
          var inventory;

        function selecionarEst(){
          var elem = document.getElementById("languages-select");
          elem.options.length = 0;
          selectEstado = document.getElementById("estados-select").value;

          console.log("o select de regiao: "+selectRegiao)
          console.log("slc de estado: "+selectEstado)



        $(document).ready(function(){
            $.getJSON("/"+selectRegiao+"/"+selectEstado.toUpperCase(),function(data){

                const languagesSelect = document.getElementById("languages-select");
                var languagesList = [];
                for (var i = 0; i<data.length; i++){
                languagesList.push(data[i].nome_estacao+" - |"+data[i].codigo+"|");
                }
                languagesList.forEach((language) => {
                  option = new Option(language, language.toLowerCase());
                  languagesSelect.options[languagesSelect.options.length] = option;
                });

                inventory = data;

              });
            });
          }