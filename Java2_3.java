public class Java2_3 {

    // Задача №3
        /* Известны площади круга и квадрата. Определить:
        1. уместится ли круг в квадрате?
        2. уместится ли квадрат в круге      */

    public static void main(String[] args) {

      int S1 = 15;
      int S2 = 25;
      double pi = Math.PI;

      if (S1 <= 0) {
          System.out.println("Площадь круга не может быть меньше или равен нулю");
      }
      if (S2 <= 0) {
          System.out.println("Площадь квадрата не может быть меньше или равна нулю");
      }
      double r = Math.sqrt(S1 / pi);  // Радиус круга
      double a = Math.sqrt(S2);    // Сторона квадрата

      String r2 = "Радиус окружности";
      String a2 = "Сторона квадрата";
      System.out.printf("%s = %5.2f\n", r2, r);
      System.out.printf("%s = %5.2f\n", a2, a);
      if (2 * r <= a) {
          System.out.println("Круг уместится в  квадрате: ");
          System.out.printf("%5.2f <= %5.2f\n", 2 * r, a);
      } else {
          System.out.println("Круг не поместится в квадрате");

      }
      double g = a * Math.sqrt(2);

      if (g <= 2 * r) {
          System.out.println("Квадрат поместится в круге");
      } else {
          System.out.println("Квадрат не поместится в круге");
      }
  }
}
