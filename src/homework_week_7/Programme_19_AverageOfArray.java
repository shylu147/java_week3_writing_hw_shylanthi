package homework_week_7;

import java.util.Arrays;

/**Write a program to calculate average value of array
 */
public class Programme_19_AverageOfArray {
    public static void main(String[] args) {
        int[] numArray={2944,94947,8474,860,10368245,};
        int sum=0;
        //calculating the sum of array value
        for(int i=0; i< numArray.length; i++){
            sum= sum + numArray[i];
        }
        //Finding the average of arrays value
        int average=sum/numArray.length;
        System.out.println("Values of the elements of the arrays are ; " + Arrays.toString(numArray));
        System.out.println("Average of the values of the arrays are : " + average);
    }

}
