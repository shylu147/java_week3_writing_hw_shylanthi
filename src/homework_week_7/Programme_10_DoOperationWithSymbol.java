package homework_week_7;

import java.util.Scanner;

public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.println("Please enter the first number : ");
    int a =s.nextInt();
        System.out.println("Please enter the second number : ");
    int b=s.nextInt();
        System.out.println("Please select the calculation symbol +,-,*,/: ");
        char symbol=s.next().charAt(0);
        doOperationWithSymbol(a,b,symbol);
}
        public static void  doOperationWithSymbol(int a, int b,char symbol){
        if(symbol=='+'){
            System.out.println(a + "+ " +b+ "=" +(a+b));
        } else if (symbol=='-') {
            System.out.println(a + "- " + b + "=" + (a - b));
        } else if (symbol=='*') {
            System.out.println(a + "* " + b + "=" + (a *b));
        } else if (symbol=='/') {
            System.out.println(a + "/ " + b + "=" + (a / b));
        }else {System.out.println(" Please enter the correct symbol +,-,*,/");
        }

}}
