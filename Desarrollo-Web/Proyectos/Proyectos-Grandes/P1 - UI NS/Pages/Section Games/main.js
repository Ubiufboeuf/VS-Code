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
logoNintendo.setAttribute(
    "src",
    "../../Assets/Imgs/Logos/Logo - Nintendo - Blanco a100.svg"
);
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

const functionFetch = (data) => {
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
                game.children[0].setAttribute(
                    "src",
                    "../../Assets/Imgs/Covers/Cover - Case Switch Game.svg"
                );
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

        for (let i = 0; i < data.games.length; i++) {
            let video = data.games[i].assets.ytVideo + "&autoplay=1&mute=1";
            let da = false; // da es div-animation
            let title = document.querySelector(".nombre-js");

            // let gh4 = game.children[1].children[0].textContent.cloneNode;

            game = juegos[i];
            // cdg.setAttribute("src", "transition: transform 1s ease");
            // game.children[1].children[0].textContent = data.games[i].name;
            js.classList.add("ap-js");

            const titleAnimation = [
                { transform: "translateX(100%)" },
                { transform: "translateX(-100%)" },
            ];
            const titleAnimationOptions = {
                duration: 6000,
                easing: "linear",
                iterations: Infinity,
            };

            // console.log(game);

            game.addEventListener("click", (event) => {
                if (da == false) {
                    da = true;

                    game = juegos[i];

                    // Movimiento del div-games
                    cdg.classList.remove("cdg-restart");
                    cdg.classList.add("cdg-animated");

                    // Texto información del juegp
                    game.children[1].setAttribute("style", "opacity: 1;");
                    game.children[1].children[0].textContent = "Seleccionado";

                    // Contenedor del juego seleccionado
                    cjs.classList.remove("rm-js");
                    cjs.classList.add("ap-js");

                    // Imagen juego seleccionado
                    js.children[0].setAttribute(
                        "src",
                        data.games[i].assets.cover
                    );

                    // Título del juego sobre el juego seleccionado
                    title.textContent = data.games[i].fullName;
                    title.animate(titleAnimation, titleAnimationOptions);

                    // Video del banner del juego
                    gameBanner.setAttribute("src", video);

                    //
                } else {
                    //
                    da = false;

                    game = juegos[i];

                    if (game.children[1].getAttribute("style", "opacity: 1;")) {
                        // Movimiento del div-games
                        cdg.classList.remove("cdg-animated");
                        cdg.classList.add("cdg-restart");

                        // Texto h4 de la información del juego
                        game.children[1].removeAttribute("style");

                        // Contenedor del juego seleccionado
                        cjs.classList.remove("rm-js");
                        cjs.classList.add("rm-js");

                        // Título del juego sobre el juego seleccionado
                        title.textContent = "";

                        for (let i = 0; i < data.games.length; i++) {
                            juegos[i].children[1].children[0].textContent =
                                data.games[i].name;
                            juegos[i].children[1].removeAttribute("style");
                        }
                        // 
                    } else {
                        // Movimiento del div-games

                        // Texto h4 de la información del juego
                        game.children[1].children[0].textContent =
                            "Seleccionado";
                        game.children[1].setAttribute("style", "opacity: 1;");

                        // Contenedor del juego seleccionado
                        js.children[0].setAttribute(
                            "src",
                            juegos[i].assets.cover
                        );

                        // Imagen juego seleccionado
                        title.textContent = juegos[i].fullName;
                        console.log(title);
                        title.animate(titleAnimation, titleAnimationOptions);
                        console.log(title.getAnimations);

                        gameBanner.setAttribute("src", video);

                        for (let i = 0; i < data.games.length; i++) {
                            juegos[i].children[1].children[0].textContent =
                                data.games[i].name;
                            juegos[i].children[1].removeAttribute("style");
                        }
                    }
                }
            });
        }
    }
    extraOfGames(data);
};
