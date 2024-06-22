// Ejercicio 1
const btn = document.querySelector("#random");

btn.addEventListener("click", () => {
  let random = Math.floor(Math.random() * 11);
  const promesa = new Promise((resuelto, rechazado) => {
    if (random <= 5) {
      resuelto("Promesa cumplida");
    } else {
      rechazado("Promesa rechazada");
    }
  })
  
  promesa
    .then((msg) => {
      console.log(msg);
    })
    .catch((err) => {
      console.log(err);
    })
    .finally(() => {
      console.log("Promesa acabada")
    })

})

// Ejercicio 2

const btn2 = document.querySelector("#fetch");

btn2.addEventListener("click", () => {
  const url = "https://pokeapi.co/api/v2/";
  fetch(url)
    .then(respuesta => respuesta.json())
    .then(data => console.log(data))
})
