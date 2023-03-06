import java.util.Scanner;
import java.util.function.UnaryOperator;

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

        System.out.println("Введите количество строк для вывода: " );
        int repeat = in.nextInt();
        System.out.println("Введите текст для вывода: ");
        String source = in.next();
        printString(source,repeat);
        System.out.println("Введите год: " );
        int year = in.nextInt();
        isLeapYear(year);



   
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
    
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        
        while (repeat >= 1){
            System.out.println(source + repeat);
            repeat --;

        }

    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)){
            System.out.println(year +" Год високостный");
            return true;
        }
        else {
            System.out.println(year +" Год  не високостный");
            return false;

        }    
        }
    }

