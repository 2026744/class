
package FileExample;


import java.io.FileReader;
import java.util.Scanner;


public class filereader {
    public static void main(String[] args) {
        try{
        
        Scanner MyInput = new Scanner(new FileReader("C:\\Users\\Educo\\Documents\\NetBeansProjects\\firstsemester\\oxes"));
        
        String text = MyInput.nextLine();
        
            System.out.println("the data in the file is " + text);
            
            while (MyInput.hasNextLine()){
                 //is there anything in the file?
                 
                text = MyInput.nextLine();
                 
                 System.out.println("I have just read: " + text);
             }
             System.out.println("END OF FILE!");
        
            
        }catch (Exception e) {
        System.out.println("ERROR - Unable to open the file");
    
    }
    }
    
}
