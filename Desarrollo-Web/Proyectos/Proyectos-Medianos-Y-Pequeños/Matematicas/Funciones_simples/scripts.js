const inputX = document.querySelector("#x");
const inputY = document.querySelector("#y");
const btn = document.querySelector("button");
const res = document.querySelector("span");
const listaRegistro = document.querySelector("ul");
const funcActual = document.querySelector("#f-actual>span");
const lastFunc = document.querySelector("#last-f>span");
const lastRes = document.querySelector("#last-res>span");
const cantReg = document.querySelector("#cant-reg>span");

let x;
let y;
let reg = [];

// 

document.body.addEventListener("keydown", (e) => {
    if (e.key == "Enter") ok;
});

btn.addEventListener("click", ok);
// 

function update() {
    inputX.value = x;
    inputY.value = y;
}

function ok() {
    console.log(x);
    update;
    console.log(x);
}




btn.addEventListener("click", click);

document.body.addEventListener("keydown", (e) => {
    if (e.key == "Enter") {
        click();
        x.value = "";
        y.value = "";
    }
});

function click() {
    console.log("x = " + x.value);
    console.log("y = " + y.value);

    r.textContent = funcionCalc(x.value, y.value);
    console.log(r.textContent);

    registro(x.value, y.value);
}

const funcionCalc = (x, y) => {
    return 25 * 2 * x + 40 * y;
};

function registro(x, y) {
    const li = document.createElement("li");

    if (x == 0 || x == undefined || x == null) {
        x = 0;
    }

    if (y == 0 || y == undefined || y == null) {
        y = 0;
    }
    li.textContent = `F${
        lista.children.length + 1
    } (${x}, ${y}) = 25*(2*${x}) + 40*${y} = ${funcionCalc(x, y)}`;
    lista.append(li);
    console.log(reg);
}
 