/*Escriba un programa para ordenar una lista de números en orden descendente (de mayor a menor).*/
var matriz = [3,8,9,0, 5, 7, 1];

  //  console.log(matriz.sort(function(a, b){return a-b}));


/*for(var i = 10; i > 0; i--) {
    if(matriz.includes(i)) {console.log(i);}
}*/
var matriz = [3,8,9,0, 5, 7, 1];

for(var i = 0; i < matriz.length; i++){
for (var j=0 ; j < matriz.length; j++){
if (matriz[j]<matriz[j+1]){

    var matriz2 = matriz[j];
    matriz[j] = matriz[j+1];
    matriz[j+1] = matriz2;
}

}
    }

    for ( i = 0 ; i < matriz.length;i++){
        console.log(matriz[i]);
        }




        /* for(var i = 0; i< matriz.length;i++) {

            if (matriz[i] > matriz[i+1]){
                var matriz2= matriz[i];
                matriz[i] = matriz[i+1];
                matriz[i+1] = matriz2;
            }

            if (matriz[i+1] > matriz[i+]){
                matriz2= matriz[i+1];
                matriz[i+1] = matriz[i+2];
                matriz[i+2] = matriz2;
            }
        
        } 
        console.log(matriz);*/
