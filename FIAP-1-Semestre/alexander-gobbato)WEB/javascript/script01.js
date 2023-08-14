function mostrarMenor(pNum1, pNum2){
    let nr1 = parseInt(pNum1);
    let nr2 = parseInt(pNum2);
    let objDiv = document.getElementById("idResultado");
    let resultado = "";
    if(nr1 == nr2){
       resultado =  "Número " + nr1 + " é maior do que o nr " + nr2 + "!"
    }else{
        if (nr1 > nr2)
            resultado = "Número " + nr1 + " é maior do que o nr " + nr2 + "!";
        else
            resultado = "Número " + nr2 + " é maior do que o nr " + nr1 + "!";
    objDiv.innerHTML = resultado;
    }
}


/*function mostrarMenor(){
    let nr1 = parseInt(document.getElementById("txtNumero1").value);
    let nr2 = parseInt(document.getElementById("txtNumero2").value);
    let objDiv = document.getElementById("idResultado");
    let resultado = "";
    if(nr1 == nr2){
       resultado =  "Número " + nr1 + " é maior do que o nr " + nr2 + "!"
    }else{
        if (nr1 > nr2)
            resultado = "Número " + nr1 + " é maior do que o nr " + nr2 + "!";
        else
            resultado = "Número " + nr2 + " é maior do que o nr " + nr1 + "!";
    objDiv.innerHTML = resultado;
    }
}*/