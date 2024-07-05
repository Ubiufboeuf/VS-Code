const body = document.body;
const h1 = document.querySelector("h1");
const chk = document.querySelector("#checkbox");
const nmb = document.querySelector("#number");
const prueba = document.createElement("input")

chk.addEventListener("checked", () => {
  setInterval(() => {

  }, nmb.value);
})

chk.addEventListener("unchecked", () => {
  alert("a")
})

prueba.setAttribute("type", "checkbox");

let intervalID;

chk.addEventListener("change", (e) => {
  const cambioColor = () => {
    body.setAttribute("style", `background: rgb(${Math.floor(Math.random() * 255)} ${Math.floor(Math.random() * 255)} ${Math.floor(Math.random() * 255)})`);
    h1.setAttribute("style", `color: rgb(${Math.floor(Math.random() * 255)} ${Math.floor(Math.random() * 255)} ${Math.floor(Math.random() * 255)})`);
  }

  if (chk.checked) {
    if (intervalID) {
      clearInterval(intervalID);
    }
    intervalID = setInterval(cambioColor, nmb.value);
  } else {
    clearInterval(intervalID);
    intervalID = null;  // Limpia el ID del intervalo
  }
});