import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        // Bloque declaracion de variables -> Datos de Entrada y Salida
        double cpuComp, tecladoComp, pantallaComp, ratonComp, costoCompTotal; 
        Scanner computador = new Scanner(System.in);
        
        // Bloque de lectura de datos de entrada
        System.out.print("Ingrese el coste del CPU: "); 
        cpuComp = computador.nextDouble(); 
        System.out.print("Ingrese el coste del Teclado: "); 
        tecladoComp = computador.nextDouble();
        System.out.print("Ingrese el coste del Monitor: "); 
        pantallaComp = computador.nextDouble();
        System.out.print("Ingrese el coste del ratón del computador: "); 
        ratonComp = computador.nextDouble();
        
        // Bloque de procesamiento de datos de entrada
        costoCompTotal = (cpuComp + tecladoComp + pantallaComp + ratonComp); 
        
        // Bloque de salida de resultados
        System.out.println("El costo total del computador es = " 
                + costoCompTotal);
    }
}

/***
 * Ingrese el coste del CPU: 125
 * Ingrese el coste del Teclado: 67
 * Ingrese el coste del Monitor: 400
 * Ingrese el coste del rat�n del computador: 50
 * El costo total del computador es = 642.0
 */