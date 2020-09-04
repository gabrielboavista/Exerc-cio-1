/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor de a");
        float valora = teclado.nextFloat();
        System.out.println("Digite o valor de b");
        float valorb = teclado.nextFloat();
        System.out.println("Digite o valo de c");
        float valorc = teclado.nextFloat();
        int valordb = (int) (valorb*valorb);
        int valordelta = (int) (valordb - (4*valora*valorc));
        int delta = (int) Math.sqrt(valordelta);
        int valorxll = (int) ((-valorb - delta) / (2*valora));
        int valorxl = (int) ((-valorb + delta) / (2*valora));   
        System.out.println("o valor de x' é " + valorxl);
        System.out.println("O valor de x'' é " + valorxll);
    }
    
}
