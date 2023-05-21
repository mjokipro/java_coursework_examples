/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class Search 
{
    // Search an array using enhanced for loop.
    public static void main(String args[])
    {
        // vals not in order
        int nums [] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 5;
        
        boolean found = false;
        
        // use for-each to search nums for val
        for (int x : nums)
        {
            if (x == val)
            {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Value found!");
    }
}
