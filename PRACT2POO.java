/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract2.poo;
import java.util.Scanner;
/**
 *
 * @author PC10-LAB02
 */
public class PRACT2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
          CONTADOR contador1 = new CONTADOR();
         int n;
         System.out.print("Introduce valor para inicialñizar el CONTADOR");
         n=sc.nextInt();
         
         contador1.setCont(n);
         contador1.incrementar();
         System.out.println(contador1.getCont());
         
         contador1.incrementar();
         contador1.incrementar();
         System.out.println(contador1.getCont());
         
         contador1.decrementar();
        
         System.out.println(contador1.getCont());
         
         CONTADOR contador2=new CONTADOR(10);
         contador2.incrementar();
         System.out.println(contador2.getCont());
         contador2.decrementar();
         System.out.print(contador2.getCont());
         
         CONTADOR contador3=new CONTADOR(contador2);
         
         System.out.print(contador3.getCont());

    }
    
}
