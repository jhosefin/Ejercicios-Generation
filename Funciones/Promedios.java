import java.io.Console;

/*1. Escriba una función que, dados dos números enteros recibidos como parámetros, devuelva el
promedio entre ellos.*/


public class Promedios {

    static String Promedios1 ( String mensaje, float num1, float num2){
        Float resultado = 0f;
        resultado = (num1 + num2)/2;
            return mensaje + resultado;

    }



    public static void main(String[] args) {

        Console console = System.console();

        System.out.println("-------------------Aqui conoceras el promedio de dos números---------------------------");

        int num1 = Integer.parseInt(console.readLine("Ingrese el primer numero: "));
        int num2 = Integer.parseInt(console.readLine("Ingrese el segundo numero: "));

        System.out.println(Promedios1("El promedio de los números es: ",num1, num2));
    }
    
}
