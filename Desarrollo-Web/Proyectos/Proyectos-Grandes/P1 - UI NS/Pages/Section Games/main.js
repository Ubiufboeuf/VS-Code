/* Inicio - Variables Globales */

let body = document.body;

let game;
let juegos;
let cdg = document.querySelector("#contenedor-div-games");
let gameLogo = document.querySelector("#logo");
let gameBanner = document.querySelector("#video-banner");
let div_games = document.querySelector("#div-games");

const cjs = document.querySelector(".contenedor-js");
const js = document.querySelector(".juego-seleccionado");

// Creación de elementos
const juego_base = document.createElement("button");
const img = document.createElement("img");
const div = document.createElement("div");
const h4 = document.createElement("h4");
const logoNintendo = document.createElement("img");

// Asignación de elementos
juego_base.classList.add("game");
juego_base.append(img, div);
img.setAttribute("alt", "Juego");
div.classList.add("game-info");
div.append(h4, logoNintendo);
logoNintendo.setAttribute("src", "../../Assets/Imgs/Logos/Logo - Nintendo - Blanco a100.svg");
logoNintendo.setAttribute("alt", "Nintendo&reg;");

/* Fin - Variables Globales */

/* ================================================================================================================= */

/* Inicio - Importación 'games.json' */

fetch("games.json")
    .then((response) => response.json())
    .then((data) => functionFetch(data))
    .catch((errors) => console.log(errors));

/* Fin - Importación 'games.json' */

/* ================================================================================================================= */

/* Inicio - Función con información de 'games.json' */

function functionFetch (data) {
    /* Inicio - Creación e implementación de los juegos */

    function functionGames(data) {
        for (let i = 0; i < data.games.length; i++) {
            game = juego_base.cloneNode(true);

            game.setAttribute("id", `game-${i + 1}`);
            game.setAttribute("idx", i);

            game.children[0].setAttribute("src", data.games[i].assets.cover);
            game.children[1].setAttribute("id", `info-game-${i + 1}`);

            game.children[1].children[0].textContent = data.games[i].name;

            // Juegos sin carátula
            if (!game.children[0].hasAttribute("src")) {
                game.children[0].setAttribute("src", "../../Assets/Imgs/Covers/Cover - Case Switch Game.svg");
                game.children[0].setAttribute("alt", "noCover");
                game.classList.add("noCover");
            } else {
                game.classList.remove("noCover");
            }

            div_games.append(game);
        }
    }

    functionGames(data);

    /* Fin - Creación e implementación de los juegos */

    /* ================================================================================================================= */

    /* Inicio - Contenido extra de los juegos */

    function extraOfGames(data) {
        juegos = document.querySelectorAll(".game");

        gameLogo.setAttribute("src", data.games[0].assets.logo);

        /* Inicio - game mouseover */

        for (let i = 0; i < data.games.length; i++) {
            game = juegos[i];

            game.addEventListener("mouseover", () => {
                gameLogo.setAttribute("src", data.games[i].assets.logo);
            });
        }

        /* Fin - game mouseover */

        /* ================================================================================================================= */

        /* Inicio - gaem click */
        let divAnim = false;

        juegos.forEach((game) => {

            let idx = game.getAttribute("idx");

            let gameTitle = document.querySelector(".nombre-js");

            const titleAnim = [
                { transform: "translateX(100%)" },
                { transform: "translateX(-100%)" },
            ];

            const titleAnimOp = {
                duration: 6000,
                easing: "linear",
                iterations: Infinity,
            };

            js.classList.add("ap-js");

            game.addEventListener("click", (event) => {
                
                if (divAnim == false) {
                    divAnim = true;

                    // console.log("if - anim",divAnim);
                    // console.log("if", game);

                    // Se anima la "entrada" (derecha) de los juegos
                    cdg.classList.remove("cdg-restart");
                    cdg.classList.add("cdg-animated");

                    // Texto informativo del juego
                    game.children[1].setAttribute("style", "opacity: 1;");
                    game.children[1].children[0].textContent = "Seleccionado";

                    // console.log("post style", game);

                    // Se anima la aparición del div del juego seleccionado
                    cjs.classList.remove("rm-js");
                    cjs.classList.add("ap-js");

                    // Imagen juego seleccionado
                    js.children[0].setAttribute("src", data.games[idx].assets.cover);
                    
                    // Título sobre el juego seleccionado
                    gameTitle.textContent = data.games[idx].fullName;
                    gameTitle.animate(titleAnim, titleAnimOp);

                    // Video del banner del juego
                } else {
                    // console.log("else - anim",divAnim);
                    // console.log("else", game);

                    if (game.children[1].hasAttribute("style")) {
                        divAnim = false;

                        game.children[1].removeAttribute("style");
                        game.children[1].children[0].textContent = data.games[idx].name;
                        // console.log("fuera");


                        // Se anima la "salida" (izq.) de los juegos
                        cdg.classList.remove("cdg-animated");
                        cdg.classList.add("cdg-restart");


                        // Se anima la aparición del div del juego seleccionado
                        cjs.classList.add("rm-js");
                        cjs.classList.remove("ap-js");
                    } else {
                        // console.log("else - else");
                        for (let i = 0; i < juegos.length; i++) {
                            juegos[i].children[1].removeAttribute("style");
                            juegos[i].children[1].children[0].textContent = data.games[i].name;
                            // console.log("restaurado");
                        }
                        game.children[1].setAttribute("style", "opacity: 1;");
                        game.children[1].children[0].textContent = "Seleccionado";
                        // console.log("nuevo");

                        // Imagen juego seleccionado
                        js.children[0].setAttribute("src", data.games[idx].assets.cover);
                        
                        // Título sobre el juego seleccionado
                        gameTitle.textContent = data.games[idx].fullName;
                        gameTitle.animate(titleAnim, titleAnimOp);
                    }
                }
            });
        });
    }
    extraOfGames(data);
};

let aviso = document.createElement("a");
aviso.setAttribute("id", "aviso");
aviso.setAttribute("href", "./aviso.html");
aviso.textContent = "Ver aviso";

body.append(aviso);