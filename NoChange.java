/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class NoChange 
{
    // The for-each (enhanced) loop is essentially read-only.
    public static void main(String args[])
    {
        int nums [] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        for (int x: nums)
        {
            System.out.print(x + " ");
            x *= 10; // no effect on nums
        }
        
        System.out.println();
        
        for ( int x : nums )
            System.out.print(x + " ");
        
        System.out.println();
    }
}
