
package taller;

import java.util.Random;

public class Taller {

    public static void main(String[] args) {
      
        //Duplicate Code - Long Method
            //Curso
            int curso;
            String nombreCurso="";
            Random randito = new Random();
            curso = randito.nextInt(5) + 1;        
            //Nota - Promedio
            int n1=11, n2= 12, n3 = 10;
            n1 = randito.nextInt(21);
            n2 = randito.nextInt(21);
            n3 = randito.nextInt(21);        
            float prom;      
 /* 
            if(curso == 1){
                nombreCurso = "Matematica";
                prom = (3*n1 + 3*n2 + 4*n3)/10;
            }else if (curso == 2){
                nombreCurso = "Letras";
                prom = (3*n1 + 3*n2 + 4*n3)/10;
            }else if (curso == 3){
                nombreCurso = "Ciencia";
                prom = (3*n1 + 3*n2 + 4*n3)/10;
            } else if (curso == 4){
                nombreCurso = "Historia";
                prom = (3*n1 + 3*n2 + 4*n3)/10;
            }else{
                nombreCurso = "Sociales";
                prom = (3*n1 + 3*n2 + 4*n3)/10;            
            }
            System.out.println("El promedio de " + nombreCurso + " es: "  + prom + "."); 
            
            */
            
             //Refactoring Duplicate Code - Long Method
            Refactoring refactor1 = new Refactoring();
            String asignatura = refactor1.obtenerCurso();
            float promedio = refactor1.obtenerPromedio(n1, n2, n3);
            System.out.println("El promedio de " + asignatura + " es: "  + promedio + ".");  
    }
    
    
    
}
