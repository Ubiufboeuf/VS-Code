const hora_actual = document.getElementById('hora-actual');

const intervalo = setInterval(() => {
    
    const local = new Date();

    let hora = local.toLocaleTimeString('en-US', {
        hour: 'numeric',
        minute: 'numeric',
        hour12: true,
    });

    hora_actual.innerHTML = `<p>${hora}</p>`

}, 1000);

// https://es.stackoverflow.com/questions/459678/javascript-reloj-digital-separar-componente e IA