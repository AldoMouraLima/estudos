

	    var tipoCurso = " ";
	    var contador = 0;

	    while (tipoCurso !=='G' && tipoCurso !=='P' ) {	
		    tipoCurso = prompt("Tipo do Curso [G/P]: ");
    	    tipoCurso = tipoCurso.toUpperCase();

		    if (tipoCurso!=='G' && tipoCurso!=='P') {
		      alert("Tipo de curso incorreto");
		    }
		    contador = contador + 1;
		}

		if (tipoCurso==='G'){
		   alert("Graduacao");
		}
		else {
		   alert("Pos-graducao");
		}
		alert("Você acertou na "+contador+" tentativa")

