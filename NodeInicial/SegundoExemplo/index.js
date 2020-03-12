console.log("Calcular Média e Verificar Situação do Aluno");

var nota1 = 10;
var nota2 = 5;

var calcMediaFunction = require("./modules/calcularMedia");
var mediaFinal = calcMediaFunction(nota1, nota2);

var defSitFunction = require("./modules/definirSituacao");
var defSit = defSitFunction(mediaFinal);

var defSttFunction = require("./modules/defineStatus");
var defStt = defSttFunction(mediaFinal);

console.log("Média: " + mediaFinal.toFixed(2));
console.log("Situação: " + defSit)
console.log("Status  : " + defStt)
