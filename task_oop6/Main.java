package task_oop6;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10.00, 10.00, 10.00);
        Box box2 = new Box(20.00,20.00,10.00);
        Box box3 = box1.newBox(box2);
        Box box4 = new Box(box1, box3);
        box1.showVolume();
        box2.showVolume();
        box3.showVolume();
        double volumeSum = box1.volume() + box3.volume();
        System.out.println("box1 + box3 = " + volumeSum);
        box4.showVolume();
    }
}
