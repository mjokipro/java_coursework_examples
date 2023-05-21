/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class ForEach 
{
    // Use a for-each (enhanced loop) style for loop.
    public static void main(String args[])
    {
        int nums [] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20 };
        int sum = 0;
        
        // use for-each (enhanced loop) to display and sum values
        for (int x : nums) // for each x in nums [], sequentially
        {
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);
    }
}
