/* Inicio - Video Banner */

/* Fin - Video Banner */

/*
    =================================================================================================================
    =================================================================================================================
    =================================================================================================================
*/

/* Inicio - Games */

let body = document.body;
let allGames;
let cdg = document.querySelector("#contenedor-div-games");

fetch("games.json")
    .then((response) => response.json())
    .then((data) => {
        // console.log(data.games[0].assets.cover);
        const games = data.games;

        let imgLogo = document.querySelector("#logo");
        let div_games = document.querySelector("#div-games");
        const juego_base = document.createElement("button");
        const img = document.createElement("img");
        const div = document.createElement("div");
        const h4 = document.createElement("h4");
        const img2 = img.cloneNode();

        juego_base.classList.add("game");
        img.setAttribute("alt", "Juego");
        div.classList.add("game-info");
        img2.setAttribute(
            "src",
            "../../Assets/Imgs/Logos/Logo - Nintendo - Blanco a100.svg"
        );
        img2.setAttribute("alt", "Nintendo&reg;");

        div.append(h4, img2);
        juego_base.append(img, div);

        body.addEventListener("load", inicio());

        function inicio() {
            imgLogo.setAttribute("src", games[0].assets.logo);
        }

        function newGame() {
            for (let i = 0; i < games.length; i++) {
                let game = juego_base.cloneNode(true);

                game.setAttribute("id", `game-${i + 1}`);

                if (games[i].border == "0") {
                    // game.classList.add("border-radius-0");
                }

                game.setAttribute("number", i);

                // console.log(games[i].assets.cover)
                game.children[0].setAttribute("src", games[i].assets.cover);
                game.children[1].setAttribute("id", `info-game-${i + 1}`);
                game.children[1].children[0].textContent = games[i].name;

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

        newGame();

        allGames = document.querySelectorAll(".game");
        let translated = false;

        allGames.forEach((game) => {
            let j;
            cdg.setAttribute("src", "transition: transform 1s ease");

            game.addEventListener("mouseover", () => {
                // console.log(game.children[0]);
                let n = game.getAttribute("number");
                imgLogo.setAttribute("src", games[n].assets.logo);
            });

            let n = game.getAttribute("number");
            game.children[1].children[0].textContent = games[n].name;

            // Esta función debe ser el evento "click"
            game.addEventListener("click", (event) => {
                let n = game.getAttribute("number");
                j = +n + 1;
                let gh4 = game.children[1].children[0].textContent.cloneNode;

                console.log(gh4);

                if (translated === false) {
                    translated = true;
                    console.log(cdg);
                    cdg.classList.remove("cdg-restart");
                    cdg.classList.add("cdg-animated");

                    game.children[1].children[0].textContent = "Seleccionado";
                    game.children[1].setAttribute("style", "opacity: 1;");
                } else {
                    if (event.target.getAttribute("style", "opacity: 1;")) {
                        translated = false;
                        // console.log(cdg);
                        cdg.classList.remove("cdg-animated");
                        cdg.classList.add("cdg-restart");

                        for (let i = 0; i < games.length; i++) {
                            allGames[i].children[1].children[0].textContent =
                                games[i].name;
                            allGames[i].children[1].removeAttribute("style");
                        }
                    } else {
                        translated = true;
                        for (let i = 0; i < games.length; i++) {
                            allGames[i].children[1].children[0].textContent =
                                games[i].name;
                            allGames[i].children[1].removeAttribute("style");
                        }
                        game.children[1].children[0].textContent =
                            "Seleccionado";
                        game.children[1].setAttribute("style", "opacity: 1;");  
                    }
                }
            });
        });
    });
/* Fin - Games */
