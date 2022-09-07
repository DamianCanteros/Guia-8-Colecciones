
package exercise_3.object;

import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class Student {
    
    private String nombre;
    private ArrayList<Integer> nota = new ArrayList();

    public Student(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;

    }

    public String getNombre() {
        return nombre;
    }
    
    public Double notaFinal(){

        double promedio=0;
        
        for (Integer aux : nota) {
            
            promedio += aux;
        }
        return promedio/3;
    }
    
    @Override
    public String toString() {
        return "Student{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }

}
