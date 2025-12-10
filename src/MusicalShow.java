public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, double duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля  '" + getTitle() + "':");
        System.out.println(librettoText);
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString() + ", музыка: " + musicAuthor
                + " (музыкальный спектакль)";
    }
}
