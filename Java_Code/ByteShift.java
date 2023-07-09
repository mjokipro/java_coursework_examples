/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class ByteShift
{
    // Left shifting a byte value.
    public static void main(String args[])
    {
        byte a = 64, b;
        int i;
        
        i = a << 2; // autopromotes byte to int; i is int type
        b = (byte) (a << 2); /* have to cast byte to convert
                                back from autopromote to int*/
        
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
