
package FileExample;
import java.io.FileWriter;
import java.util.Scanner;


public class fileinput {
    public static void main(String[] args) {
        
        
        try {
        
        Scanner mykb = new Scanner (System.in);
        
        System.out.println("enter the filename");
        String filename = mykb.nextLine();
        
        System.out.println("type a number");
        int numb1 = mykb.nextInt();
        
        System.out.println("type another number");
        int numb2 = mykb.nextInt();
        
        int some = numb1 + numb2;
        
        FileWriter output = new FileWriter(filename);
        
        
        output.write("the anwser is " + some);
        output.close();
        
            System.out.println("answer saved to " + filename);
        
        } catch (Exception e) {
            System.out.println("error! - unable to write to the file");
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
