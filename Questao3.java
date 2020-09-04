/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);     
        System.out.println("Quantos quilos João trouxe? ");
        int peso = t.nextInt();
        if (peso>50){
            int excesso = peso - 50;
            int multa = excesso * 4;
            System.out.println("João excedeu em : " + excesso);
            System.out.println("João terá de pagar: " + multa);
        }else{
            int excesso = 0;
            int multa = 0;
            System.out.println("João não excedeu o regulamento e não tera que pagar multa! ");
        }
    }
    
}
