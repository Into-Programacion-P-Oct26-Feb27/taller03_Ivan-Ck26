/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author ASUS
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución a la problemática
        
        int variable1 = 3;
        int variable2 = 81;
        int variable3 = 40;
        
        double suma = ((Math.pow(variable1,variable1)) + (Math.sqrt(variable2)));
        boolean resultado = (suma <= variable3);
        
        System.out.println(resultado);
    }
    
}
