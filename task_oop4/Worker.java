package task_oop4;

public class Worker {
    String name;
    String position;
    int salary;

    public Worker(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    String getInfo(int month){
        return "Имя: " + name + ". Должность: " + position + ". За последние " + month + " месяцев получил " + month * salary + " рублей.";
    }
}
