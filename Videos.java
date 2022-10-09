public class Videos extends Library {
    private int hours;
    private int minutes;
    private int seconds;

    public Videos(int number, String title, int hours, int minutes, int seconds) {
        super(number, title);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}
