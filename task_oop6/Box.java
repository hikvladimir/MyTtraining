package task_oop6;

public class Box {
    double height;
    double width;
    double length;
    Box(double height, double width, double length) {
        this.height=height;
        this.width=width;
        this.length=length;
    }
    Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.length = box1.length + box2.length;
        this.height = box1.height + box2.height;
    }
    Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    Box newBox(Box box){
        return new Box(this.width + box.width, this.height + box.height, this.length + box.length);
    }
    double volume() {
        return width * height * length;
    }

    void showVolume() {
        System.out.println(volume());
    }


}
