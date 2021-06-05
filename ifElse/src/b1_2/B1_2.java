

package b1_2;

import java.util.Scanner;

public class B1_2 {

    public static void main(String[] args) {
        
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        number = scan.nextInt();
        scan.close();

        if(number > 0)
        {
            System.out.println(number+" is a positivie number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is a neither positive or negative number");
        }
    }
    
}
