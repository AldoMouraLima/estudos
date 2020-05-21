

	    var tipoCurso=" ";

	    while (tipoCurso !=='G' && tipoCurso !=='P' ) {	
		    tipoCurso = prompt("Tipo do Curso [G/P]: ");
    	    tipoCurso = tipoCurso.toUpperCase();

		    if (tipoCurso!=='G' && tipoCurso!=='P') {
		      alert("Tipo de curso incorreto");
		    }
		}

		if (tipoCurso==='G'){
		   alert("Graduacao");
		}
		else {
		   alert("Pos-graducao");
		}

