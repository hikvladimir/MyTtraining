package task_oop11;
/*Создайте новый класс BoxWeight, то есть весовая коробка, который наследуется от класса box. Эта коробка
 будет иметь все те же методы и поля, что есть у родительской коробки, а также
иметь дополнительное поле "вес". Создайте необходимые конструкторы, а
также геттеры и сеттеры на вес. Создайте в родительском классе метод
showinfo, который выводит информацию о коробке: длину, ширину, высоту и
объем. А в дочернем классе переопределите этот метод, чтобы он также
выводил информацию о весе коробки. После этого создайте в методе main две коробки:
одну обычную, одну весовую. Назначьте им размеры, использовав разные
конструкторы и выведите информацию.*/

public class Main {
    public static void main(String[] args) {
        Box box = new Box(15);
        BoxWeight boxWeight = new BoxWeight(10,20,30,15.5);
        box.showInfo();
        boxWeight.showInfo();
    }
}
