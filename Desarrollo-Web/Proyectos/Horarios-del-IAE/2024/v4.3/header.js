const reloj = document.querySelector("#reloj");
const materiaActual = document.querySelector("#materia-actual>.info>.valor");
const horaActual = document.querySelector("#hora-actual>.info>.valor");
const diaActual = document.querySelector("#dia-actual>.info>.valor");

let valMateriaActual;
let valHoraActual;
let valDiaActual;
let valHoraClase;
let horaMilitar;

const lun = document.querySelector("article.article-dias.lunes");
const mar = document.querySelector("article.article-dias.martes");
const mie = document.querySelector("article.article-dias.miercoles");
const jue = document.querySelector("article.article-dias.jueves");
const vie = document.querySelector("article.article-dias.viernes");

const hora1 = document.querySelector("article.hora1");
const hora2 = document.querySelector("article.hora2");
const hora3 = document.querySelector("article.hora3");
const hora4 = document.querySelector("article.hora4");
const hora5 = document.querySelector("article.hora5");
const hora6 = document.querySelector("article.hora6");
const hora7 = document.querySelector("article.hora7");
const hora8 = document.querySelector("article.hora8");
const hora9 = document.querySelector("article.hora9");
const hora10 = document.querySelector("article.hora10");
const hora11 = document.querySelector("article.hora11");

// 

setInterval(() => {
    const date = new Date();
    const tiempo = date.toLocaleTimeString("es-ES", {
        hour: "numeric",
        minute: "numeric",
        second: "numeric"
    });
    const hora = date.toLocaleTimeString("es-ES", {
        hour: "numeric"
    });
    const minuto = date.toLocaleTimeString("es-ES", {
        minute: "numeric"
    });
    let dia = date.toString();
    dia = dia.substring(0, 3);
    
    horaMilitar = hora + minuto;

    // 

    if (dia == "Sun") valDiaActual = "Domingo"
    else if (dia == "Mon") valDiaActual = "Lunes"
    else if (dia == "Tue") valDiaActual = "Martes"
    else if (dia == "Wed") valDiaActual = "Miércoles"
    else if (dia == "Thu") valDiaActual = "Jueves"
    else if (dia == "Fri") valDiaActual = "Viernes"
    else if (dia == "Sat") valDiaActual = "Sábado"
    
    if (horaMilitar >= 1300 && horaMilitar < 1345) valHoraClase = 1
    else if (horaMilitar >= 1345 && horaMilitar < 1430) valHoraClase = 2
    else if (horaMilitar >= 1430 && horaMilitar < 1435) valHoraClase = 3
    else if (horaMilitar >= 1435 && horaMilitar < 1520) valHoraClase = 4
    else if (horaMilitar >= 1520 && horaMilitar < 1605) valHoraClase = 5
    else if (horaMilitar >= 1605 && horaMilitar < 1610) valHoraClase = 6
    else if (horaMilitar >= 1610 && horaMilitar < 1655) valHoraClase = 7
    else if (horaMilitar >= 1655 && horaMilitar < 1740) valHoraClase = 8
    else if (horaMilitar >= 1740 && horaMilitar < 1745) valHoraClase = 9
    else if (horaMilitar >= 1745 && horaMilitar < 1830) valHoraClase = 10
    else if (horaMilitar >= 1830 && horaMilitar < 1915) valHoraClase = 11
    else valHoraClase = "Fuera del rango horario"

    // 
    
    function funcMateriaActual(mat, dia, hora) {
        if (dia == "Lunes" && hora == 1 || hora == 2) mat = "Inglés"
        else if (dia == "Lunes" && hora == 4 || hora == 5) mat = "Física"
        else if (dia == "Lunes" && hora == 7 || hora == 8 || hora == 10) mat = "Electrónica"
        else if (dia == "Martes" && hora == 1 || hora == 2) mat = "Diseño Web"
        else if (dia == "Martes" && hora == 4 || hora == 5) mat = "Geometría"
        else if (dia == "Martes" && hora == 7 || hora == 8 || hora == 10) mat = "Programación"
        else if (dia == "Martes" && hora == 11) mat = "Matemáticas"
        else if (dia == "Miércoles" && hora == 1) mat = "Matemáticas"
        else if (dia == "Miércoles" && hora == 2 || hora == 4) mat = "LAB Redes"
        else if (dia == "Miércoles" && hora == 5) mat = "Economía"
        else if (dia == "Miércoles" && hora == 7) mat = "APT"
        else if (dia == "Miércoles" && hora == 8 || hora == 10 || hora == 11) mat = "Sistemas op."
        else if (dia == "Jueves" && hora == 1 || hora == 2) mat = "Economía"
        else if (dia == "Jueves" && hora == 4) mat = "Física"
        else if (dia == "Jueves" && hora == 5 || hora == 7 || hora == 8) mat = "Bases de datos"
        else if (dia == "Viernes" && hora == 1 || hora == 2) mat = "Matemáticas"
        else if (dia == "Viernes" && hora == 2) mat = "Inglés"
        else if (dia == "Viernes" && hora == 4 || hora == 5) mat = "LAB Redes"
        else if (dia == "Viernes" && hora == 7 || hora == 8) mat = "APT"
        else if (dia == "Viernes" && hora == 10) mat = "Geometría"

        if (dia != "Sábado" && dia != "Domingo") {
            (hora == 3 || hora == 6 || hora == 9) ? mat = "Recreo" : mat = "Fuera del rango horario"
        } else {
            mat = "Es fin de semana, por favor, ¡descansa!"
        }
        
        return mat;
    }

    reloj.textContent = tiempo;
    horaActual.textContent = valHoraClase;
    diaActual.textContent = valDiaActual;
    materiaActual.textContent = funcMateriaActual(valMateriaActual, valDiaActual, valHoraClase);

}, 1000);
