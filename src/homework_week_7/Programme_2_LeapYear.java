package homework_week_7;
/**Write a java program to input any year lik(ex 2007) and find out if it is a leap year or not
 */
import java.util.Scanner;

public class Programme_2_LeapYear {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the year : ");
        int year=s.nextInt();
        Programme_2_LeapYear obj=new Programme_2_LeapYear();
        obj.isItLeapYear(year);
        s.close();
    }

    //Checking is it leap year or not
    public void isItLeapYear(int year){
        if (year%4==0 && year%100!=0 || year%400==0 ){
            System.out.println("The year" +year+ "is a leap year");
        }
        System.out.println("The year" +year+ "is not a leap year");

    }


}
