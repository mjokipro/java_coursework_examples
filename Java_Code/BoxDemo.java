/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 * @author mjokipro
 * 
 * A program that uses the Box class.
 * Call this file BoxDemo.java
 */

class Box 
{
    double width;
    double height;
    double depth;
}

// This class declares an object of type Box.
class BoxDemo
{
    public static void main(String args[])
    {
        Box mybox = new Box();
        double vol;
        
        // assign values to mybox's instance variables
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        
        // compute volume of box
        vol = mybox.width * mybox.height * mybox.depth;
        
        System.out.println("Volume is " + vol);
    }
}