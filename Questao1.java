/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);   
        System.out.println("Quanto foi pago? ");
        float valorp = teclado.nextFloat(); 
        System.out.println("Quanto custa o produto? ");
        float custop = teclado.nextFloat();
        int troco = (int) (valorp - custop);
        System.out.println("O troco é de " + troco);
        
    }
    
}
