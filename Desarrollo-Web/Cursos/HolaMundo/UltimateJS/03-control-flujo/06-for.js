/* let i = 2;
while (i < 2) {
    if (i % 2 == 0) {
        console.log('Número par', i);
    }
    i++;
} */

for (i = 2; i < 10; i++) { // aquí el primer i puede o no tener un 'let', aunque 'i' no esté "declarado" en ningún lado
    if (i % 2 == 0) {
        console.log('Número par', i);
    }
}