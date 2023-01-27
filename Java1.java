

public class Java1 {
    public static void main(String[] args) {
        System.out.println(" !!! Welcome !!!");
        int a = 20;
        int b = 8;
        int result1 = a/b;
        System.out.println(result1);

        double result2 = a/b;
        System.out.println(result2);

        double c = 20;
        double d = 8;
        double result3 = c/d;
        System.out.println(result3);

        // Задача №1
        /* С некоторого момента прошло 234 дня
         * Сколько полных недель прошло за этот период?
         * А месяцев?  */
        int dn = 234;
        int nd = 7;
        int m = 30;
        int result4 = dn/nd;
        System.out.println("<< Результат задачи №1 >>");
        System.out.println("Полные " + result4 + " недели прошло за 234 дня");
        int result5 = dn/m;
        System.out.println("Прошло " + result5 + " полных месяцев за 234 дня");

        //  Задача №2
        /* Дано двузначное число 39
         * Найти:
         * - число десятков в нем;
         * - число единиц в нем;
         * - сумму его цифр;
         * - произведение его цифр.*/
        int i = 39;
        int result6 = i/10;
        System.out.println("<< Результат задачи  №2 >>");
        System.out.println(result6 + " число десятков");
        int result7 = i%10;
        System.out.println(result7 + " число единиц");
        System.out.println(result6+result7 +" сумма цифр");
        System.out.println(result6*result7 + " произведение цифр");


    }
}
