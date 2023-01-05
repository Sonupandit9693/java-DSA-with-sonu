package sonuPandit;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("plese enter the some input");
        int rollno = input.nextInt();
        System.out.println("oyur roll number is:" + rollno);
        String name = input.next();
        System.out.println(name);
    }
}
