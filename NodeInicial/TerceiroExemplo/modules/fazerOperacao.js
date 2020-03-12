var resposta = function(n1, n2, op){
    var resultado = 0;
    if (op == "+") {
        resultado = n1 + n2;
    }
    else if(op == "-") {
        resultado = n1 - n2;
    }
    else if (op == "*") {
        resultado = n1 * n2;
    }
    else if (op == "/") {
        resultado = n1 / n2;
    }
    return resultado;
} 

module.exports = resposta;