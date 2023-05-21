/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
class IfSample {
    
    //Demonstrate the if(condition) statement.
    public static void main(String args[]) {
          
        int x,y;
        
        x = 10;
        y = 20;
        
        if(x < y) System.out.println("x is less than y");
        
        x = x * 2;
        if(x == y) System.out.println("x now equal to y");
        
        x = x * 2;
        if(x > y) System.out.println("x now greater than y");
        
        // this won't display anything
        if(x == y) System.out.println("you won't see this");
        
    }
}
