/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questo5;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Questo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        int k = 0;
        int j = 10000;
        while (j>0) {
            System.out.println("Digite um numero:");
            int n = t.nextInt();
            if(n!=0){
                if (((Math.sqrt(n))>0) && ((Math.sqrt(n))<n)){
                    k++;
                }
            }else{
                break;
            }
            j--;
        }
        System.out.println("O numero de quadrados perfeitos é: " + k);
    }
    
}
