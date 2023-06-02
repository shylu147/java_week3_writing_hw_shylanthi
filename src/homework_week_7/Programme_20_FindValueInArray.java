package homework_week_7;
/**Writ  a java program to test if an array contains a specific value
 */
public class Programme_20_FindValueInArray {
    // This method will find if array contain value or not?
    public static boolean isArrayContains(int[] arr,int item){
        boolean isContain=false;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==item){isContain=true;
                break;
        }
    } return isContain;
}

    public static void main(String[] args) {
        //declaring the numeric array
        int[] numArray={2945,9484,6539,9034,9856,8967,5647};
        System.out.println(isArrayContains(numArray,2945));
        System.out.println(isArrayContains(numArray,659));
    }}
