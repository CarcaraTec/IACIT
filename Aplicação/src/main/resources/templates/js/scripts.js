/*!
    * Start Bootstrap - SB Admin v7.0.5 (https://startbootstrap.com/template/sb-admin)
    * Copyright 2013-2022 Start Bootstrap
    * Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-sb-admin/blob/master/LICENSE)
    */
    // 
// Scripts
//
console.log(document.getElementById('labelHome').value)
if(window.location.pathname == "/index.html" || window.location.pathname == "/charts.html" || document.getElementById('labelHome').value == 0){
function deslogar(){
window.location.href = "login.html";
}
$(function() {
        $.getJSON("https://api.ipify.org?format=jsonp&callback=?",
          function(json) {
$(document).ready(function(){
    $.getJSON("/log",function(log){
        const userLog = log.reverse();
            function isCherries(fruit){
                return fruit.ip === json.ip;
                }
              logUser = userLog.find(isCherries);

              if(logUser.status == "deslogado"){
                window.location.href = "login.html";
              }


              $(document).ready(function(){
                              $.getJSON("/usuarios",function(data){
                                    const inventory = data;
                                    function isCherries(fruit){
                                        return fruit.email === logUser.email;
                                        }
                                    var usuario = inventory.find(isCherries);
                                    console.log(usuario)
                                    $("#nomeUsuario").append(usuario.nome);
                              });
                                          });
                                          });
                                                              });
                                          }
                                                  );
                                                });
                                          }
window.addEventListener('DOMContentLoaded', event => {

    // Toggle the side navigation
    const sidebarToggle = document.body.querySelector('#sidebarToggle');
    if (sidebarToggle) {
        // Uncomment Below to persist sidebar toggle between refreshes
        // if (localStorage.getItem('sb|sidebar-toggle') === 'true') {
        //     document.body.classList.toggle('sb-sidenav-toggled');
        // }
        sidebarToggle.addEventListener('click', event => {
            event.preventDefault();
            document.body.classList.toggle('sb-sidenav-toggled');
            localStorage.setItem('sb|sidebar-toggle', document.body.classList.contains('sb-sidenav-toggled'));
        });
    }

});
var nomeUsuario;
function logar(){
            $(document).ready(function(){
                $.getJSON("/usuarios",function(data){
                    const inventory = data;
                        function isCherries(fruit){
                            return fruit.email === document.getElementById('inputEmail').value;
                        }
                        var usuario = inventory.find(isCherries);
                    if(usuario.senha == document.getElementById('inputPassword').value){
                        console.log("logado")
                        console.log(usuario)
                        nomeUsuario = usuario.nome;
                        window.location.href = "index.html";
                    }else{
                        alert("Senha incorreta")
                    }
                });
            });
        }
