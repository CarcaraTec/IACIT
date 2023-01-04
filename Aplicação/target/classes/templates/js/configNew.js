$(function() {
        $.getJSON("https://api.ipify.org?format=jsonp&callback=?",
          function(json) {
            console.log(json.ip)
$(document).ready(function(){
    $.getJSON("/log",function(log){
        const userLog = log.reverse();
            function isCherries(fruit){
                return fruit.ip === json.ip;
                }
              logUser = userLog.find(isCherries);
                console.log(log.status)
              if(logUser === undefined || logUser.status == "deslogado"){
                window.location.href = "login.html";
              }


              $(document).ready(function(){
                              $.getJSON("/usuarios",function(data){
                                    const inventory = data;
                                    function isCherries(fruit){
                                        return fruit.email === logUser.email;
                                        }
                                        
                                    var usuario = inventory.find(isCherries);


                                    $(document).ready(function(){
                                        $.getJSON("/log/getUsuario/"+usuario.email,function(userInfo){
                                        console.log(userInfo.email)
                                        if(userInfo.email!="Undefined")
                                             document.getElementById("configNew").innerHTML = "";

                                            
                                        });
                                    });


                                    
                        });
                    });
                });
            });
        }
    );
});
