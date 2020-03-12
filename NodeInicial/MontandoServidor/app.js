var http = require("http");

http.createServer(function(req, res){
    res.end("Resposta do Servidor");
}).listen(8081);

console.log("Servidor Rodando");


