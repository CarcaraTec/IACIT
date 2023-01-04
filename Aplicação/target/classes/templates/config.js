var logMaster = null;
$(function searchUser(){
        $.getJSON("https://api.ipify.org?format=jsonp&callback=?",
          function(json) {
            $(document).ready(function(){
                $.getJSON("/log",function(log){
                    const userLog = log.reverse();
                        function isCherries(fruit){
                            return fruit.ip === json.ip;
                            }
                          logUser = userLog.find(isCherries);
                          logMaster = logUser;
                          console.log(logUser)
                          $("#email").append(logMaster.email);
                          $(document).ready(function(){
                            $.getJSON("/usuarios",function(log){
                                const userLog = log.reverse();
                                    function procurar(fruit){
                                        return fruit.email === logMaster.email;
                                        }
                                      usuario = userLog.find(procurar);
                                      document.getElementById('nome').value = usuario.nome;

                                      $("#nome1").append(usuario.nome);
                                      
                });
            });
    });
});
});
});


const formulario = document.querySelector("configForm");
const Inome = document.getElementById("nome");
const Isobrenome = document.getElementById("sobrenome");
const Itelefone = document.getElementById("telefone");
const Icpf = document.getElementById("cpf");
const IdataNasc = document.getElementById("data");
const Icargo = document.getElementById("cargo");
const Iimg = document.getElementById("recipient-url");

function cadastrar(){
    fetch("http://localhost:8080/log/postUni",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            email: logMaster.email,
            nome: Inome.value,
            sobrenome: Isobrenome.value,
            telefone: Itelefone.value,
            cpf: Icpf.value,
            dataNasc: IdataNasc.value,
            cargo: Icargo.value,
            img: Iimg.value
        })
    })
    .then(function(res) {console.log(res) })
    .catch(function(res) {console.log(res) })
};

//function limpar(){
//    Iemail.value = "";
//    Inome.value = "";
//    Isobrenome.value = "";
//    Itelefone.value = "";
//    Icpf.value = "";
//    IdataNasc.value = "";
//    Icargo.value = "";
//}

formulario.addEventListener('submit', function(event){
    event.preventDefault();

    cadastrar();
});

//          });
//        });
