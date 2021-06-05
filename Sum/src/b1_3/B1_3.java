
package b1_3;

import java.util.Scanner;

public class B1_3 {


    public static void main(String[] args) {
        
        int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        
        sc.close();
        
        int sum;
        sum = num1 + num2;
        
        System.out.println("Sum of these numbers: "+sum);
    }
    
}
