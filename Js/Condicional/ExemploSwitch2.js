

	var valorFinal, juros=0;
	var meses;
        
	var valorInicial = prompt("Qual o valor inicial da dívida: ");

	var meses = prompt("Você vai atrasar quantos meses [0-5]?: ");

	switch( meses ){	
    	case "5": 
        	juros++;
	    case "4":
    	    juros++;
	    case "3":
    	    juros++;
	    case "2":
    	    juros++;
	    case "1":
    	    juros++;
        	break;
	    default:
    	    alert("Valor válido de meses");
	}
	valorFinal=( (1 + (juros/100))*valorInicial);
	alert("Juros: "+juros+"%");	
	alert("Valor final da dívida: R$ "+valorFinal.toFixed(2));

