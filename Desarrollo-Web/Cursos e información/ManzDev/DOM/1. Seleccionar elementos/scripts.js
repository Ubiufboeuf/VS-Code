// Formas para seleccionar elementos en el DOM

// Métodos de búsqueda básicos o tradicionales
/*
    .getElementsById(id)
    .getElementsByClassName(class)
    .getElementsByName(value)
    .getElementsByTagName(tag)
*/

const link = document.getElementById("enlace");
const textos = document.getElementsByClassName("texto");
const input = document.getElementsByName("color-selector");
const title = document.getElementsByTagName("h1");

console.log("1 - .getElementById(): " + link);
console.log("2 - .getElementByClassName(): " + textos);
console.log("3 - .getElementByName(): " + input);
console.log("4 - .getElementByTagName(): " + title);

console.log(textos[1]); // <p class'textos'>...</p>
console.log(textos.length); // 3
const textoss = document.getElementsByClassName("textoss");
console.log(textoss); // []

//
// Métodos modernos

/* 
    .querySelector(sel)
    .querySelectorAll(sel)
*/

const a = document.querySelector("#enlace");
const p1 = document.querySelector(".textos .p1");

console.log(a);
console.log(p1);

const parrafos = document.querySelectorAll(".texto");
parrafos.forEach((txt) => {
    console.log(txt);
});
