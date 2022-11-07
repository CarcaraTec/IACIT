$(function() {
        $.getJSON("https://api.ipify.org?format=jsonp&callback=?",
          function(json) {
const formulario = document.querySelector("unlog");

function cadastrarLog(){
    fetch("http://localhost:8080/log",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            email: "email",
            ip: json.ip,
            status: "deslogado"
        })
    })
    .then(function(res) {console.log(res) })
    .catch(function(res) {console.log(res) })
};


unlog.addEventListener('submit', function(event){
    event.preventDefault();
    cadastrarLog();
});
}
        );
      });