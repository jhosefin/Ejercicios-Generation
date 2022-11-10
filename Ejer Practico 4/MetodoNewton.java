import java.io.Console;

/*
 * P1. El método de Newton para calcular una aproximación de la raíz cuadrada de un número N se basa en el
cálculo iterativo de la siguiente expresión:

Xi+1 = 1/2 (Xi + N/ Xi)


En que X es el valor de la raíz cuadrada de N que en cada iteración se calcula con mayor precisión, o sea,
mientras más veces se realice la iteración, más cercano será el valor de Xi al valor exacto de la raíz cuadrada de
N. Normalmente se parte usando el valor N/2 para la primera iteración, es decir se parte con X0 = N/2. Luego
se calculará X1 = 1⁄2( X0+N/ X0 ), X2 = 1⁄2( X1+N/ X1 ), y así sucesivamente.
a) Escriba un método (función) con el siguiente encabezado: double raiz(double n, int i) que retorne la
aproximación de la raíz cuadrada del número n con i iteraciones usando el método de Newton.
b) Use el método (función) anterior en un programa que pida un número real (de tipo double) e imprima la
tabla que se muestra a continuación:
Ingrese el número: 6
Valores aproximados de raíz cuadrada de 6
1 aprox1 %error1
2 aprox2 %error2
...
i aproxi %errori
...
20 aprox20 %error20
aproxi: es el valor de la aproximación de la raíz cuadrada del número ingresado calculada por el método
de Newton con i iteraciones
%errori: es el error de la aproximación con el valor real de la raíz expresado en forma porcentual con
respecto al valor obtenido con i iteraciones*/
public class MetodoNewton {

    static Double Raiz(double n, int i){

        Double X0 = n/2;
        Double resul = 0.0;
        Double Xi = Math.sqrt(n);
        i=0;

        while(resul != Xi && i != n){ 
            resul = 1/2 * (X0 + n / X0);
            X0 = resul;
            i++;
        }

        return resul + i;
        
    }

    public static void main(String[] args) { 

        Console console = System.console();

        Double n = Double.parseDouble(console.readLine("Ingrese el numero: "));
        int i =0;

        System.out.println(Raiz(n, i));


}
}




/*P2. En este problema buscamos ayudar a un profesor a procesar las notas finales de los 30 alumnos de su curso
de Programación en Java. Por razones de estandarización, todos los nombres se leen de la forma:
apellido,nombre y las notas se leen una a una por teclado. Por ejemplo:
Alumno 1? Perez,Juan
Nota 1? 6.1
Nota 2? 5.8
Nota 3? 6.6
Nota 4? 7.0
Nota 5? 6.6
Alumno 2? Espinoza,Rosita
Nota 1? 6.8
...
a) Usando un arreglo de strings de dimensiones 30 x 6, escriba un programa que simule el diálogo anterior,
llene el arreglo y calcule el promedio final de cada alumno, mostrando los resultados de la siguiente forma:
Promedio del alumno 1 (Juan Perez): 6.42
Promedio del alumno 2 (Rosita Espinoza): ...
b) A partir del arreglo creado anteriormente, imprima en pantalla cuál es el nombre del/la mejor alumno/a del
curso.
 */

