package task_oop11;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(15);
        BoxWeight boxWeight = new BoxWeight(10,20,30,15.5);
        box.showInfo();
        boxWeight.showInfo();
    }
}
