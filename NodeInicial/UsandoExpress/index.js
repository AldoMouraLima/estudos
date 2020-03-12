const express = require("express");
const app = express();

app.get("/", function(req, res){
    res.send("Servidor respondendo uma requisição");
})


app.listen(8081, function(){
    console.log("Servidor rodando na url hppt://localhost:8081");
});