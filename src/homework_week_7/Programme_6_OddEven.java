package homework_week_7;

import java.util.Scanner;

public class Programme_6_OddEven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number=s.nextInt();
        Programme_6_OddEven obj=new Programme_6_OddEven();
        System.out.println( number +  " is  " + obj.isItEvenOrOddNumber(number) +  " number ");
    }

    //Checking odd or even
    public String isItEvenOrOddNumber(int number) {
        if (number % 2 == 0) {
            return "Even";

    }else {
        return
            "Odd";}

}}
