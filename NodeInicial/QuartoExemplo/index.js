var salario = 10000;

var valorINSSFunction = require("./modules/calcularINSS");
var valorINSS = valorINSSFunction(salario);

var valorIRFunction = require("./modules/calcularIR");
var valorIR = valorIRFunction(salario);

var salarioLiquido = salario - valorINSS - valorIR;

console.log("Valor INSS :R$ " + valorINSS.toFixed(2));
console.log("Valor IR: R$ " + valorIR.toFixed(2));
console.log("Salario Líquido: R$ " + salarioLiquido.toFixed(2));