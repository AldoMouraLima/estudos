	    var tipoCurso;
	    do {	
		    tipoCurso = prompt("Tipo do Curso [G/P]: ");
    	    tipoCurso = tipoCurso.toUpperCase();

		    if (tipoCurso!='G' && tipoCurso!='P') {
		      console.log("Tipo de curso incorreto");
		    }
		} while (tipoCurso !='G' && tipoCurso !='P' );

		if (tipoCurso=='G'){
		   console.log("Graduacao");
		}
		else {
		   console.log("Pos-graducao");
		}

