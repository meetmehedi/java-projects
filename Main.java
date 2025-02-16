public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 148, "Christopher Nolan");
        Song song = new Song("Bohemian Rhapsody", 6, "Queen");
        Podcast podcast = new Podcast("Tech Talks", 45, "John Doe");

        movie.play();
        song.play();
        podcast.play();
    }
}