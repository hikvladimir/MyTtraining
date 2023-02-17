package task2;
/* Задача если у Вас больше 500 рублей, то Вы покупаете пиццу, если у Вас от 300 до 500 рублей, то Вы
   покупаете шаурму, если от 100 до 300 рублей тогда - гамбургер, если меньше 100 рублей тогда - доширак.
*/
public class Budget {
    public static void main(String[] args) {
        int money=100;
        if (money>=500){
            System.out.println("Пицца");
        } else if (money>=300){
            System.out.println("Шаурма");
        } else if (money>=100) {
            System.out.println("Бургер");
        } else {
            System.out.println("Дошик");
        }
    }
}
