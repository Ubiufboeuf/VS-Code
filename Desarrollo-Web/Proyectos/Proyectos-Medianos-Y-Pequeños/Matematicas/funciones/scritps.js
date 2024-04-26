const varRaiz = document.querySelector("#raiz");
const varOY = document.querySelector("#oy");

let x;
let y;
let a;
let b;
let c;
let d;


a = 1;
b = 2;
c = 3;
d = 4;

function raiz() {
    return y = -b / a
}

function oy() {
    return c / d;
}

varRaiz.children[0].textContent = raiz();
varOY.children[0].textContent = oy();