const btnNumbers = document.querySelectorAll(".btnNumbers");
const btnSymbols = document.querySelectorAll(".btnSymbols");
const borrarTodo = document.querySelector("#eraseAll");
const borrar = document.querySelector("#erase");
const h1 = document.querySelector("h1");
const p = document.querySelector("p");
const mensajes = {
    cadena_vacía: "La cadena de números está vacía.",
    doble_simbolo: "No puedes usar más de un símbolo a la vez.",
    falta_simbolo: "Te falta añadir algún símbolo en la ecuación.",
    falta_numero: "No puedes terminar sin un número o paréntesis.",
    cadena_vacía: "Debes ingresar al menos un número.",
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

borrar.addEventListener("click", () => {
    back(cadena);
});
borrarTodo.addEventListener("click", clear);

// Funciones - - - - - - - - - -

function refresco(cadena) {
    h1.textContent = cadena;
    h1.textContent = h1.textContent == "" ? "0" : cadena;
    lastSim = "";
    p.textContent = "[Advertencias]";
}

function numeros(num) {
    cadena += num;
    lastSim = "";
    refresco(cadena);
}

// Al añadir un simbolo
function simbolos(sim) {
    switch (sim) {
        case "+":
            lastSim = sim;
            if (
                cadena[cadena.length - 1] == "-" ||
                cadena[cadena.length - 1] == "*" ||
                cadena[cadena.length - 1] == "/"
            ) {
                cadena = cadena.substring(0, cadena.length - 1);
                cadena += sim;
                refresco(cadena);
            } else {
                if (cadena[cadena.length - 1] != "+") {
                    cadena += sim;
                    refresco(cadena);
                }
            }
            break;
        case "-":
            lastSim = sim;
            if (
                cadena[cadena.length - 1] == "+" ||
                cadena[cadena.length - 1] == "*" ||
                cadena[cadena.length - 1] == "/"
            ) {
                cadena = cadena.substring(0, cadena.length - 1);
                cadena += sim;
                refresco(cadena);
            } else {
                if (cadena[cadena.length - 1] != "-") {
                    cadena += sim;
                    refresco(cadena);
                }
            }
            break;
        case "=":
            console.log("Se dió click al '='");
            let prev = "";
            let simb = "";
            let simbResp = "";
            let sig = "";
            if (
                cadena[cadena.length - 1] != "+" &&
                cadena[cadena.length - 1] != "-" &&
                cadena[cadena.length - 1] != "*" &&
                cadena[cadena.length - 1] != "/"
            ) {
                if (cadena.includes("(") && cadena.includes(")")) {
                    // Código
                } else if (cadena.includes("*") || cadena.includes("/")) {
                    // Código
                } else if (cadena.includes("+") || cadena.includes("-")) {
                    for (char of cadena) {
                        if (char == "+") {
                            simb = "+";
                            console.log("simb:", simb);
                        } else if (char == "-") {
                            simb = "-";
                            console.log("simb:", simb);
                        } else {
                            if (simb == "") {
                                sig += char;
                            } else {
                                if (prev == "") {
                                    prev = sig;
                                    sig = "";
                                    simbResp = simb;
                                    // simb = "";
                                    console.log("simbResp", simbResp);
                                    console.log("simb", simb);
                                } else {
                                    if (simbResp == "+") {
                                        prev = +prev + +sig;
                                    } else {
                                        prev = +prev - +sig;
                                    }
                                    sig = "";
                                    simbResp = simb;
                                    // simb = "";
                                }
                            }
                        }
                    }
                    console.log("cadena:", cadena);
                    console.log("prev:", prev);
                    console.log("sig:", sig);
                } else {
                    p.textContent = mensajes.cadena_vacía;
                    console.log(mensajes.cadena_vacía);
                }
            } else {
                p.textContent = mensajes.falta_numero;
                console.log(mensajes.falta_numero);
            }
            break;
    }
}

function back() {
    cadena = cadena.substring(0, cadena.length - 1);
    refresco(cadena);
}
function clear() {
    cadena = "";
    refresco(cadena);
}
