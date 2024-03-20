let user = {
    id: 1,
    name: 'galleta',
    age: 25,
};

for (let propiedad in user) {
    console.log(propiedad, user[propiedad]);
}

// console.log(user);

let comidas = ['Albondigas', 'Hamburguesas', 'Hielo'];
for (let indice in comidas) {
    console.log(indice, comidas[indice]);
}

/*
    ============================================================================================
    Es mucho más recomendado acceder a los elementos de un array con un for-of que con un for-in
    ============================================================================================
*/