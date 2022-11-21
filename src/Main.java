public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setTitle("Black Adam");
        movie.setGenre("Action");
        movie.setRating(5);
        movie.setSinopse("Black Adam, é um filme de ação que veio para dar um novo ar à DC.");
        movie.setActors("Dwayne The Rock Jonshon");
        movie.setDirector("George Lucas");
        movie.callMovie();
    }
}