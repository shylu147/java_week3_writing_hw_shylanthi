package homework_week_7;

import java.util.Arrays;

/**Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17_SortArray {
    public static void main(String[] args) {
        //numerical array declaration
        int[] numArray={1789,2035,1899,2040,1950,2255,7897,1455,787};

        //String array declaration
        String[] strArray={"alpha","bravo","delta","peter","mike"};
        System.out.println("Actual numerical array was : " + Arrays.toString(numArray));
        //sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted numerical Array is : " +Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual string array was : "  +Arrays.toString(strArray));

        //sorting String array
        Arrays.sort(strArray);
        System.out.println("Sorted String array is : " +Arrays.toString(strArray));
    }

}
