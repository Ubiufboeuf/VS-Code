const btnNumbers = document.querySelectorAll(".btnNumbers");
const btnSymbols = document.querySelectorAll(".btnSymbols");
const borrarTodo = document.querySelector("#eraseAll");
const borrar = document.querySelector("#erase");
const h1 = document.querySelector("h1");
const p = document.querySelector("p");

let mensajes = {
    cadena_vacía: "La cadena de números está vacía.",
    doble_simbolo: "No puedes usar más de 1 símbolo a la vez.",
};

h1.textContent = "0";
let cadena = ""; // Toda la cadena ingresada
let lastSim = "";

// Eventos - - - - - - - - - -

btnNumbers.forEach((numero) => {
    numero.addEventListener("click", (event) => {
        numeros(numero.value);
    });
});

btnSymbols.forEach((simbolo) => {
    simbolo.addEventListener("click", () => {
        simbolos(simbolo.value);
    });
});

borrar.addEventListener("click", back);
borrarTodo.addEventListener("click", clear);

// Funciones - - - - - - - - - -

function refresco(cadena) {
    h1.textContent = cadena;
    h1.textContent = h1.textContent == "" ? "0" : cadena;

    p.textContent = "[Advertencias]";
}

function back() {
    cadena = cadena.substring(0, cadena.length - 1);
    refresco(cadena);
}

function clear() {
    cadena = "";
    refresco(cadena);
}

function numeros(num) {
    cadena += num;
    refresco(cadena);
}

function simbolos(sim) {
    // Si la cadena no está vacía, cadena != ""
    if (cadena != "") {
        // Si el símbolo no es el igual (=), sim != "="
        if (sim != "=") {
            if (
                lastSim != "+" &&
                lastSim != "-" &&
                lastSim != "*" &&
                lastSim != "/"
            ) {
                lastSim = sim;
                console.log(lastSim);
                switch (sim) {
                    case "+":
                        cadena += sim;
                        refresco(cadena);
                        break;
                }
            } else {
                console.log(mensaje[1]);
            }
        }
        // Si el símbolo es el igual (=), sim == "="
        else {
            // Contenido
        }
    }
    // Si la cadena está vacía, cadena == ""
    else {
        p.textContent = mensajes.cadena_vacía;
    }
}
