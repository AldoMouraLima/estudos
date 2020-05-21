


    var resultado;
    var operacao = prompt("Escolha um operador [+ - * /]");
    var num1 = prompt("Informe o primeiro número");
    var num2 = prompt("Informe o segundo número");
	var erro=false;
	switch( operacao )
	{
	    case '+':
	        resultado = Number(num1)+Number(num2);
    	    break;        
 	   case '-':
    	    resultado = num1-num2;
        	break;
  	  case '*':
    	    resultado = num1*num2;
        	break;
 	   case '/':
    	    resultado = num1/num2;
        	break;         
 	   default:
    	    alert("Operação inválida."); 
        	erro=true;	
	}
	if (erro===false) {
   		alert("Resultado: "+resultado);        	
	}


        