const opciones = {
    method: "GET",
};

fetch("file.json", opciones)
    .then((response) => response.text())
    .then((data) => {});

//
// Probando la propiedad .ok

const a = fetch("file.json").then((response) => {
    if (response.ok) return response.ok;
});

console.log(a);

//
console.log("=============================================");
//
// Método .text()

fetch("file.json")
    .then((response) => response.text())
    .then((data) => console.log(data));

//
console.log("===============================");
//
// .text() y .json()

fetch("file.json")
    .then((response) => response.json())
    .then((data) => {
        console.log(data);
    });

fetch("file.json")
    .then((response) => response.text())
    .then((data) => {
        const json = JSON.parse(data);
        console.log(json);
    });
