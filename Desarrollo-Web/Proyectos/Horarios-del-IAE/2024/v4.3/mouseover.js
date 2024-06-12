const ingles = document.querySelectorAll(".ingles");
const dw = document.querySelectorAll(".diseño-web");
const lr = document.querySelectorAll(".lab-redes");
const economia = document.querySelectorAll(".economia");
const mat = document.querySelectorAll(".matematicas");
const fisica = document.querySelectorAll(".fisica");
const geo = document.querySelectorAll(".geometria");
const bd = document.querySelectorAll(".bd");
const elec = document.querySelectorAll(".electronica");
const prog = document.querySelectorAll(".programacion");
const apt = document.querySelectorAll(".apt");
const so = document.querySelectorAll(".so");

ingles.forEach((clase) => {
    clase.addEventListener("mouseover", () => {
        for (let i = 0; i < ingles.length; i++) {
            ingles[i].children[1].classList.add("ingles-on");
            ingles[i].children[1].classList.add("opacity-in");
            ingles[i].children[1].classList.remove("opacity-out");
        }
    });
    clase.addEventListener("mouseleave", () => {
        for (let i = 0; i < ingles.length; i++) {
            ingles[i].children[1].classList.remove("opacity-in");
            ingles[i].children[1].classList.add("opacity-out");
        }
    });
});

dw.forEach((clase) => {
    clase.addEventListener("mouseover", () => {
        for (let i = 0; i < dw.length; i++) {
            dw[i].children[1].classList.add("opacity-in");
            dw[i].children[1].classList.remove("opacity-out");
        }
    });
    clase.addEventListener("mouseleave", () => {
        for (let i = 0; i < dw.length; i++) {
            dw[i].children[1].classList.remove("opacity-in");
            dw[i].children[1].classList.add("opacity-out");
        }
    });
});

lr.forEach((clase) => {
    clase.addEventListener("mouseover", () => {
        for (let i = 0; i < lr.length; i++) {
            lr[i].children[1].classList.add("opacity-in");
            lr[i].children[1].classList.remove("opacity-out");
        }
    });
    clase.addEventListener("mouseleave", () => {
        for (let i = 0; i < lr.length; i++) {
            lr[i].children[1].classList.remove("opacity-in");
            lr[i].children[1].classList.add("opacity-out");
        }
    });
});

economia.forEach((clase) => {
    clase.addEventListener("mouseover", () => {
        for (let i = 0; i < economia.length; i++) {
            economia[i].children[1].classList.add("opacity-in");
            economia[i].children[1].classList.remove("opacity-out");
        }
    });
    clase.addEventListener("mouseleave", () => {
        for (let i = 0; i < economia.length; i++) {
            economia[i].children[1].classList.remove("opacity-in");
            economia[i].children[1].classList.add("opacity-out");
        }
    });
});

mat.forEach((clase) => {
    clase.addEventListener("mouseover", () => {
        for (let i = 0; i < mat.length; i++) {
            mat[i].children[1].classList.add("opacity-in");
            mat[i].children[1].classList.remove("opacity-out");
        }
    });
    clase.addEventListener("mouseleave", () => {
        for (let i = 0; i < mat.length; i++) {
            mat[i].children[1].classList.remove("opacity-in");
            mat[i].children[1].classList.add("opacity-out");
        }
    });
});

fisica.forEach((clase) => {
    clase.addEventListener("mouseover", () => {
        for (let i = 0; i < fisica.length; i++) {
            fisica[i].children[1].classList.add("opacity-in");
            fisica[i].children[1].classList.remove("opacity-out");
        }
    });
    clase.addEventListener("mouseleave", () => {
        for (let i = 0; i < fisica.length; i++) {
            fisica[i].children[1].classList.remove("opacity-in");
            fisica[i].children[1].classList.add("opacity-out");
        }
    });
});

geo.forEach((clase) => {
    clase.addEventListener("mouseover", () => {
        for (let i = 0; i < geo.length; i++) {
            geo[i].children[1].classList.add("opacity-in");
            geo[i].children[1].classList.remove("opacity-out");
        }
    });
    clase.addEventListener("mouseleave", () => {
        for (let i = 0; i < geo.length; i++) {
            geo[i].children[1].classList.remove("opacity-in");
            geo[i].children[1].classList.add("opacity-out");
        }
    });
});

bd.forEach((clase) => {
    clase.addEventListener("mouseover", () => {
        for (let i = 0; i < bd.length; i++) {
            bd[i].children[1].classList.add("opacity-in");
            bd[i].children[1].classList.remove("opacity-out");
        }
    });
    clase.addEventListener("mouseleave", () => {
        for (let i = 0; i < bd.length; i++) {
            bd[i].children[1].classList.remove("opacity-in");
            bd[i].children[1].classList.add("opacity-out");
        }
    });
});

elec.forEach((clase) => {
    clase.addEventListener("mouseover", () => {
        for (let i = 0; i < elec.length; i++) {
            elec[i].children[1].classList.add("opacity-in");
            elec[i].children[1].classList.remove("opacity-out");
        }
    });
    clase.addEventListener("mouseleave", () => {
        for (let i = 0; i < elec.length; i++) {
            elec[i].children[1].classList.remove("opacity-in");
            elec[i].children[1].classList.add("opacity-out");
        }
    });
});

prog.forEach((clase) => {
    clase.addEventListener("mouseover", () => {
        for (let i = 0; i < prog.length; i++) {
            prog[i].children[1].classList.add("opacity-in");
            prog[i].children[1].classList.remove("opacity-out");
        }
    });
    clase.addEventListener("mouseleave", () => {
        for (let i = 0; i < prog.length; i++) {
            prog[i].children[1].classList.remove("opacity-in");
            prog[i].children[1].classList.add("opacity-out");
        }
    });
});

apt.forEach((clase) => {
    clase.addEventListener("mouseover", () => {
        for (let i = 0; i < apt.length; i++) {
            apt[i].children[1].classList.add("opacity-in");
            apt[i].children[1].classList.remove("opacity-out");
        }
    });
    clase.addEventListener("mouseleave", () => {
        for (let i = 0; i < apt.length; i++) {
            apt[i].children[1].classList.remove("opacity-in");
            apt[i].children[1].classList.add("opacity-out");
        }
    });
});

so.forEach((clase) => {
    clase.addEventListener("mouseover", () => {
        for (let i = 0; i < so.length; i++) {
            so[i].children[1].classList.add("opacity-in");
            so[i].children[1].classList.remove("opacity-out");
        }
    });
    clase.addEventListener("mouseleave", () => {
        for (let i = 0; i < so.length; i++) {
            so[i].children[1].classList.remove("opacity-in");
            so[i].children[1].classList.add("opacity-out");
        }
    });
});
