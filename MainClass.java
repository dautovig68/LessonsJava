/**
 * MainClass
 */

import java.util.Scanner;
public class MainClass {public static void main(String[] args) {
 
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите ваше имя");
    String username = scan.nextLine();
    String test = username.toUpperCase();
    System.out.println("Привет,  " + username) ;



}

    
}
