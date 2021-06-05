
package pkg4_3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width of the Triangle: ");
        double base = scan.nextDouble();
        
        System.out.println("Enter the height of the Traingle: ");
        double height = scan.nextDouble();
        
        double area = (base*height)/2;
        System.out.println("Area of Traingle is: " + area);
    }
    
}
