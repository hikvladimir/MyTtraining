package task_oop12;

public abstract class worker {
    private String name;

    public worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice() {
        System.out.println(name);
    }
}
