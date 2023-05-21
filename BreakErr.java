/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class BreakErr 
{
    public static void main(String args[])
    {
        one: for (int i=0; i<3; i++)
        {
            System.out.print("Pass " + i + ": ");
        }
        for (int j=0; j<100; j++)
        {
          // if (j == 10) break one; WRONG - MUST BE IN LABEL
        }
    }
}
