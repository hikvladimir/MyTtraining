package task_oop1;

public class Main {
    public static void main(String[] args) {
        Human man1=new Human();
        Human man2=new Human();
        Human man3=new Human();
        Human man4=new Human();
        Human man5=new Human();

        man1.name = "Иван";
        man1.age = 18;
        man1.weight = 70.2;
        man2.name = "Игорь";
        man2.age = 18;
        man2.weight = 75;
        man3.name = "Виталий";
        man3.age = 25;
        man3.weight = 80;
        man4.name = "Алексей";
        man4.age = 22;
        man4.weight = 95;
        man5.name = "Виктор";
        man5.age = 20;
        man5.weight = 70;
        System.out.println((man1.age+ man2.age+ man3.age+ man4.age+ man5.age)/5);
    }
}
