package task_oop12;

public class Cooker extends worker implements Cookable {

    public Cooker(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("Готовлю");
    }
}

