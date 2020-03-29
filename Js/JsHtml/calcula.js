		function exibirPreco() {
			
			var descricao  = document.getElementById("descricao");
			var preco      = document.getElementById("preco");
			var medi       = document.getElementById("medi");
            var resposta   = document.getElementById("resposta");
			
			console.log(preco);
			var  medicamento = descricao.value ;
			var  valor = Number(preco.value);
			
			var total = Math.floor(valor*2);
			
			//medi.textContent = "Promoção do medicamento " + medicamento;
			//resposta.textContent = "Leve dois por" + total.toFixed(2);
			document.getElementById("medi").textContent = "Promoção do medicamento " + medicamento;
			document.getElementById("resposta").textContent = "Leve dois por" + total.toFixed(2);
		}
		    var exibir = document.getElementById("exibir");
            exibir.addEventListener("click", exibirPreco); 
