package homework_week_7;

import java.util.Scanner;

public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the seller name : ");
        String name=s.nextLine();
        System.out.println("Enter the seller ID : ");
        int ID=s.nextInt();
        System.out.println("Enter sales amount : ");
        int salesAmount =s.nextInt();
        System.out.println("Enter the basic salary : ");
        int basicSalary=s.nextInt();

        //creating object to call instance method
        Programme_7_SalesCommission obj=new Programme_7_SalesCommission();
        int grossSalary=basicSalary+ obj.calculateCommission(salesAmount);
        obj.calculateCommission(salesAmount);
        System.out.println("Seller name is            : " + name);
        System.out.println("Seller id is              : " + ID);
        System.out.println("Seller's sales amount is  : " + salesAmount);
        System.out.println("Seller's basic salary is  : " + basicSalary);
        System.out.println("Seller's gross salary is  : " + grossSalary);
        s.close();
}
public int calculateCommission(int salesAmount){
        int commision;
      if(salesAmount>=50000){
          commision=(salesAmount*35)/100;
          System.out.println("Sales commision is " + commision);
      } else if (salesAmount>=30000) {commision=(salesAmount*20)/100;
          System.out.println(" Sales commission is " + commision);
      } else if (salesAmount>=20000) {commision=(salesAmount*10)/100;
          System.out.println("Salels commision is " +commision);
      } else if (salesAmount>=10000){commision=(salesAmount*5)/100;
          System.out.println(" Sales commision is " +commision);
      } else {commision=(salesAmount*2)/100;
          System.out.println("Sales commision is  " +commision);
     }
      return commision;
    }
}
