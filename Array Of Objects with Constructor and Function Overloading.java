class Movie {
    private String title;
    private String genre;
    private int duration; 

    
    public Movie() {
        this.title = "Unknown";
        this.genre = "Not Specified";
        this.duration = 0;
    }
    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("-----------------------------");
    }    public void displayDetails(boolean showDuration) {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        if (showDuration) {
            System.out.println("Duration: " + duration + " minutes");
        }
        System.out.println("-----------------------------");
    }
}

public class CinemaManagement {
    public static void main(String[] args) {
       
        Movie[] movies = new Movie[3];
        movies[0] = new Movie(); 
        movies[1] = new Movie("Inception", "Sci-Fi", 148); 
        movies[2] = new Movie("The Godfather", "Crime", 175); 
        System.out.println("All Movies:");
        for (Movie movie : movies) {
            movie.displayDetails();
        }
        System.out.println("Selected Details (without duration):");
        for (Movie movie : movies) {
            movie.displayDetails(false);
        }
    }
}