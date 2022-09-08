const formulario = document.querySelector("form");
const Inome = document.querySelector(".nome");
const Iemail = document.querySelector(".email");
const Isenha = document.querySelector(".senha");

function cadastrar(){
    fetch("http://localhost:8080/usuarios",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            nome: Inome.value,
            email: Iemail.value,
            senha: Isenha.value
        })
    })
    .then(function(res) {console.log(res) })
    .catch(function(res) {console.log(res) })
};

function limpar(){
    Inome.value = "";
    Iemail.value = "";
    Isenha.value = "";
}

formulario.addEventListener('submit', function(event){
    event.preventDefault();

    cadastrar();
    limpar();
});