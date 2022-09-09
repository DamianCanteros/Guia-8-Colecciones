
package exercise_5.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class CountryService {
    
        HashSet<String> Countries = new HashSet();
        Scanner read = new Scanner(System.in);
        
    public void createCountry(){

        String answer = "Y";

        do {
            System.out.println("insert Country");
            Countries.add(read.next());

            System.out.println("Do you want insert another Country? Y/N");
            answer = read.next();

        } while (answer.equalsIgnoreCase("Y"));
    }    
        
    public void showCountry(){
        
        System.out.println(Countries.toString());
        
    }

    public void foundCountry(){
        
        System.out.println("insert The country that you want to find");
        String Country = read.next();
        
        Iterator <String> iterator = Countries.iterator();
        
        boolean found=false;
        while(iterator.hasNext()){
            
            if (Country.equals(iterator.next())) {
                
                iterator.remove();
                found = true;
            } 
        }
        if (!found) {
            System.out.println("The country has not been found");
        } 
        showCountry();
    }  
}
