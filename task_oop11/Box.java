package task_oop11;

public class Box {
    double height;
    double width;
    double length;

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box() {
        width = 0;
        height = 0;
        length = 0;
    }
    public Box(double size) {
        width = size;
        height = size;
        length = size;
    }
    public void showInfo() {
        System.out.println("Ширина: " + width);
        System.out.println("Длина: " + length);
        System.out.println("Высота: " + height);
    }
}
