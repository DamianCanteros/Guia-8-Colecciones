
package exercise_4.object;

/**
 *
 * @author Damian
 */
public class Movie {
    
    private String title;
    private String director;
    private Double duration;

    public Movie() {
    }

    public Movie(String title, String director, Double duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }         

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuration() {
        return duration;
    }
    
    @Override
    public String toString() {
        return "MOVIE: " + title + "\n" +
               "Director: " + director + "\n" +
               "Duration: " + duration + "\n" +
               "*****************************************";
    }
}
