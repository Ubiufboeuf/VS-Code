console.log("alladflñajsdlñfjadslñf")

console.log(document.querySelector("#elemento"))
window.onload = () => {
  console.log("window cargado")
  const $ = (el) => document.querySelector(el)
  console.log($("#elemento"))
  let a = 10
  "" // <- Texto
  '' // <- Texto
    `${++a}` // <- Permite añadir variables

  // window.onblur = () => {
  //   document.title = "hey! vuelve!"
  // }
  // window.onfocus = () => {
  //   document.title = "Gracias"
  //   setTimeout(() => {
  //     document.title = "Document"
  //   }, 500);
  // }
}

document.onload = () => {
  console.log("document cargado") // <- No funciona
}