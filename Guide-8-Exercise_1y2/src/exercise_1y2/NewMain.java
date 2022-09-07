/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package exercise_1y2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class NewMain {

    public static void main(String[] args) {
        
        ArrayList<String> Dog = new ArrayList();
        Scanner Leer = new Scanner(System.in);
        
        String R = "S"; 
        
        do {
            
            System.out.println("Ingrese la raza del perro");
            Dog.add(Leer.next());
            
            System.out.println("Desea ingresar otra raza de perro S/N");
            R = Leer.next();   
            
        } while (R.equalsIgnoreCase("S"));   
        
        System.out.println(Dog.toString());
        
        System.out.println("Ingrese la raza del perro");
        String Raza = Leer.next();
        
        Iterator <String> nombre = Dog.iterator();
        
        boolean found=false;
        while(nombre.hasNext()){
            
            if (Raza.equals(nombre.next())) {
                
                nombre.remove();
                found = true;
            } 
        }
        if (!found) {
            System.out.println("La raza no se encontro");
        } 
        System.out.println(Dog.toString());
    }  
}
