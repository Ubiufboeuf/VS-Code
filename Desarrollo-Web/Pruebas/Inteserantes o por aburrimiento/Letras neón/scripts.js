var btn = document.querySelector("#button");
var video = document.querySelector("iframe");

function toggleVideo() {
    if (btn.innerText == "Mostrar video") {
        btn.innerText = "Ocultar video";
        video.style.height = "315px";
    } else {
        btn.innerText = "Mostrar video";
        video.style.height = "0";
    }
}
