
package firstsemester;
import java.util.Scanner;

public class asking_goal_colour {
    
    public static void main(String[]args) {
        Scanner myKB = new Scanner(System.in);
        
        String quest;
        String colour;
        
        System.out.println("What is your quest?");
        
        quest = myKB.nextLine();
        
        System.out.println("What is your favourite colour?");
        colour = myKB.nextLine();
        
        System.out.println("Ah, I see your quest is to " + quest + ", and your favourite colour is " + colour);
        
        myKB.close();
    }
    
}
