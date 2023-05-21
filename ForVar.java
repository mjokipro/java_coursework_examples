/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class ForVar 
{
    // Parts of the for loop can be empty.
    public static void main(String args[])
    {
        int i;
        boolean done = false;
        
        i = 0;
        for( ; !done; )
        {
            System.out.println("i is " + i);
            if(i == 10) done = true;
            i++;
        }
    }
}
