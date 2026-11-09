
package substring;

import java.util.Scanner;
        
public class java {
    public static void main(String[] args) {
        Scanner mykb = new Scanner(System.in);
        
        System.out.println("digite algo");
        String entrada = mykb.nextLine(); 
        
        if (entrada.matches("[0-9]+")) {
        
        System.out.println("Só tem números!");
        } else {
        System.out.println("Tem algo que não é número.");
        }
        
    } 
}
