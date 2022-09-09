/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. 
 */
package exercise_6;

import exercise_5.service.ShopService;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class NewMain {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ShopService s1 = new ShopService();
        
        int answer;
        
        do {
            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("1.Almacena los distintos productos y sus precios");
            System.out.println("2.Modifica los precios de los distintos productos");
            System.out.println("3.Elimina un producto");
            System.out.println("4.Muestra los distintos productos y sus precios");
            System.out.println("5.Salir");
            answer = read.nextInt();
            System.out.println("");

            switch (answer){

                case 1: s1.createProduct();
                break;
                case 2: s1.modifyPrice();
                break;
                case 3: s1.removeProduct();
                break;
                case 4: s1.showProduct();
                break;
                case 5: break;
            } 
        } while (answer!=5);
    }
}
