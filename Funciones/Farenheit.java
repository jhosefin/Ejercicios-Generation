/*3. Escriba una función que, dada una temperatura en grados Celsius, la devuelva en grados
Fahrenheit. Use su función en un programa que lea una cantidad indeterminada de
temperaturas en Celsius (que termina cuando se ingresa el valor -999) e imprima en pantalla el
valor correspondiente en Fahrenheit.*/

import java.io.Console;



public class Farenheit {

    static String Afarenheit ( String mensaje, float celsius){
        Float resultado = 0f;
        resultado = (celsius * 1.8f)+32;
            return mensaje + resultado;

    }



    public static void main(String[] args) {

        Console console = System.console();

        System.out.println("-------------------Aqui conoceras el valor en farenheit de tu temperatura en celsius ---------------------------");

        Float celsius = Float.parseFloat(console.readLine("Ingrese su temperatura en celsius: "));
        

        System.out.println(Afarenheit("Su temperatura en farenheit es: ",celsius));
    }
    
}

