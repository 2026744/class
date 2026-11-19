package loop;

import java.util.Scanner;

public class carparking {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("welcome to the car park");
        
        for (int i = 49; i > 0; i--) {
            System.out.println("please, press the button to get a ticket");
            kb.nextInt();
            System.out.println("here is your ticket, have a nice day (" + i +" spaces left)");
        }
            System.out.println("no more spaces left");
    }
    
}
