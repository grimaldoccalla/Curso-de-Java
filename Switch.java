/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author PC10-LAB02
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes=2;
        switch(mes){
      
            case 12:
            case 1: 
            case 2:
                System.out.println("INVIERNO");
                break;
            case 3:
            case 4:
            case 5:
                 System.out.println("ESTOY EN  PRIMAVERA");
                break; 
            case 6:
            case 7:
            case 8:
                System.out.println("ESTOY EN VERANO");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("ESTOY EN OTOÑO");
                break;
            default :
                System.out.println("NO EXISTE EL MES");
        }
        
        
        }
        
        
      
        // TODO code application logic here
    }
    
}
