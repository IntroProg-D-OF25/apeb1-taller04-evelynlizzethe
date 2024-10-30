import java.util.Scanner; 
public class Ejercicio09 {
    public static void main(String[] args) {
        // Declaracion de variables
        double areatriagRectangulo, baseCuadrado, alturaRect, areaTotal;
        Scanner teclado = new Scanner(System.in); 
        
        // Base de datos de entrada 
        
        System.out.print("Ingrese valores para la base del cuadrado: "); 
        baseCuadrado = teclado.nextDouble();
        System.out.print("Ingrese valores para la altura del rectangulo: "); 
        alturaRect = teclado.nextDouble();
        
        // Bloque de procesamiento de datos de entrada
        areatriagRectangulo = ((baseCuadrado * alturaRect)* 3); 
        baseCuadrado = ( baseCuadrado * baseCuadrado); 
        alturaRect = (baseCuadrado * alturaRect); 
        areaTotal = (areatriagRectangulo + baseCuadrado + alturaRect); 
        
        // Bloque de salida
        System.out.println("El area total es: " + areaTotal);
        
        
    }
}
