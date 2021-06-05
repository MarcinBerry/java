/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_2;

/**
 *
 * @author Marcin-PC
 */

class FreshJuice
{
    enum FreshJuiceSize
    {
        SMALL,
        MEDIUM,
        LARGE
    }
    FreshJuiceSize size;

}
public class FreshJuiceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size: " + juice.size);
        
    }
    
}
