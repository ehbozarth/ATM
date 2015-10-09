import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by earlbozarth on 10/9/15.
 */
public class Account {
    String accName;
    double balance;

    HashMap <String, Double>  accounts = new HashMap();

    void chooseName() throws Exception {
        System.out.println("What the name for your account?");
        accName = ATM.nextLine();

        if(!accounts.containsKey(accName)){

            System.out.println("Would you like a new account " + accName + "? [y/n]");
            String answer = ATM.nextLine();
            if(answer.equals("y") || answer.equals("Y")) {
                balance = 100.00;
                accounts.put(accName, balance);
            }
            else{
                balance = 0.00;
                System.out.println("You did not create an account.");
            }//If user does not create account, then balance is kept at 0 so prevoius account balances do not cross over
        }
    }//end of Choose Name

    void getChoice() throws Exception {
        System.out.println("What you like to do today? Please use number");
        System.out.println("[1] Check My Balance");
        System.out.println("[2] Withdraw Funds");
        System.out.println("[3] Cancel");
        System.out.println("[4] Remove account");

        balance = accounts.get(accName);

        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();

        int choiceNum = Integer.valueOf(choice);

        if (choiceNum == 1){
            System.out.println(balance);
        }//end of if (1)
        else if (choiceNum == 2){
            System.out.println("How much money would you like to withdraw?");

            String input = in.nextLine();
            double withdraw = Double.valueOf(input);

            if(withdraw > balance || withdraw < 0 ){
                throw new Exception("You broke. Get a job");
            }//end of if
            else {
                balance = balance - withdraw;
                accounts.put(accName,balance);
                System.out.println("Please take your money $" + withdraw );
                System.out.println("Your new balance is $" + balance);

            }//end of else
        }//end of else if (2)
        else if(choiceNum == 3){
            System.out.println("Thank you, please come again.");
            System.exit(0);
        }//end of else if (3)
        else if(choiceNum ==4){
            System.out.println("Removing account " + accName);
            accounts.remove(accName);
        }
    }//End of getChoice

}//End of Account Class