import { lista_dias, sem_dias, lista_meses, options } from "./data.js";

const select_mes = document.querySelector("#select-mes");
const select_largo_dias = document.querySelector("#select-nombre-dia");
const section_semana = document.querySelector("#semana");
const section_dias = document.querySelector("#dias");

function creacionMes(mes) {
  section_dias.innerHTML = "";

  const { dias, vacio } = mes;

  for (let i = 0; i < vacio; i++) {
    const p = document.createElement("p");
    p.classList.add("vacio");
    section_dias.append(p);
  }

  for (let i = 0; i < dias; i++) {
    const p = document.createElement("p");
    p.classList.add("dia")
    p.textContent = i + 1;
    if (i + 1 === n_dia_fecha) {
      p.classList.add("hoy");
    }
    section_dias.append(p);
  }
}

function largoDias(select_largo_dias) {
  section_semana.innerHTML = "";
  if (select_largo_dias === undefined) {
    sem_dias[0].map((el) => {
      const p = document.createElement("p");
      p.classList.add("semana");
      p.textContent = el;
      section_semana.append(p);
    })
    return;
  }
  let nld;
  let sld = [...select_largo_dias.children];

  for (let i in sld) {
    // console.log(sld[i].textContent);
    if (select_largo_dias.selectedOptions[0].textContent === sld[i].textContent) {
      nld = sld[i].index;
    }
  }

  sem_dias[nld].map((el) => {
    const p = document.createElement("p");
    p.classList.add("semana");
    p.textContent = el;
    section_semana.append(p);
  })
}

largoDias(select_largo_dias);

select_largo_dias.addEventListener("change", () => {
  largoDias(select_largo_dias);
})

function manageListas (nuevo_mes) {
  lista_dias.map(el => {
    // console.log(el)
    if (el.nombre === nuevo_mes) {
      creacionMes(el);
    }
  })
}

const fecha = new Date();
const n_mes_fecha = fecha.getMonth();
const n_dia_fecha = fecha.getDate();

select_mes.value = lista_meses[n_mes_fecha];
manageListas(select_mes.value)

select_mes.addEventListener("change", (e) => {
  const nuevo_mes = e.target.value;
  manageListas(nuevo_mes)
})