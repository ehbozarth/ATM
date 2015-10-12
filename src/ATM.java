/**
 * Created by earlbozarth on 10/9/15.
 */
import java.util.*;


public class ATM {

    static Account acct;

    public static void main(String [] args) throws Exception{

        acct = new Account();
        HashMap <String, Double>  accounts = new HashMap();

        while (true){
            acct.chooseName(accounts);
            acct.selectChoice(accounts);
        }//End of while loop

    }//End of run()

    static String nextLine() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.length() == 0 ){
            throw new Exception("Your entry was not valid");
        }
        return s;
    }//End of nextLine

}//End of ATM Class



