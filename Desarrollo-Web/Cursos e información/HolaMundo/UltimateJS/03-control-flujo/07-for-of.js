// while
// do while
// for

// el for-of es prácticamente lo mismo que el for-each de c#

let comidas = ['Pachos', 'Pizza', 'Galleta'];

for (let comida of comidas) {
    console.log(comida);
}

let i = 0;
while (i < comidas.length) {
    console.log(comidas[i]);
    i++;
}