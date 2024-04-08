/* Inicio - Tiempo */

const hora_actual = document.getElementById("time-p");

const intervalo = setInterval(() => {
    const local = new Date();
    const hour = local.getHours();

    let hora = local.toLocaleTimeString("es-ES", {
        hour: "numeric",
        minute: "numeric",
        hour12: false,
    });

    if (hour < 10) {
        hora = "0" + hora;
    }

    let tarde;
    const cw = document.querySelector("#cuerpo-web");

    if (hour >= 24 || hour <= 4) {
        tarde = true;
    } else {
        tarde = false;
    }

    if (tarde == true) {
        cw.setAttribute("style", "background-color: #060606;");
    } else {
        cw.removeAttribute("style");
    }

    hora_actual.innerHTML = `<p>${hora}</p>`;
}, 1000);

// https://es.stackoverflow.com/questions/459678/javascript-reloj-digital-separar-componente e IA

/* Fin - Tiempo */

/*
    =================================================================================================================
    =================================================================================================================
    =================================================================================================================
*/

/* Inicio - Control de batería */

// function batttick() {
//     navigator.getBattery().then((battery) => {
//         let carga = "";
//         let color = "";
//         carga = battery.level * 100 + "%";

//         if (battery.charging) {
//             // carga += " ⚡";
//             color = "green";
//         }
//         console.log(color, carga);
//         document.getElementById("batery-p").innerHTML = carga;
//         // document.getElementById("batt").style.color = color;
//     });
// }
// batttick();

/* Fin - Control de batería */

/*
    =================================================================================================================
    =================================================================================================================
    =================================================================================================================
*/

/* Inicio - Navegación entre páginas web */

// document
//     .getElementById("button-time")
//     .addEventListener("click", navigateToSettings);
// function navigateToSettings() {
//     window.location.href = "http://localhost:5500/Pages/Page%20Settings/";
// }

/* Fin - Navegación entre páginas web */
