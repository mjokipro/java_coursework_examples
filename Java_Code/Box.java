/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * @author mjokipro
 * 
 * A program that uses the Box class.
 * Call this file BoxDemo.java
 */

 // create Box class
class Box {
    double width;
    double height;
    double depth;
    
    // create constructor and set instance vars
    void setDem(double w, double h, double d) {
         this.width = w;
         this.height = h;
         this.depth = d;
    }

    // one way of calc and return volume
    double volume() {
        return width * height * depth;
    }
}
// This class declares an object of type Box.
class BoxDemo
{
    public static void main(String args[])
    {
        Box mybox = new Box();
        Box mybox2 = new Box();
       
        // assign values to mybox and mybox2
        // instance variables
        mybox.setDem(11.2, 15.3, 10.8); 
        mybox2.setDem(15.2, 7.3, 14.4); 

            
        
        System.out.println("Volume is " + mybox.volume());
        System.out.println("Volume is " + mybox2.volume());
    }
}