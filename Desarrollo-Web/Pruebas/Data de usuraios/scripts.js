// ejemplo de como cargar el contenido de un directorio
document.querySelector("#cargar3").addEventListener("click", async () => {
  try {
    // seleccionar un directorio
    const referencia = await window.showDirectoryPicker();

    // obtenemos el listado de archivos
    let html = "<ul>";
    for await (const archivo of referencia.values()) {
      html += "<li>";
      console.log(archivo);
      if (archivo.kind == "file")
        // es un archivo
        html += archivo.name;
      // es una subcarpeta
      else html += "<b>" + archivo.name.toUpperCase() + "</b>";
      html += "</li>";
    }
    html += "</ul>";
    document.querySelector("#directorio").innerHTML = html;
  } catch (err) {
    console.log("Se ha producido un error o se ha cancelado la carga. " + err);
  }
});
