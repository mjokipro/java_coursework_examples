/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class NoBody 
{
    // The target of a loop can be empty.
    public static void main(String args[])
    {
        int i, j;
        
        i = 100;
        j = 200;
        
        // find midpoint between i and j
        while(++i < --j); // no body in this loop
        
        System.out.println("Midpoint is " + i);
    }
}
