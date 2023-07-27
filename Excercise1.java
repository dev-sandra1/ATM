import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        int startingSalary = 1000;
        int options;
        int income, withdrawal,amount;

        System.out.println("Welcome to an automated teller machine, what do you want to do?:");
        System.out.println(
        "1. deposit money to the account\n" +
        "2. withdraw money from the account\n" +
        "3. go out");
        options = enter.nextInt();

        switch (options) {
            case 1: income =Float.parseFloat(System.out.println("Type the amount you want to leave:")); 
                 amount = startingSalary + income;
          break;
        
         default:
    
          break;


        }


    }
}