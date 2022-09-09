
package exercise_5.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ShopService {
    
    Scanner read = new Scanner(System.in);
    HashMap<String,Integer> products = new HashMap();
    
//Almacena los distintos productos y sus precios
    public void createProduct(){

        String answer = "Y";

        do {
            System.out.println("insert name");
            String name = read.next();
            
            System.out.println("insert price");
            Integer price = read.nextInt();

            System.out.println("Do you want insert another product? Y/N");
            answer = read.next();
            
            products.put(name,price);

        } while (answer.equalsIgnoreCase("Y"));
    }    

//Modifica los precios de los distintos productos   
    public void modifyPrice(){
        
        System.out.println("insert the product that you want to modify");
        String name = read.next();
        
        boolean found=false;
        
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            if (name.equalsIgnoreCase(key)) {
                
                System.out.println("insert new price");
                Integer price = read.nextInt();
                
                entry.setValue(price);
                found = true;
            }  
        }
        if (!found) {
            System.out.println("The product has not been found");
        } 
    } 
 
//Elimina un producto  
    public void removeProduct(){
        
        System.out.println("insert the product that you want to remove");
        String name = read.next();
        
        boolean found=false;
        
        for (String product : products.keySet()) {
 
            if (name.equalsIgnoreCase(product)) {
                
                products.remove(name);
                found = true;
            }  
        }
        if (!found) {
            System.out.println("The product has not been found");
        } 
    } 
    
//Muestra los distintos productos y sus precios    
    public void showProduct(){
        
        System.out.println(products.toString());
        
    }
}
