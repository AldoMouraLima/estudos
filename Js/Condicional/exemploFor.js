

	var valor;
	var total = 0;

	for (let i = 1; i <= 4; i++){
		valor = Number(prompt("Informe o valor do "+ i + "º produto R$"));
		total = total + valor;
	}

	alert("Valor total dos produto: " + total.toFixed(2));

