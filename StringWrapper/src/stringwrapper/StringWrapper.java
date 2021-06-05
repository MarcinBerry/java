/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringwrapper;

/**
 *
 * @author Marcin-PC
 */
public class StringWrapper {
    public static void main(String[] args) {
    String my = new String("Marcin Bernecki");
    
    StringBuilder ini = new StringBuilder();
    int length = my.length();
    
    for (int i = 0; i < length; i++)
    {
        if(Character.isUpperCase(my.charAt(i))) {
            ini.append(my.charAt(i));
    }
    }
    System.out.println(ini.toString());
}
}