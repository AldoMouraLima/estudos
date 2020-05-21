function calcularJuros(){
	var	inValor = document.getElementById('infoValor');
	var	inDias = document.getElementById('infoDias');

	var infoValor = parseFloat(inValor.value);
	var infoDias = parseInt(inDias.value);

	var jurosUm =infoValor+(infoValor*0.05);
	var jurosDois =infoValor+(infoValor*0.10);
	var jurosTres =infoValor+(infoValor*0.15);

	var responder = document.getElementById("resposta");
	
	if (infoDias<=30) {
		console.log(infoDias);
		responder.textContent = jurosUm;
	}
	else if(infoDias<=61){
		console.log(infoDias);
		responder.textContent = jurosDois;
	}
	else{
		console.log(infoDias);
		responder.textContent = jurosTres;
	}
}

var mostrar = document.getElementById("exibir");
mostrar.addEventListener("click", calcularJuros);