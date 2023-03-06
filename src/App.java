import java.util.Scanner;

public class App {
   
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

        Sravnenie(summ);
        isPositive(summ);
   
    }
    private static  boolean  Sravnenie (int summ) {
        Scanner in = new Scanner(System.in);
    
        // проверить, что сумма a и b лежит между 10 и 20
        if (summ >= 10 && summ <= 20) {
            System.out.println("Сумма введенных чисел в диопазоне от 10 до 20 ");
            return true;
        }
        else{
            System.out.println("Сумма введенных чисел не входит в диапазон ");
            return false;
        }
        
        
        
    }
    

    private static  void isPositive(int summ) {
        
        
        // проверить, что х положительное
        if (summ > 0){
            System.out.println("Число положительное");  
            
        }
        else if (summ < 0){
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число равно 0");
            
        }
    }
    
}
