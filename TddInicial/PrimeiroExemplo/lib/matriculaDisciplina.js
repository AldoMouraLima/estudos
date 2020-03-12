function calcularMedia(nota1, nota2, subst, final){
    var media;
    if (nota1 !== undefined && nota2 !== undefined){
        media = (nota1 + nota2)/2;    
    }
    else if (nota1 !== undefined && nota2 === undefined && subst !== undefined) {
        media = (nota1 + subst)/2;    
    }
    else if (nota1 === undefined && nota2 !== undefined && subst !== undefined) {
        media = (nota2 + subst)/2;    
    }
    else if (nota1 === undefined && nota2 === undefined && subst !== undefined){
        media = subst/2;    
    }

    if (media >=3 && final !==undefined){
        media = (media + final) / 2;
    }
   
    return (media);
}

module.exports.calcularMedia = calcularMedia;