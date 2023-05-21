/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class ByteUnsignedShift 
{
    // Unsigned shifting a byte value.
    static public void main(String args[])
    {
        char hex[] = 
        {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        
        byte b = (byte) 0xf1;
        System.out.println(b);
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);
        byte e = (byte) ((b & 0xff) >> 4);
        
        System.out.println("              b = 0x"
         + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println("         b >> 4 = 0x"
         + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println("        b >>> 4 = 0x"
         + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        System.out.println("(b & 0xff) >> 4 = 0x"
         + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
        
    }
}
