const body = document.body;
const $buttons = document.querySelectorAll("button");
const $valj = document.querySelector("#valor-jugador");
const $val = document.querySelector("#valor-cpu");
const $res = document.querySelector("#resultado");
const $lista = document.querySelector("#lista-resultados");
const $pj = document.querySelector("#partidas-jugadas");
const $vic = document.querySelector("#victorias");
const $emp = document.querySelector("#empates");
const $der = document.querySelector("#derrotas");
const $racha_vic = document.querySelector("#racha-victorias");
const $racha_emp = document.querySelector("#racha-empates");
const $racha_der = document.querySelector("#racha-derrotas");
const $max_vic = document.querySelector("#max-victorias");
const $max_emp = document.querySelector("#max-empates");
const $max_der = document.querySelector("#max-derrotas");
// const $cps = document.querySelector("#cps");

body.addEventListener("contextmenu", (e) => {
  e.preventDefault();
})

let pj = 0;
let vic = 0; 
let emp = 0;
let der = 0;
let r_vic = 0;
let r_emp = 0;
let r_der = 0;
let m_vic = 0;
let m_emp = 0;
let m_der = 0;

const ppt = [
  "Piedra",
  "Papel",
  "Tijeras"
]

$buttons.forEach(($btn) => {
  $btn.addEventListener("mousedown", handleClick)
  function handleClick () {
    const max = 4;
    const min = 1;

    let n = 0;

    while (n == 0) {
      n = Math.floor(Math.random((max - min), min) * 10) + 1;
    }
    while (n > 3) { n -= 3 };

    $valj.textContent = $btn.value;
    $val.textContent = ppt[n-1];

    const btn = $btn.value;
    const val = $val.textContent;

    $res.textContent = comprobacion();
    pj++;

    const res = $res.textContent;

    function comprobacion () {
      const caso = {
        a: (btn === "Piedra" && val === "Tijeras"),
        b: (btn === "Papel" && val === "Piedra"),
        c: (btn === "Tijeras" && val === "Papel")
      }

      if (btn === val) {
        emp++;
        return "Empate";
      } else {
        return (caso.a || caso.b || caso.c)
          ? (vic++, "Ganaste")
          : (der++, "Perdiste");
      }
    }

    $pj.textContent = `Partidas jugadas: ${pj}`;
    $vic.textContent = `Victorias: ${vic}`;
    $emp.textContent = `Empates: ${emp}`;
    $der.textContent = `Derrotas: ${der}`;

    $racha_vic.textContent = `${r_vic}`;
    $racha_emp.textContent = `${r_emp}`;
    $racha_der.textContent = `${r_der}`;
    $max_vic.textContent = `${m_vic}`;
    $max_emp.textContent = `${m_emp}`;
    $max_der.textContent = `${m_der}`;

    const momento = Date();

    const element = document.createElement("article");
    const content = $res.textContent;

    element.innerHTML = `
      <p id="res">${content}</p>
      <p id="momento">${momento}</p>
      <p id="conteo">${pj}</p>
    `;
    
    if (content === "Ganaste") element.children[0].setAttribute("style", "color: rgb(32 255 60")
    if (content === "Perdiste") element.children[0].setAttribute("style", "color: rgb(255 32 32 )")

    $lista.prepend(element);
  }
})

