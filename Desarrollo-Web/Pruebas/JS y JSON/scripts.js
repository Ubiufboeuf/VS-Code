const promesa = fetch("./file.json");
promesa.then(function (data) {
    console.log(typeof data);
});

// Esto se puede resumir omitiendo crear una constante
// Simplemente se aplica el método then() al fetch()

fetch("file.json").then(function (info) {
    console.log("a");
});

// Y esto también se puede escribir así:

fetch("file.json").then(function (cosa) {
    console.log(typeof cosa + "sss");
});

const opciones = {
    method: "GET",
};

/* fetch("./file.json", opciones)
    .then((respuesta) => respuesta.text())
    .then((datos) => {
        console.log(datos);
    }); */

const en = new Headers();
en.set("Content-Type", "application/json");
en.set("Content-Encoding", "br");

for ([key, value] of en.entries()) {
    console.log("Clave: " + key, "\\|/", "valor: " + value);
}



fetch("./file.json", )