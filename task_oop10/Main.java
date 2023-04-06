package task_oop10;
/* Создайте 3 коллекции, первая будет хранить числа от 1 до 10,
* вторая будет хранить имена студентов, их должно быть столько же, сколько
* чисел в первой коллекции. Третья будет хранить строки, в которых будут
* значения: номер, имя.
* Значения данной коллекции необходимо присвоить в цикле, использовав
* первые две коллекции. Вывести содержимое третьей коллекции при помощи цикла for each.*/
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("Роман");
        name.add("Федор");
        name.add("Андрей");
        name.add("Владимир");
        name.add("Антонина");
        name.add("Наталья");
        name.add("Олеся");
        name.add("Сандра");
        name.add("Мери");
        name.add("Федот");
        ArrayList<Integer> nomber=new ArrayList<>();
        for (int i=0; i<10; i++){
            nomber.add(i);
        }
        ArrayList<String> combo=new ArrayList<>();
        for (int i = 0; i < nomber.size(); i++) {
            String s = nomber.get(i) + " - " + name.get(i);
            combo.add(s);
        }

            for (String str:combo){
                System.out.println(str);
            }
        }

    }

