
package pkg5_1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double numbers[10];
        int tracker = 1;
        int choose;
        while (true)
        {
            System.out.println("Enter a "+tracker+"number: ");
        
            numbers[tracker] = scan.nextDouble();
            
            tracker++;
            
            System.out.println("Choose option, '1' for next number and '2' to calculate");
            
            choose = scan.nextInt();
            switch(choose)
            {
                case 1:
                {
                    break;
                }
                case 2:
                {
                    
                }
            }
        }
    }
    
}
