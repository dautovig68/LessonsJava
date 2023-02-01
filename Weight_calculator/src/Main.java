import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вес
        int m;
        do {
            System.out.print("Введите вес, принимаются значения от 10 до 200 кг: ");
            m = scanner.nextInt();
        } while ((m < 10) || (m > 200));

        //Рост
        double h;
        do {
            System.out.print("Введите рост, принимаются значения от 50 до 300 см: ");
            h = scanner.nextDouble();
        } while ((h < 50) || (h > 300));

        //Возраст
        int age;
        do {
            System.out.print("Введите возраст, принимаются значения от 15 до 120: ");
            age = scanner.nextInt();
        } while ((age < 15) || (age > 120));

            //Расчет индекса массы
            double imt = m / (h/100 * h/100);
                System.out.printf("Индекс массы тела: %.2f",imt);
            //Сравнение в 1 весовой категории
                if(age >= 18 && age <= 24) {
                    if(imt < 20) {
                        System.out.println(" Недостаточный вес");
                    }
                    if(imt >= 20 && imt < 25) {
                        System.out.println(" Нормальный вес");
                    }
                    if(imt >= 25 && imt < 30) {
                        System.out.println(" Избыточный вес");
                    }
                    if(imt >= 30 && imt <= 40) {
                        System.out.println(" Ожирение 1-2 степени");
                    }
                    if(imt > 40) {
                        System.out.println(" Ожирение 3 степени");
                    }}
            //Сравнение в 2 весовой категории
                if(age >= 25 && age <= 34) {
                    if(imt < 21) {
                        System.out.println(" Недостаточный вес");
                    }
                    if(imt >= 21 && imt < 26) {
                        System.out.println(" Нормальный вес");
                    }
                    if(imt >= 26 && imt < 31) {
                        System.out.println(" Избыточный вес");
                    }
                    if(imt >= 31 && imt <= 41) {
                        System.out.println(" Ожирение 1-2 степени");
                    }
                    if(imt > 41) {
                        System.out.println(" Ожирение 3 степени");
                    }}
            //Сравнение в 3 весовой категории
                if(age >= 35 && age <= 44) {
                    if(imt < 22) {
                        System.out.println(" Недостаточный вес");
                    }
                    if(imt >= 22 && imt < 27) {
                        System.out.println(" Нормальный вес");
                    }
                    if(imt >= 27 && imt < 32) {
                        System.out.println(" Избыточный вес");
                    }
                    if(imt >= 32 && imt <= 42) {
                        System.out.println(" Ожирение 1-2 степени");
                    }
                    if(imt > 42) {
                        System.out.println(" Ожирение 3 степени");
                    }}
            //Сравнение в 4 весовой категории
                if(age >= 45 && age <= 54) {
                    if(imt < 23) {
                        System.out.println(" Недостаточный вес");
                    }
                    if(imt >= 23 && imt < 28) {
                        System.out.println(" Нормальный вес");
                    }
                    if(imt >= 28 && imt < 33) {
                        System.out.println(" Избыточный вес");
                    }
                    if(imt >= 33 && imt <= 43) {
                        System.out.println(" Ожирение 1-2 степени");
                    }
                    if(imt > 43) {
                        System.out.println(" Ожирение 3 степени");
                    }}
            //Сравнение в 5 весовой категории
                if(age >= 55 && age <= 65) {
                    if(imt < 24) {
                        System.out.println(" Недостаточный вес");
                    }
                    if(imt >= 24 && imt < 29) {
                        System.out.println(" Нормальный вес");
                    }
                    if(imt >= 29 && imt < 34) {
                        System.out.println(" Избыточный вес");
                    }
                    if(imt >= 34 && imt <= 44) {
                        System.out.println(" Ожирение 1-2 степени");
                    }
                    if(imt > 44) {
                        System.out.println(" Ожирение 3 степени");
                    }}
                //Сравнение в 6 весовой категории
                if(age > 65) {
                    if(imt < 25) {
                        System.out.println(" Недостаточный вес");
                    }
                    if(imt >= 25 && imt < 30) {
                        System.out.println(" Нормальный вес");
                    }
                    if(imt >= 30 && imt < 35) {
                        System.out.println(" Избыточный вес");
                    }
                    if(imt >= 35 && imt <= 45) {
                        System.out.println(" Ожирение 1-2 степени");
                    }
                    if(imt > 45) {
                        System.out.println(" Ожирение 3 степени");
                    }}

                }

                }





               // System.out.print("Введите пол (М) или (Ж): ");


















