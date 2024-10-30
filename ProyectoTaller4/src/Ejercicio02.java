import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        // Bloque de declaracion de variables
        double primerHijo, segundoHijo, tercerHijo, gastosTotales;
        Scanner teclado = new Scanner(System.in);
        
        //Bloque de datos de entrada y salida 
        System.out.print("Ingrese los datos de gasto del Primer Hijo: ");
        primerHijo = teclado.nextDouble();
        System.out.print("Ingrese los datos de gasto del Segundo Hijo: ");
        segundoHijo = teclado.nextDouble();
        System.out.print("Ingrese los datos de gasto del Tercer Hijo: ");
        tercerHijo = teclado.nextDouble();
        
        // Bloque de procesamiento de bloques de entrada 
        gastosTotales = (primerHijo + segundoHijo + tercerHijo); 
        
        // Bloque de salida de resultados 
        System.out.println("Los gastos totales son: " + gastosTotales);   
    }
}

/***
 * Ingrese los datos de gasto del Primer Hijo: 96
 * Ingrese los datos de gasto del Segundo Hijo: 78
 * Ingrese los datos de gasto del Tercer Hijo: 120
 * Los gastos totales son: 294.0
 */