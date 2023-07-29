import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);

        int startingSalary = 1000;
        int options;
        int result, take , withdrawal,amount;

        System.out.print("Welcome to an automated teller machine, what do you want to do?" 
       + "\n 1. deposit money to the account" 
       + "\n 2. withdraw money from the account" 
       + "\n 3. go out"
       + "\n option: ");
        options = entry.nextInt();
      

            switch (options) {
                 case 1:  System.out.print("Type the amou nt you want to leave?: "); 
                 amount = entry.nextInt();
                  result = amount + startingSalary;
                 System.out.print("your account total is: " + result);
                  break;
                  case 2:  System.out.print("how much do you want to withdraw?: ");
                  withdrawal = entry.nextInt();
                  take = startingSalary - withdrawal;
                  System.out.print("your account total is: " + take);
                  break;

                 case 3: System.out.print("bye bye :D");
                 break;
        
                 default:
                System.out.print("please try again later:<");
                 break;


            }


    }
}