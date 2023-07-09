/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class MissingBreak 
{
    // In a switch, break statements are optional.
    public static void main(String args[])
    {
        for(int i=0; i<12; i++)
            switch(i)
            {
                case 0: // i is case 0 1 or 2
                case 1:
                case 2:
                    System.out.println(i + " i is less than 3");
                    break;
                case 3:
                case 4:
                    System.out.println(i + " i is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(i + " i is less than 10");
                    break;
                default:
                    System.out.println(i + " i is 10 or more");
                    
            }
    }
}
