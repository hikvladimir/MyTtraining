package task_oop3;

public class Rect {
    int heigth;
    int wight;

    void setDimens(int weght, int heigth){
        this.heigth=heigth;
        this.wight=weght;
    }
    int area() {
        return wight * heigth;
    }

    int perimeter() {
        return (wight + heigth) * 2;
    }

}
