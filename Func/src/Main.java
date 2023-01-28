// Написать функцию, которая будет рассчитывать сумму по типу (10+20+30)+(10+20+30)+...;


import java.util.Scanner;
public class Main {
    public static int function(int number_sum, int number) {
        int a = 10;
        int sum = 0;
        int sum_a = 0;
        for (int i = 0; i < number_sum; i++) {
            for (int j = 0; j < number; j++) {
                sum = sum + a;
                a = a + 10;
            }
            sum_a = sum_a + sum;
            sum = 0;
            a = 10;
        }
        return sum_a;
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество вызовов функции: ");
        int number_sum1 = scanner.nextInt();

        System.out.println("Количество чисел:  ");
        int number1 = scanner.nextInt();

        int summa = function(number_sum1, number1);
        System.out.print(summa);
    }
}

