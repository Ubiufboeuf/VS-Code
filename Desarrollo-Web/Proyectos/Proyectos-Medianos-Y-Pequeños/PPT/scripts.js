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
const $erase = document.querySelector("#erase");

let pj = window.localStorage.getItem("pj") ?? 0;
let vic = window.localStorage.getItem("vic") ?? 0;
let emp = window.localStorage.getItem("emp") ?? 0;
let der = window.localStorage.getItem("der") ?? 0;
let r_vic = window.localStorage.getItem("r_vic") ?? 0;
let r_emp = window.localStorage.getItem("r_emp") ?? 0;
let r_der = window.localStorage.getItem("r_der") ?? 0;
let m_vic = window.localStorage.getItem("m_vic") ?? 0;
let m_emp = window.localStorage.getItem("m_emp") ?? 0;
let m_der = window.localStorage.getItem("m_der") ?? 0;

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

const ppt = [
  "Piedra",
  "Papel",
  "Tijeras"
]

function Fecha() {
  /* Tue Jul 09 2024 23:55:10 GMT-0300
  (hora estándar de Uruguay) */
  let momento;
  const date = new Date();
  momento = date
  return momento;
}

$erase.addEventListener("click", () => {
  localStorage.clear();
  pj = 0;
  vic = 0;
  emp = 0;
  der = 0;
  r_vic = 0;
  r_emp = 0;
  r_der = 0;
  m_vic = 0;
  m_emp = 0;
  m_der = 0;

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

  $lista.innerHTML = "";
})

$buttons.forEach(($btn) => {
  $btn.addEventListener("mousedown", handleClick)
  function handleClick() {
    const max = 4;
    const min = 1;

    let n = 0;

    while (n == 0) {
      n = Math.floor(Math.random((max - min), min) * 10) + 1;
    }
    while (n > 3) { n -= 3 };

    $valj.textContent = $btn.value;
    $val.textContent = ppt[n - 1];

    const btn = $btn.value;
    const val = $val.textContent;

    $res.textContent = comprobacion();
    pj++;

    function comprobacion() {
      const caso = {
        a: (btn === "Piedra" && val === "Tijeras"),
        b: (btn === "Papel" && val === "Piedra"),
        c: (btn === "Tijeras" && val === "Papel")
      }

      // if (btn === val) {
      //   emp++;
      //   return "Empate";
      // } else {
      //   return (caso.a || caso.b || caso.c)
      //     ? (vic++, "Ganaste")
      //     : (der++, "Perdiste");
      // }

      if (btn === val) {
        // Si empatas
        emp++;
        r_vic = 0;
        r_emp++;
        r_der = 0;
        return "Empate";
      } else if (caso.a || caso.b || caso.c) {
        // Si ganas
        vic++;
        r_vic++;
        r_emp = 0;
        r_der = 0;
        return "Ganaste";
      } else {
        // Si pierdes
        der++;
        r_vic = 0;
        r_emp = 0;
        r_der++;
        return "Perdiste";
      }
    }

    m_vic = (r_vic > m_vic) ? r_vic : m_vic
    m_emp = (r_emp > m_emp) ? r_emp : m_emp
    m_der = (r_der > m_der) ? r_der : m_der

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

    window.localStorage.setItem("pj", pj)
    window.localStorage.setItem("vic", vic)
    window.localStorage.setItem("emp", emp)
    window.localStorage.setItem("der", der)
    window.localStorage.setItem("r_vic", r_vic)
    window.localStorage.setItem("r_emp", r_emp)
    window.localStorage.setItem("r_der", r_der)
    window.localStorage.setItem("m_vic", m_vic)
    window.localStorage.setItem("m_emp", m_emp)
    window.localStorage.setItem("m_der", m_der)

    const momento = Fecha();

    const element = document.createElement("article");
    const content = $res.textContent;

    element.innerHTML = `
      <div>
        <p id="res">${content}</p>
        <p id="conteo">Nº ${pj}</p>
      </div>
      <p id="momento">${momento}</p>
    `;

    if (content === "Ganaste") element.children[0].children[0].setAttribute("style", "color: rgb(32 255 60");
    if (content === "Perdiste") element.children[0].children[0].setAttribute("style", "color: rgb(255 32 32 )");
    if (content === "Empate") element.children[0].children[0].setAttribute("style", "color: orange");

    $lista.prepend(element);
  }
})