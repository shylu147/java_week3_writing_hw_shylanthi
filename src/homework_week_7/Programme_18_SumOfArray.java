package homework_week_7;

import java.util.Arrays;
import java.util.Scanner;

/*** Write a Java program to sum values of an array.
 */
public class Programme_18_SumOfArray {
    public static void main(String[] args) {
        int[] numArray={8465,3945,9846,8678,3645,8456,7649,1296,8564};
        int sum=0;
        //Calculating the sum of array using for loop
        for(int i=0; i< numArray.length;i++){
            sum=sum+ numArray[i];
        }
        System.out.println("Values of the element s of the arrays are : " + Arrays.toString(numArray));
        System.out.println("Sum of all values of the arrays are : " +sum);
    }
}
