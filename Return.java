/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class Return 
{
    // Demonstrate return.
    public static void main(String args[])
    {
        boolean t = true;
        
        System.out.println("Before the return.");
        
        if(t) return; // return to caller
        
        System.out.println("This won't execute.");
    }
}
