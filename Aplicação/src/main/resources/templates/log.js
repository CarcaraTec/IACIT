$(function() {
        $.getJSON("https://api.ipify.org?format=jsonp&callback=?",
          function(json) {
const formulario = document.querySelector("form");
const Iemail = document.getElementById("inputEmail");

function cadastrarLog(){
    fetch("http://localhost:8080/log",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            email: Iemail.value,
            ip: json.ip,
            status: "logado"
        })
    })
    .then(function(res) {console.log(res) })
    .catch(function(res) {console.log(res) })
};


formulario.addEventListener('submit', function(event){
    event.preventDefault();

    cadastrarLog();
});
}
        );
      });