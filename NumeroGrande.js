/*Escriba un programa que tome una matriz de números y devuelva el número más grande de la lista. 
Ejemplo: La matriz dada es [3, 5, 7, 1, 6] El número más grande es 7.*/

var matriz = [3, 5, 7, 1, 6];
var numGrande = 0;

    for(var i = 0; i < matriz.length; i++){

        if(numGrande < matriz[i] ){

            numGrande = matriz[i];

        }
    }
    console.log(numGrande);