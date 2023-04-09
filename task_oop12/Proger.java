package task_oop12;

public class Proger extends worker implements Coding {
 public Proger(String name){
     super(name);
 }

    @Override
    public void koder() {
        System.out.println("Пишу код");
    }
}
