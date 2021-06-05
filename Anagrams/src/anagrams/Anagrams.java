/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrams;

/**
 *
 * @author Marcin-PC
 */
public class Anagrams {

 protected static String removeJunk(String string) {
        int  len = string.length();
        StringBuilder dest = new StringBuilder(len);
  		char c;

	    for (int i = 0; i < len; i++) {
	        c = string.charAt(i);
	        if (Character.isLetter(c)) {
		        dest.append(c);
	        }
	    }

        return dest.toString();
    }
    public static boolean areAnagrams(String string1, String string2) {
        String workingCopy1 = removeJunk(string1);
        String workingCopy2 = removeJunk(string2);
        
        workingCopy1 = workingCopy2.toLowerCase();
        workingCopy2 = workingCopy2.toLowerCase();
        
        workingCopy1 = sort(workingCopy1);
        workingCopy2 = sort(workingCopy2);
        return workingCopy1.equals(workingCopy2);
    }
    
    protected static String sort(String string) {
        char[] charArray = string.toCharArray();
        java.util.Arrays.sort(charArray);
        
        return new String(charArray);
    }
    
    public static void main(String[] args) {
        String string1 = "Cosmo and Laine";
        String string2 = "Maid, clean soon!";
        
        if(areAnagrams(string1, string2)) {
            System.out.println("They are anagrams");
        }
        else 
            System.out.println("The are't anagrams");
    }
    
}
