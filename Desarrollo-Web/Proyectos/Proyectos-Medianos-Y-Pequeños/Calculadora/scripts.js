const btnNumbers = document.querySelectorAll(".btnNumbers");
const btnSymbols = document.querySelectorAll(".btnSymbols");
const erase = document.querySelector("#eraseAll");
const h1 = document.querySelector("h1");

let numPrev;
let resultado;
let pantalla = "";


btnNumbers.forEach(btn => {
    btn.addEventListener("click", () => {
        pantalla = pantalla + btn.textContent;
        h1.textContent = pantalla;
    })
})

btnSymbols.forEach(symbol => {
    symbol.addEventListener("click", () => {
        numPrev = pantalla;
        pantalla += symbol.textContent;
        h1.textContent = pantalla;
    })
})

erase.addEventListener("click", () => {
    num1 = 0;
    num2 = 0;
    resultado = 0;
    pantalla = "";
    h1.textContent = pantalla;
})
