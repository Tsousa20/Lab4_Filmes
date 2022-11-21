public class Movie {
    private String title;
    private double rating;
    private String sinopse;
    private String genre;
    private String director;
    private String actors;

    public void callMovie(){
        System.out.println("Movie: " + this.getTitle());
        System.out.println("Rating: " + this.getRating());
        System.out.println("Sinopse " + this.getSinopse());
        System.out.println("Genre: " + this.getGenre());
        System.out.println("Director " + this.getDirector());
        System.out.println("Actor: " + this.getActors());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}
