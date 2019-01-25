package OOP;

public class Time {
    int hrs;
    int min;
    int sec;

    public Time(int allSec) {
        this.hrs = allSec / 3600;
        this.min = (allSec % 3600) / 60;
        this.sec = (allSec % 3600) % 60;
    }

    public Time(int hrs, int min, int sec) {
        this(hrs*3600+min*60+sec);
    }

    public void printTime() {
        System.out.println("Часы: " + hrs + "  Минуты: " + min + " Секунды: " + sec);
    }

}
