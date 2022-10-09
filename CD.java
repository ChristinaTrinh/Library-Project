public class CD extends ElectronicMedia {
    private String musicalGenre;

    public CD(int number, String title, String musicalGenre) {
        super(number, title);
        this.musicalGenre = musicalGenre;
    }
}
