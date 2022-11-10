import java.io.Console;

/*5. Escriba una función que devuelva Verdadero si un número es primo y Falso en caso contrario.
Use su función en un programa que lea por teclado una cantidad indeterminada de números
positivos (que termina si se ingresa un número menor o igual a 1), e imprima sucesivamente si el
número es o no primo.*/

public class NumeroPrimo {

    static String NumeroPrimos (int numero){
        String resultado = "";

        if(numero % 2 == 0){
            resultado = "Verdadero, El numero: "+ numero +" es primo ";
            return resultado;
        }else{
            resultado = "Falso, El numero: "+ numero +" no es primo ";
            return resultado;
        }

    }

    public static void main(String[] args) {
        Console console = System.console();

        boolean resultado = true;

        do{
            int numero = Integer.parseInt(console.readLine("Introduce el número: "));
            System.out.println(NumeroPrimos(numero));
            
                if(numero <=1){
                    System.out.println("");
                    System.out.println("Debe ingresar números mayores de 1");
                    resultado = false;
                }

        }while(resultado == true);

    
}
}