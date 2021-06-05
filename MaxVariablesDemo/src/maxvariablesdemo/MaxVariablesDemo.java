/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxvariablesdemo;


public class MaxVariablesDemo {
    public static void main(String[] args) {
        //integers
        byte smallestByte = Byte.MIN_VALUE;
        short smallestShort = Short.MIN_VALUE;
        int smallestInt = Integer.MIN_VALUE;
        long smallestLong = Long.MIN_VALUE;
        
        //real numbers
        float smallestFloat = Float.MIN_VALUE;
        double smallestDouble = Double.MIN_VALUE;
        
        //other primitive types
        char aChar = 'S';
        boolean aBoolean = true;
        
        System.out.println("The smallest byte value is " + smallestByte + ".");
        System.out.println("The smallest short value is " + smallestShort + ".");
        System.out.println("The smallest integer value is " + smallestInt + ".");
        System.out.println("The smallest long value is " + smallestLong + ".");
        
        if (Character.isUpperCase(aChar)) {
            System.out.println("The character " + aChar + " is uppercase.");
        }
        else {
            System.out.println("The character " + aChar + " is a lowercase");
        }
        
        System.out.println("The value of aBoolean is " + aBoolean + ".");
    }
    
}
