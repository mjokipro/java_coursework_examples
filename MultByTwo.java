/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class MultByTwo
{
    // Left shifting as a quick way to multiply by 2.
    
    public static void main(String args[])
    {
        int i;
        int num = 0xFFFFFFE;
        System.out.println((byte)num);
        
        for(i=0; i<4; i++) 
        {
            num = num << 1;
            System.out.println(num);
            
        }
    }
}
