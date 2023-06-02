package homework_week_7;

import java.util.Scanner;

public class Programme_13_FindTheDayName {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Please enter the number between 1 to 7 : ");
        int day=s.nextInt();
        findTheDayName(day);
        s.close();

    }
    public static void findTheDayName(int day){
     switch (day){
         case 1:
             System.out.println("Its a Monday");
             break;
         case 2:
             System.out.println("Its a Tuesday");
             break;
         case 3:
             System.out.println("Its a Wednesday");
             break;
         case 4:
             System.out.println("Its a Thursday");
             break;
         case 5:
             System.out.println("Its a Friday");
             break;
         case 6:
             System.out.println("Its a Saturday");
             break;
         case 7:
             System.out.println("Its a Sunday");
             break;
         default:
             System.out.println("Week contains 1 to 7 days");


     }
    }

}
