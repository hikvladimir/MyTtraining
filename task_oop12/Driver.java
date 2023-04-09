package task_oop12;

public class Driver extends worker implements Drivable {

    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Веду машину");
    }
}
