package Com;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int emlyID = in.nextInt();
        String department = in.next();

        switch(emlyID){
            case 1:
                System.out.println("My name is sonu pandit");
                break;
            case 2:
                switch (department){
                    case "it":
                        System.out.println("IT");
                        break;
                    case "ai":
                        System.out.println("Artificial inteligent");
                        break;
                }
        }
    }
}
