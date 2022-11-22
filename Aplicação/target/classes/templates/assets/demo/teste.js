// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';


        var doc = window.location.pathname.slice(8);
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
                    return fruit.codigo === dado[1];
                }
            console.log(dado[0])


