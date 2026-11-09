


package loop;

 
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
    Scanner mykb = new Scanner (System.in);
    
    System.out.println("digite um numero");
    int currNum = -1;   
    int numb = 0;
                // inicializa a guarda
    while (currNum != 0) {
    currNum = mykb.nextInt();
    
    numb += currNum;
    
    }
    System.out.println("The total of those numbers is: " + numb);
    
    
    
        
    }
    
}
