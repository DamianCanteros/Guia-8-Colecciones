
package exercise_3.service;

import exercise_3.object.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class StudentService {
    
    ArrayList<Student> Estudiantes = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    public void CrearAlumnos(){

        String R = "S";
        
        do {

            System.out.println("DATOS DEL ALUMNO");
            
            System.out.println("ingrese el nombre");
            String nombre = leer.next();
            
            ArrayList <Integer> notas = new ArrayList();
            
            for (int i = 0; i < 3; i++) {
                System.out.println("ingrese la nota "+(i+1));
                notas.add(leer.nextInt());
            }
            Estudiantes.add(new Student(nombre,notas));
            
            System.out.println("Desea ingresar otro alumno");
            R = leer.next();

        } while (R.equalsIgnoreCase("S"));
        
        for (Student aux : Estudiantes) {
            
            System.out.println(aux.toString()); 
        }
    }
    
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.   
    public void notaFinal(){
        
        System.out.println("ingrese el nombre del alumno que quiere calcular su nota");
        String nombre = leer.next();
        
        for (Student aux : Estudiantes) {
            
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("el promedio es "+aux.notaFinal());
            }
        }
    }
}
