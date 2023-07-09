/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class Break 
{
    // Using break as a civilized form of goto.
    public static void main(String args[])
    {
        boolean t = true;
        
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before the break.");
                    if (t)
                        break second; // break out of second block
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block.");
        }
    }
}
