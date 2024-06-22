// Funciones anónimas

// Función anónima "saludo"
const saludo = function () {
    return "Hola";
};

saludo; // ƒ () { return 'Hola'; }
saludo(); // 'Hola'


// =================================

// Arrow functions

const func = function () {
    return "Función tradicional.";
};

const func2 = () => {
    return "Función flecha.";
};
