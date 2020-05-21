

   var letra;

   while (true){
   	letra = prompt("Digite uma letra:");
   	letra = letra.toUpperCase();

   	if (letra<"A" || letra>"Z") {
   		alert("Não é letra")
   		continue;
   	}
   	break;
   }
   
   alert("Caracter é uma letra");

