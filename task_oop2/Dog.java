package task_oop2;

public class Dog {
    String name;
    String breed;
    int speed;

    void run(){
        String runs=" ";
        for (int i=0; i<speed; i++){
             runs+="Бегу ";
        }
        System.out.println(runs);

    }
    String info(){
        return "Порода:"+breed+" Кличка: "+name+"Скорость:"+speed;
    }
}
