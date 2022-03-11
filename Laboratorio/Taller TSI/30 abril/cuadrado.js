let margenX = 1;
let margenY = 1;


function moverHaciaDerecha(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = margenX + 1;
    margenX = nuevoValorDeMargenIzquierdo;
    cuadrado.style.marginLeft = margenX + "cm";
    if (margenX > 32){
        margenX = 32
    }
}



function moverHaciaIzquierda(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = margenX - 1;
    margenX = nuevoValorDeMargenIzquierdo;
    cuadrado.style.marginLeft = margenX + "cm";
    if (margenX < 1){
        margenX = 1
    }
}

function moverHaciaArriba() {
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenDerecho = margenY - 1;
    margenY = nuevoValorDeMargenDerecho;
    cuadrado.style.marginTop = margenY + "cm";
    if (margenY < 2){
        margenY = 2
    }
}

function moverHaciaAbajo(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenArriba = margenY + 1;
    margenY = nuevoValorDeMargenArriba;
    cuadrado.style.marginTop = margenY + "cm"
    if (margenY > 12){
        margenY = 12
    }
}