package Com;

import java.util.Scanner;

public class sonuPandit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter yur frutis name:");
        String fruits = in.next();
        switch (fruits) {
            case "Apple" -> System.out.println("This is a sweetest fruits");
            case "mango" -> System.out.println("This is a king of fruits");
            case "Banana" -> System.out.println("It is a simple fruits as tall looks like");
            default -> System.out.println("Enter a valid fruits");
        }

    }
}
