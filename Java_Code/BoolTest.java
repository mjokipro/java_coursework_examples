/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class BoolTest {
    public static void main(String args[]) {
        boolean b;
        
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        
        // a boolen value can control the if statement
        if(b) System.out.println("This is executed.");
        
        b = false;
        
        if(b) System.out.println("This is not executed.");
        
        // outcome of a relational operator is a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
    }
    
}
