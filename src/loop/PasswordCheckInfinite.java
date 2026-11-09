
package loop;

import java.util.Scanner;

/**
 *
 * @author kheal
 */
public class PasswordCheckInfinite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myKB = new Scanner(System.in);
        String pword;
       
        String correctPassword = "Password";
        int attempts = 5;            
        do{
            //ask user for password at least once!
            
            System.out.println("Please enter your password ("+ attempts + " atttempts left)"); // this is a more interactive message that chanes each time
             pword = myKB.nextLine();
             
             
             
             //repeat if user gets password wrong
             attempts--;
        }while (!pword.equals(correctPassword) && attempts >0);
        
        if (!pword.equals(attempts)) {
            System.out.println("Access granted");    
        } else {
            System.out.println("Access denied. You are now locked out of the system");
        }  
    }
    
}
