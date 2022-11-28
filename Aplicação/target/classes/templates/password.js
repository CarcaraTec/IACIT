const formulario = document.querySelector("form");
var Iemail = document.getElementById("inputEmail");
var senha
var nome

function cadastrar(){
    $(document).ready(function(){
                $.getJSON("/usuarios",function(data){
                    const inventory = data;
                        function isCherries(fruit){
                            return fruit.email === Iemail.value;
                        }
                        console.log(Iemail.value)
                        var usuario = inventory.find(isCherries);
                        senha = usuario.senha
                        nome = usuario.nome
                    console.log(usuario)

    fetch("https://hook.us1.make.com/er5uwjwos33gcy4xnci6bm3j2vvimljl",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            email: Iemail.value,
            nome: nome,
            senha: senha
        })
    })
    .then(function(res) {console.log(res) })
    .catch(function(res) {console.log(res) })
    limpar();
    });
                });
};

function limpar(){
    Iemail.value = "";
}

formulario.addEventListener('submit', function(event){
    event.preventDefault();

    cadastrar();
    window.location.href("localhost:8080/login.html")
});