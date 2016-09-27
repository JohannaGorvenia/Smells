/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Refactoring {
        
    public String obtenerCurso(){
        //Curso
        Random randito = new Random();
        int curso = randito.nextInt(5);
        
        List <String> ListCurso = new ArrayList();
        ListCurso.add("Matematica");
        ListCurso.add("Letras");
        ListCurso.add("Historia"); 
        ListCurso.add("Sociales");
        ListCurso.add("Economia"); 
        
        return ListCurso.get(curso);        
    }

    public float obtenerPromedio(int n1, int n2, int n3){
        return (3*n1 + 3*n2 + 4*n3)/10;
    }
}

 

