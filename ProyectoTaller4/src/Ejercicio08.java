import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        double youtubePremium, spotify, dropbox, netflix, edad, costoMensual,
               descuento;
        Scanner teclado = new Scanner(System.in);
        
        // Bloque datos de entrada 
        System.out.print("Ingresar el costo mensual de YouTube Premium: ");
        youtubePremium = teclado.nextDouble();
        System.out.print("Ingresar el costo mensual de Netflix: ");
        netflix = teclado.nextDouble();
        System.out.print("Ingresar el costo mensual de Dropbox: ");
        dropbox = teclado.nextDouble();
        System.out.print("Ingresar el costo mensual de Spotify: ");
        spotify = teclado.nextDouble();
        System.out.print("Ingresar su edad: ");
        edad = teclado.nextInt();
        
         // Bloque de procesamiento de datos de entrada 
         costoMensual = (youtubePremium + netflix + dropbox + spotify);
         
         // Condicionales
        if (edad < 30){
            descuento = ((costoMensual * 20) / 100);
            costoMensual = (costoMensual - descuento);
            System.out.println("El valor a pagar es: " + costoMensual);
        } else {
        // Bloque de procesamiento de salida 
             System.out.printf("El valor a pagar es: " + costoMensual);
        }
    }
}

/***
 * Ingresar el costo mensual de YouTube Premium: 8
 * Ingresar el costo mensual de Netflix: 9
 * Ingresar el costo mensual de Dropbox: 5
 * Ingresar el costo mensual de Spotify: 3
 * Ingresar su edad: 25
 * El valor a pagar es: 20.0
 */

/***
 * Ingresar el costo mensual de YouTube Premium: 8
 * Ingresar el costo mensual de Netflix: 9
 * Ingresar el costo mensual de Dropbox: 5
 * Ingresar el costo mensual de Spotify: 3
 * Ingresar su edad: 32
 * El valor a pagar es: 25.0
 */

