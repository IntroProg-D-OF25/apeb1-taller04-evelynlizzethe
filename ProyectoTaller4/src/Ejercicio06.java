import java.util.Scanner; 
public class Ejercicio06 {
    public static void main(String[] args) {
        // Bloque declaracion de variables -> Datos de Entrada y Salida
        double pagoMensual, interesMensual, pagoTotal, year;
        year = 12; 
        Scanner teclado = new Scanner(System.in); 
        
        // Bloque de lectura de datos de entrada
        System.out.print("Ingrese el monto del prestamo: ");
        pagoMensual = teclado.nextDouble();
        System.out.print("Ingrese el monto de interes anual: ");
        interesMensual = teclado.nextDouble();
        
         // Bloque de procesamiento de datos de entrada
        pagoTotal = (pagoMensual * interesMensual * year); 
        
        // Bloque de salida
        System.out.println("El pago mensual es: " + pagoTotal);
    }
}

/***
 * Ingrese el monto del prestamo: 2000
 * Ingrese el monto de interes anual: 15
 * El pago mensual es: 360000.0
 */