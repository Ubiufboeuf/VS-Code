const listaElementos = [
  "elemento 1",
  "elemento 2",
  "Elemento 3",
  "ELEMENTO 4",
  "elemento1",
  "elemento2",
  "Elemento3",
  "ELEMENTO4",
  "e",
  "le",
  "men",
  "to",
  "1",
  "2",
  "3",
  "4",
  "el",
  "te",
  "atendido",
  "atendiendo",
];

const input = document.querySelector("input");
const lista = document.querySelector("div");

input.focus();

input.addEventListener("keydown", (event) => {
  const iv = input.value;

  if (iv === "") {
    lista.textContent = "";
  }
})

input.addEventListener("keyup", (event) => {
  const iv = input.value;
  lista.textContent = "";

  listaElementos.map((element) => {
    const p = document.createElement("p");
    if (element === iv) {
      p.textContent = element;
      p.classList.add("ord-1");
      lista.append(p);
    } else if (element.startsWith(iv)) {
      p.textContent = element;
      p.classList.add("ord-2");
      lista.append(p);
    } else if (element.endsWith(iv)) {
      p.textContent = element;
      p.classList.add("ord-3");
      lista.append(p);
    } else if (element.includes(iv)) {
      p.textContent = element;
      p.classList.add("last");
      lista.append(p);
    } 
  })

  if (iv === "") {
    lista.textContent = "";
  }
})