/*4. Escriba una función que reciba una fecha en formato DDMMAAAA y la devuelva en formato
AAAAMMDD. Use su función en un programa que reciba por teclado dos fechas (en formato
DDMMAAAA) e imprima en pantalla la mayor.*/

import java.io.Console;




public class InvertirFecha {

    static String Promedios1 ( String mensaje, int dia, int mes, int año){
        String resultado = "";
        resultado = año+"/"+ mes+"/" + dia;
            return mensaje + resultado;

    }




    public static void main(String[] args) {

        Console console = System.console();

        System.out.println("-------------------Aqui Invertiremos las fechas---------------------------");

        
            System.out.println("Ingrese fecha 1:");
        int dia = Integer.parseInt(console.readLine("Ingrese el numero del dia: "));
        int mes = Integer.parseInt(console.readLine("Ingrese el numero del mes: "));
        int año = Integer.parseInt(console.readLine("Ingrese el numero del año: "));
        System.out.println("Fecha es:"+dia+"/"+mes+"/"+año);


        System.out.println(Promedios1("Su fecha invertida es: ",dia, mes,año));

    }
    
}
