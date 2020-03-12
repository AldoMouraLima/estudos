console.log("Operações Aritméticas");

var numero1 = 10;
var numero2 = 3;

var resultadoFunction = require("./modules/fazerOperacao");

var resultadoFinal = resultadoFunction(numero1, numero2, "/");

console.log(resultadoFinal.toFixed(2));