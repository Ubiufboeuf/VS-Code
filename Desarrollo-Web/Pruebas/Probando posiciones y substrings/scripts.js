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
  "el"
];

const input = document.querySelector("input");
const div = document.querySelector("div");

function search(input, data, key) {
  console.clear();
  // console.log(input.value);
  // const iv = input.value;
  // ol.innerHTML = "";
  // lista.map((elemento) => {
  //   if (elemento.includes(iv)) {
  //     console.log(elemento);
  //     const li = document.createElement("li");
  //     li.textContent = elemento;
  //     ol.append(li);
  //   } else {
  //     console.log("No");
  //     ol.forEach(element => {
  //       console.log(element)
  //     });
  //   }
  // })
  const iv = input.value;
  
  if (key == "Enter") {
    div.textContent = "";
    listaElementos.map((elemento) => {
      if (elemento.includes(iv)) {
        console.log(elemento);
        const p = document.createElement("p");
        p.setAttribute("style", "margin: 0;")
        p.textContent = div.childElementCount + ". " + elemento;
        div.append(p);
      }
    }) 
  }
  console.log(div)
  console.log(div.children[3])
  div.children[3].setAttribute("style", "order: 0")
  console.log(div.children[3])
}

document.addEventListener("keydown", (e) => {
  search(input, e, e.key)
})