/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class Nested 
{
    // Loops may be nested.
    
    public static void main(String args[])
    {
        int i, j;
        
        for (i=0; i<10; i++)
        {
            for (j=i; j<10; j++)
                System.out.print(".");
            System.out.println();
           
        }
    }
}
