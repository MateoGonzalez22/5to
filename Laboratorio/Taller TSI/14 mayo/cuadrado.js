let margenX = 1;
let margenY = 1;


function moverHaciaDerecha(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = margenX + 50;
    margenX = nuevoValorDeMargenIzquierdo;
    cuadrado.style.marginLeft = margenX + "px";
    if (margenX > 1400){
        margenX = 1400;
    }
    desaparecer();
}



function moverHaciaIzquierda(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = margenX - 50;
    margenX = nuevoValorDeMargenIzquierdo;
    cuadrado.style.marginLeft = margenX + "px";
    if (margenX < 1){
        margenX = 1;
    }
    desaparecer();
}

function moverHaciaArriba() {
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenDerecho = margenY - 50;
    margenY = nuevoValorDeMargenDerecho;
    cuadrado.style.marginTop = margenY + "px";
    if (margenY > 500){
        margenY = 1000;
    }
    desaparecer();
}

function moverHaciaAbajo(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenArriba = margenY + 50;
    margenY = nuevoValorDeMargenArriba;
    cuadrado.style.marginTop = margenY + "px";
    if (margenY > 12){
        margenY = 12;
    }
    desaparecer();
}

function desaparecer(){
    let cuadrado = document.getElementById("cuadrado");
    let x = cuadrado.getBoundingClientRect().x;
    let y = cuadrado.getBoundingClientRect().y;

    let cuadrado2 = document.getElementById("cuadrado2");
    let x1 = cuadrado2.getBoundingClientRect().x;
    let y1 = cuadrado2.getBoundingClientRect().y;
    
    console.log(x);
    console.log(y);
    console.log(x1);
    console.log(y1);


    if(x == x1 && y == y1){
        cuadrado2.style.display = "none";
    }

    
}