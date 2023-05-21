/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class Scope {
    public static void main(String args[]) {
        int x; // known to all code within main()
        
        x = 10;
        if(x == 10) { // start new scope
            int y = 20; // known only to this block
            
            // x and y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; Error! y not known here
        
        // x is still known here.
        System.out.println("x is " + x);
    }
    
}
