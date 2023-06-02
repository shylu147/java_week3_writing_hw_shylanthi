package homework_week_7;

import java.util.Scanner;

/**Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO"
 */
public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.println("Please enter the number : ");
    int number=s.nextInt();
    findPositiveNegative(number);
}
        public static void findPositiveNegative(int number){
        if (number==0 ){
            System.out.println("The number is zero");
        } else if (number<0) {
            System.out.println("The number is negative");
        }else {
                System.out.println("The number is positive");
        }
    }}
