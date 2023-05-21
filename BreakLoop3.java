/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class BreakLoop3 
{
    // Using break with nested loops.
    public static void main(String args[])
    {
        for (int i=0; i<3; i++)
        {
            System.out.print("Pass " + i + ": ");
            for (int j=0; j<100; j++)
            {
                if (j == 10) break; // terminate loop if j is 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loops complete.");
    }
}
