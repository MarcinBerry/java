/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_1;
import java.util.Scanner;

/**
 *
 * @author Marcin-PC
 */
public class B1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       Scanner scan= new Scanner(System.in);
       System.out.print("Enter any number: ");
       
       int num = scan.nextInt();
       
       scan.close();
       
       System.out.println("The number entered by user: "+num);
    }
    
}
