package Com;

import java.util.Scanner;

public class weeksPrint {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the days");
        int Days = in.nextInt();
//        switch (Days) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wensday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("satuarday");
//            case 7 -> System.out.println("sunday");
//            default -> System.out.println("Enter the valid days");
//        }
        switch(Days){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Starting your Weekdays");
            case 3:
            case 4:
            case 5:
                System.out.println("weeksDays");
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter the valid days");
        }
    }
        }


