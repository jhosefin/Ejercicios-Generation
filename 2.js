/*Ejercicio #3

Paso 1
Escriba un programa que tome dos listas y devuelva el mayor número de las dos listas. Sugerencia: 
llame a la función del ejercicio de clase n.° 1 (el ejercicio n.° 1 debe devolver un solo número: el número más grande de la lista).

Paso 2
Encuentra un compañero.
Intercambia tu código.
Lea el código de su socio y sugiera mejoras sobre cómo refactorizaría su código.
Pruebe la corrección del código de su compañero (¿da el resultado correcto), si no da el resultado correcto, trabajen juntos para corregir el código.*/

var matriz = [3, 5, 7, 1, 6];
var numGrande = 0;

    for(var i = 0; i < matriz.length; i++){

        if(numGrande < matriz[i] ){

            numGrande = matriz[i];

        }
    }
    console.log(numGrande);