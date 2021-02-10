import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class MainClass {
    /**
     * Se lee un array monodimensional de enteros y un valor entero.
     * Se ha de mostrar en pantalla el número de elementos
     * del array que son mayores que dicho valor entero.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Se lee un array unidimensional de elementos de tipo int
        int[] myArray = Internal.loadIntArray(input);

        // Se lee un valor de tipo int
        System.out.print("Dame un valor entero: ");
        int value = input.nextInt();


        System.out.println("El número elementos del array que son mayores al valor leído es: "
                            + mayores(myArray, value));
    }
    
    // Se calcula cuántos elementos del array son mayores que num
    public static int mayores(int [] myArray, int value) {
        int mas = 0;
        for (int i = 0; i < myArray.length; i++){ 
            if ( myArray[i] > value ){
                mas = mas + 1;
            }
        }
        return mas;
    }
}