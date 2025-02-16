// Abstract class MediaContent
abstract class MediaContent {
    protected String title;
    protected int duration;

    public MediaContent(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Abstract method to be implemented by subclasses
    abstract void play();
}

// Movie subclass extending MediaContent
class Movie extends MediaContent {
    private String director;

    public Movie(String title, int duration, String director) {
        super(title, duration);
        this.director = director;
    }

    @Override
    void play() {
        System.out.println("Playing movie: " + title + " (" + duration + " minutes), directed by " + director);
    }
}

// Song subclass extending MediaContent
class Song extends MediaContent {
    private String artist;

    public Song(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    void play() {
        System.out.println("Playing song: " + title + " (" + duration + " minutes), by " + artist);
    }
}

// Podcast subclass extending MediaContent
class Podcast extends MediaContent {
    private String host;

    public Podcast(String title, int duration, String host) {
        super(title, duration);
        this.host = host;
    }

    @Override
    void play() {
        System.out.println("Playing podcast: " + title + " (" + duration + " minutes), hosted by " + host);
    }
}

// Main class to demonstrate functionality
