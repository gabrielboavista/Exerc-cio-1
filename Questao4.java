/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("Escreva N");
        float n = t.nextFloat();
        float s = (1+1+(1/2)+(1/3*2*1)+(1/n));
        System.out.println(s);
    }
    
}
