/* Inicio - Video Banner */

var video = document.getElementById("video-banner");
var audio = document.getElementById("volume-range");

function bannerAudio() {
    video.volume = 0;
}

document.body.onload = bannerAudio();

// Voy a dejar para después el tema de los controles personalizados del video

/* function playPause() {
    if (video.paused) {
        video.play();
        video.style.cursor = "default";
    } else {
        video.pause();
    }
}

function fullScreen() {
    video.requestFullscreen();
    video_controls.style.display = "none";
}

function videoVolume() {
    video.volume = audio.value * audio.value;
}

video.addEventListener("click", playPause);
video.addEventListener("dblclick", fullScreen); */

/* Fin - Video Banner */

/*
    =================================================================================================================
    =================================================================================================================
    =================================================================================================================
*/

/* Inicio - Juegos */

const game = document.createElement("div");
console.log(game.isConnected);
game.classList.add("div-pruebas"); 
let div = document.querySelector("#div-games");
game.preppend(div);
game.style.background = "black";
/* Fin - Juegos */