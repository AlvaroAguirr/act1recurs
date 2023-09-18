/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package sumatoriarecursiva;
import java.util.Scanner;

public class SumatoriaRecursiva {
    
       public static int cuadra(int y, int z) {
        if (y > z) {
            return 0; 
        } else {
            int cuadrado = y * y;
            return cuadrado + cuadra(y + 1, z);
        }
    }

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Añada valor de y: ");
        int y = input.nextInt();
        System.out.print("Añada valor de z: ");
        int z = input.nextInt();
        int resultado = cuadra(y, z);
        System.out.println("El resultado es: " + resultado);
    }
    
}