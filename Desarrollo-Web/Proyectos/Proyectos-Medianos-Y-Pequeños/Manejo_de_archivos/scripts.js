const fs = document.querySelector("#input-file");
const p_fs = document.querySelector("#info-file-selector");

fs.addEventListener("change", (e) => {
  e.preventDefault();
  const fileList = e.target.files;
  p_fs.innerHTML = `
    <span>nombre: ${fileList.name}</span>
    <span>tamaño: ${fileList.size}</span>
    <span>tipo: ${fileList}</span>
  `
})