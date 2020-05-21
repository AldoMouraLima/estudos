

	    var valor;
	    var contador = 0;
	    var acumulador = 0;

	    do {
		    contador = contador + 1;
		    valor = prompt("Valor do Produto R$");
			acumulador = acumulador + Number(valor);
		} while (contador < 4);
		alert("Valor Total: R$"+acumulador.toFixed(2));

