const url = new URL("https://www.google.com/");
const params = new URLSearchParams("?color=red&sound=enabled");

// Añadimos la variable fullscreen
url.searchParams.append("fullscreen", "true");
url.search;

window.location.href = url;
