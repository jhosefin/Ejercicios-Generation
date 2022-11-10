import java.io.Console;

/*2. Escriba una función tal que recibe un número entero positivo. Si es par, debe devolver su
antecesor y en caso contrario, su sucesor.*/


public class AntesesorYSucesor {

    static String ParoImpar ( String mensaje, int num){
        int resultado = 0;

        if (num % 2 == 0){
            resultado = num -1;
            mensaje ="Su numero es par, y su Antecesor es: ";
        }else{
            resultado = num+1;
            mensaje ="Su numero es Impar, y su Sucesor es: ";
        }
        
            return mensaje + resultado;

    }



    public static void main(String[] args) {

        Console console = System.console();

        System.out.println("-------------------Aqui conoceras el Sucesor o Antecesor de un número---------------------------");

        int num = Integer.parseInt(console.readLine("Ingrese el numero: "));

        System.out.println(ParoImpar("", num));
    }
    
}