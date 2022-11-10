/*Hay 12 personas en una isla. Una persona pesa menos que las demás, 11 personas pesan exactamente lo mismo. 
Hay un balancín que se puede usar para pesar a las personas.

Diseña un algoritmo para encontrar a la persona que pesa menos.
El balancín solo se puede usar como máximo 4 veces; ¿Cómo se ve tu algoritmo?
El balancín solo se puede usar como máximo 3 veces; ¿Cómo se ve tu algoritmo?*/

var personas = 12;
var pesoMenor = [];
function pesoPersonas(){
    for (i=0 ; 4; i++){
            pesoMenor = pesoPersonas + pesoMenor;

        if(pesoPersonas < pesoMenor){
            pesoMenor = pesoPersonas;
        }
        }
        for (i=0 ; 3; i++){
            pesoMenor = pesoPersonas + pesoMenor;

        if(pesoPersonas > pesoMenor){
            pesoMenor = pesoPersonas;
        }
        }
}



pesoPersonas(45);
console.log(pesoMenor);
