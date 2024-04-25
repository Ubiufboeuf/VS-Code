const p = document.querySelector("#hora");

const intervalo = setTimeout(() => {
        const date = new Date();

        let time = date.toLocaleTimeString("es-ES", {
            hour: "numeric",
            minute: "numeric",
            second: "numeric",
        });

        p.textContent = time;
    }, 1000);