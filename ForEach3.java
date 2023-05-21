/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class ForEach3 
{
    // Use for-each style for on a two-dimensional  array.
    
    public static void main(String args[])
    {
        int sum = 0;
        int nums [] [] = new int [3] [5];
        
        // give nums some values
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i+1) * (j+1);
                
        // use enhanced for loop to display and sum values
        for (int x [] : nums)
        {
            for (int y : x)
            {
                System.out.println("Summation: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
    }
}
