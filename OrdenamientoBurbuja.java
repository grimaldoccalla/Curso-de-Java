/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoburbuja;

import java.util.Arrays;

/**
 *
 * @author PC10-LAB02
 */
public class OrdenamientoBurbuja {
//int A[]= {82,50,2,30,22,7,17};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int A[]=new int[7];
        int A[]= {82,50,2,30,22,7,17,5};
        int temp;
        for(int i=0;i<A.length-1;i++){
            System.out.println(A[i]+"  "); 
            
            for(int j=0;j<(A.length-1-i);j++){
                if (A [j]>A [j+1]){
                    temp =A[j+1];
                    A [j+1]=A[j];
                    A[j]=temp;
                   //System.out.print(" " + Arrays.toString(A));
                }
                //System.out.print(A[j]+" , ");
            }
        }
       System.out.print("EL NUMERO ORDENADO " + Arrays.toString(A));
        
        
    }
    
}
