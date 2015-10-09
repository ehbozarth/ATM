/**
 * Created by earlbozarth on 10/9/15.
 */import java.util.*;

/**

 Created by earlbozarth on 10/8/15.
 */

public class ATM {

    public static void run() throws Exception{
        System.out.println("Please enter in your name");
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        int account = 100;

        if(name.length() == 0 ){
            throw new Exception("You did not enter a valid name");
        }

        System.out.println("What you like to do today?");
        System.out.println("[1] Check My Balance");
        System.out.println("[2] Withdraw Funds");
        System.out.println("[3] Cancel");

        String choice = in.nextLine();

        int choiceNum = Integer.valueOf(choice);

        if (choiceNum == 1){
            System.out.println("Your balance in $100");
        }//end of if (1)
        else if (choiceNum == 2){
            System.out.println("How much money would you like to withdraw?");

            String input = in.nextLine();
            int withdraw = Integer.valueOf(input);

            if(withdraw > account){
                throw new Exception("You broke. Get a job");
            }//end of if
            else {
                account = account - withdraw;
                System.out.println("Please take your money $" + withdraw );
                System.out.println("Your new balance is $" + account);

            }//end of else
        }//end of else if (2)
        else if(choiceNum == 3){
            System.out.println("Thank you, please come again.");
        }//end of else if (3)
    }//End of run()
}//End of ATM Class
