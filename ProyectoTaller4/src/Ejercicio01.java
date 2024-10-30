import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        
        // Bloque declaracion de variables -> Datos de Entrada y Salida
        double baseTriangulo, altoTriangulo, areaTriangulo; 
        Scanner teclado = new Scanner(System.in); //Para leer valores desde
                                                 //consola
                                                 
        // Bloque de lectura de datos de entrada
        System.out.print("Ingrese valores para la base del triangulo: ");
        baseTriangulo = teclado.nextDouble();
        System.out.print("Ingrese valores para la altura del triangulo: ");
        altoTriangulo = teclado.nextDouble();
        
        // Bloque de procesamiento de datos de entrada
        areaTriangulo = (baseTriangulo * altoTriangulo) / 2; 
        
        // Bloque de salida de resultados
        System.out.println("Area del triangulo = " + areaTriangulo);
    }
}

/***
 * Ingrese valores para la base del triangulo: 5
 * Ingrese valores para la altura del triangulo: 6
 * Area del triangulo = 15.0
 */
