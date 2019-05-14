/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

/**
 *
 * @author PC10-LAB02
 */
public class AlumnosPrueba {
    public static void main(String[] args) {
        Alumnos p1= new Alumnos();
         System.out.println("Valores por default del objeto Alumno");
        p1.despregarAlumnos();
        p1.Nombre="Sandro";
        p1.AP="Sanches";
        p1.AM="roca";
        p1.DNI=76561533;
        p1.Edad=12;
        p1.Colegio="Manuelito";
        p1.FechNac="25-04-2001";
        p1.Nota1=15;
        p1.Nota2=15;
        p1.Nota3=15;
        
        System.out.println("\nNuevo valores del objeto Alumno");
       p1.despregarAlumnos();
       
        
        
        
        
        
    }
    
}
