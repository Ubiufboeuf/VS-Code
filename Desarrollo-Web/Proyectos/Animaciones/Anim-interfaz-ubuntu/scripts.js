const options = {
    month: "long",
    day: "numeric",
    hour: "numeric",
    minute: "numeric",
};
document.getElementById("current_date").innerHTML =
    new Date().toLocaleDateString("es-ES", options);
