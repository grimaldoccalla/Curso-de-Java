/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract2.poo;

/**
 *
 * @author PC10-LAB02
 */
public class CONTADOR {
    private int cont;
    public CONTADOR() {
    }
        public CONTADOR (int cont){ 
            if (cont < 0){
            this.cont=0;
            }else {
                this.cont=cont;
            }
        }
        public CONTADOR (final CONTADOR c){
            cont=c.cont;          
        }
        public int getCont(){
            return cont;
        }
        public void setCont(int cont){
            if (cont < 0){
                this.cont=0;
            }else{
                this.cont=cont;
            }
        }
        public void incrementar(){
            cont++;
        }
        public void decrementar(){
            cont--;
            if(cont <0){
                cont=0;
            }
        }
}
