console.log("Calcular Desconto");

var nome = "Aldo Moura";
console.log("Nome: " + nome);

var valueProduct = 100;
var valueDiscount = 37;

var discountFunction = require("./modules/calcDiscount");

var valueFinalProduct = discountFunction(valueProduct, valueDiscount);

console.log("Valor Final do Produto: R$ " + valueFinalProduct.toFixed(2));