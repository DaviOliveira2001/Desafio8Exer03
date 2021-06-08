/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio8exer03;

/**
 *
 * @author odavi
 */
public class Desafio8Exer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c;
        
        c = 1000;
        
        while(c<2000){
            if(c % 11 == 5){
                System.out.println("Valor cujo resto dividido por 11 é igual a 5 -> "+c);
            }
            c++;
        }
    }
    
}
