/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13.cap4;
import java.util.Scanner;
public class Ejercicio13Cap4 {


    public static void main(String[] args) {
        double VALCOMP,VALPAG;
        String COLOR;
        double PDES=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el valor total de la compra: ");
        VALCOMP = entrada.nextDouble();
        
        System.out.print("Seleccione el color de la bolita (blanca, verde, amarilla, azul o roja): ");
        COLOR = entrada.next();
        
        switch (COLOR) {
            case "blanca":
                PDES = 0;
                break;
            case "verde":
                PDES = 10;
                break;
            case "amarilla":
                PDES = 25;
                break;
            case "azul":
                PDES = 50;
                break;
            case "roja":
                PDES = 100;
                break;
            default:
                System.out.println("El color ingresado no es válido.");
                System.exit(0);
        }
        
        VALPAG = VALCOMP - PDES * VALCOMP/100;
        
        System.out.println("El valor final de la compra es: " + VALPAG);
    }
}