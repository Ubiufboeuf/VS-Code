const $buttons = document.querySelectorAll("button");
const $valj = document.querySelector("#valor-jugador");
const $val = document.querySelector("#valor-cpu");
const $res = document.querySelector("#resultado");
const $lista = document.querySelector("#lista");
const $pj = document.querySelector("#partidas-jugadas");
const $vic = document.querySelector("#victorias");
const $emp = document.querySelector("#empates");
const $der = document.querySelector("#derrotas");

let pj = 0;
let vic = 0;
let emp = 0;
let der = 0;

const ppt = [
  "Piedra",
  "Papel",
  "Tijeras"
]

$buttons.forEach(($btn) => {
  $btn.addEventListener("click", () => {
    const max = 4;
    const min = 1;

    let n = 0;

    while (n == 0) {
      n = Math.floor(Math.random((max - min), min) * 10) + 1;
    }
    while (n > 3) { n -= 3 };

    $valj.textContent = $btn.textContent;
    $val.textContent = ppt[n-1];

    const btn = $btn.textContent;
    const val = $val.textContent;

    $res.textContent = comprobacion();
    pj++;

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

    const li = document.createElement("li");

    const momento = Date();

    li.innerHTML = `
      <div>
        <p>${$res.textContent} - Tú: ${btn} | Rival: ${val}</p>
        <p>${momento}</p>
      </div>
    `;

    $lista.append(li);
  })
})