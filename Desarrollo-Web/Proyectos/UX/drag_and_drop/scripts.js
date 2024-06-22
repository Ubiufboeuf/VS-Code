const elemento = document.querySelectorAll("article");
let selected;

function handleDrag (e, selected) {
  e.target.classList = ""
  e.target.classList.add("drag")
  console.log(e.target.getAttribute("idx") + " | drag")
}

function handleDragEnd (e, selected) {
  e.target.classList = ""
  e.target.classList.add("end")
  console.log(e.target.getAttribute("idx") + " | end")
}

function handleDragEnter (e, selected) {
  e.target.classList = ""
  e.target.classList.add("enter")
  console.log(e.target.getAttribute("idx") + " | enter")
}

function handleDragLeave (e, selected) {
  if (e.target.value != selected) {
    e.target.classList = ""
    e.target.classList.add("leave")
    console.log(e.target.getAttribute("idx") + " | leave")
  }
}

function handleDragOver (e, selected) {
  e.target.classList = ""
  e.target.classList.add("over")
  console.log(e.target.getAttribute("idx") + " | over")
}

function handleDragStart (e, selected) {
  e.target.classList = ""
  e.target.classList.add("start")
  console.log(e.target.getAttribute("idx") + " | start")
  selected = e.target.idx;
  console.log(selected);
  return selected;
}

elemento.forEach(el => {
  el.addEventListener("drag", (e) => {
    // handleDrag(e, selected)
  })
  el.addEventListener("dragend", (e) => {
    handleDragEnd(e, selected)
  })
  el.addEventListener("dragenter", (e) => {
    // handleDragEnter(e, selected)
})
  el.addEventListener("dragleave", (e) => {
    // handleDragLeave(e, selected)
})
  el.addEventListener("dragover", (e) => {
    // handleDragOver(e, selected)
  })
  el.addEventListener("dragstart", (e, selected) => {
    handleDragStart(e, selected)
  })
})