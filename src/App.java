import java.lang.management.ThreadInfo;
import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: " );
        int a = in.nextInt();
        System.out.println("Введите второе число: " );
        int b = in.nextInt();
        System.out.println("Введено первое число: " + a);
        System.out.println("Введено второе число: " + b);

        int summ = a + b;
        System.out.println("Сумма введенных чисел: "+ summ);

        Sravnenie(a, b, summ);
   
    }
    private static  boolean  Sravnenie(int a, int b, int summ) {
        // проверить, что сумма a и b лежит между 10 и 20
        if (summ >= 10 && summ <= 20) {
            System.out.println("Сумма введенных чисел в диопазоне от 10 до 20 ");
            System.out.println(true);
            return true;
        }
        else{
            System.out.println("Сумма введенных чисел привышает диапозон ");
            return false;

            }


    }
}
