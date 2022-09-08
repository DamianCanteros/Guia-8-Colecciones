
package exercise_4.service;

import exercise_4.object.Movie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class MovieService {
    
    Scanner read = new Scanner(System.in);
    ArrayList <Movie> Movies =  new ArrayList();

    
    public void createMovie(){

        String answer = "Y";
        
        do {
            
            System.out.println("");
            System.out.println("MOVIE");
            
            System.out.println("insert title");
            String title = read.next();
            
            System.out.println("insert director");
            String director = read.next();
            
            System.out.println("insert duration");
            Double duration = read.nextDouble();
            
            Movies.add(new Movie(title,director,duration));
            
            System.out.println("Do you want insert another Movie? Y/N");
            answer = read.next();

        } while (answer.equalsIgnoreCase("Y"));
    } 
    
// Muestra en pantalla todas las películas.
    public void showMovie(){
        
        for (Movie aux : Movies) {
            
            System.out.println(aux.toString()); 
        }
    }

// Muestra en pantalla todas las películas con una duración mayor a 1 hora.    
    public void showMovieOHOM(){
        
        System.out.println("Películas con una duración mayor a 1 hora");
        System.out.println("");
        for (Movie aux : Movies) {
            
            if (aux.getDuration()>=1) {

                System.out.println(aux.toString()); 
            }
        }
    }

// Compara la duracion de las peliculas. 
    private static Comparator<Movie> organizeDuration = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            
            return t.getDuration().compareTo(t1.getDuration());
        }    
    }; 
    
// Ordena las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.       
    public void organizeDurationDescending(){
        
        Collections.sort(Movies, organizeDuration);
        Collections.reverse(Movies);
        System.out.println("Películas de acuerdo a su duración (de mayor a menor)");
        System.out.println("");
        showMovie();
    }
    
// Ordena las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    public void organizeDurationAscending(){
        
        Collections.sort(Movies, organizeDuration);
        System.out.println("Películas de acuerdo a su duración (de menor a mayor)");
        System.out.println("");
        showMovie();
    }

// Compara los titulos de las peliculas. 
    private static Comparator<Movie> organizeTitle = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            
            return t.getTitle().compareTo(t1.getTitle());
        }    
    }; 
    
// Ordena las películas por título, alfabéticamente y mostrarlo en pantalla.    
    public void organizeTitle(){
        
        Collections.sort(Movies, organizeTitle);
        System.out.println("Películas alfabéticamente por título");
        System.out.println("");
        showMovie();
    }

// Compara los directores de las peliculas. 
    private static Comparator<Movie> organizeDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            
            return t.getDirector().compareTo(t1.getDirector());
        }    
    }; 
    
// Ordena las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void organizeDirector(){
        
        Collections.sort(Movies, organizeDirector);
        System.out.println("Películas alfabéticamente por director");
        System.out.println("");
        showMovie();
    }    
}