

	    var tipoCurso;

	    do {	
		    tipoCurso = prompt("Tipo do Curso [G/P]: ");
    	    tipoCurso = tipoCurso.toUpperCase();

		    if (tipoCurso!=='G' && tipoCurso!=='P') {
		      alert("Tipo de curso incorreto");
		    }
		} while (tipoCurso !=='G' && tipoCurso !=='P' );

		if (tipoCurso==='G'){
		   alert("Graduacao");
		}
		else {
		   alert("Pos-graducao");
		}

