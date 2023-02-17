package task1;

public class Time {
    public static void main(String[] args) {
        int time=20000000;
        int min=time/60;
        int hour=min/60;
        int day=hour/24;
        int month=day/30;

        System.out.println("Минут: "+min);
        System.out.println("Часов: "+hour);
        System.out.println("Дней: "+day);
        System.out.println("Месяцев: "+month);


    }
}
