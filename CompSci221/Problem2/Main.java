package Problem2;

/**
 * Created by cwalsh on 9/24/16.
 */
public class Main {
    public static void main(String[] args){
        Movie genericMovie = new Movie("R", "12345", "This is a Generic Movie");
        Movie genericMovie2 = new Movie("R", "12345", "This is a Generic Movie");
        Action actionMovie = new Action("R", "123456", "This is an action Movie");
        Comedy comedyMovie = new Comedy("R", "123457", "This is a comedy Movie");
        Drama dramaMovie = new Drama("R", "123458", "This is a sappy sad drama Movie");

        System.out.println("Your late fee for the movie: " + genericMovie.getTitle() + " That is rated " + genericMovie.getMPAARating() + " is: " +genericMovie.calculateLateFees(200));
        System.out.println("Your late fee for the movie: " + comedyMovie.getTitle() + " That is rated " + comedyMovie.getMPAARating() + " is: " +comedyMovie.calculateLateFees(200));
        System.out.println("Your late fee for the movie: " + actionMovie.getTitle() + " That is rated " + actionMovie.getMPAARating() + " is: " +actionMovie.calculateLateFees(200));
        System.out.println("Your late fee for the movie: " + genericMovie2.getTitle() + " That is rated " + genericMovie2.getMPAARating() + " is: " +genericMovie2.calculateLateFees(200));
        System.out.println("Your late fee for the movie: " + dramaMovie.getTitle() + "  That is rated " + dramaMovie.getMPAARating() + " is: " +dramaMovie.calculateLateFees(200));
        System.out.println("Your late fee for the movie: " + genericMovie.getTitle() + " That is rated " + genericMovie.getMPAARating() + " is: " +genericMovie.calculateLateFees(300));

        if(comedyMovie.equals(genericMovie)){
            System.out.println("The movie " + comedyMovie.getTitle() + " is the same as " + genericMovie.getTitle());
        }else{
            System.out.println("The movie " + comedyMovie.getTitle() + " is not the same as " + genericMovie.getTitle());
        }if(genericMovie2.equals(genericMovie)){
            System.out.println("The movie " + genericMovie.getTitle() + " is the same as " + genericMovie2.getTitle());
        }else{
            System.out.println("The movie " + genericMovie.getTitle() + " is not the same as " + genericMovie2.getTitle());
        }




    }

}
