
package firstsemester;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Firstsemester {
    public static void main(String[] args) {
       Scanner myKb = new Scanner(System.in);
       boolean valid = false;
       

       System.out.println("please enter your name");
       String myName = myKb.nextLine();

       System.out.println("hello, " + myName);
       
       while (!valid) {
           System.out.println("please enter your age");
           try {
           
           int myage = myKb.nextInt();
           System.out.println("you are " + myage + " years old");
           } catch (InputMismatchException error) {
                System.out.println("Error, you need to enter a number!");
                myKb.nextLine();
        }
       }
       myKb.close();
    }
}
