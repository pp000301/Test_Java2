package OOP_Test;

public class Time {
    int hours;
    int minutes;
    int sec;
    Time (int allsec){
        hours=allsec/3600;
        minutes=(allsec%3600)/60;
        sec=(allsec%3600)%60;
    }
    Time(int hours,int minutes,int sec){

         this.hours=hours;
         this.minutes=minutes;
         this.sec=sec;


    }

    public void printTime(){
        System.out.println("Часы: "+hours+" Минуты: "+minutes+" Секунды: "+sec);
    }
}
