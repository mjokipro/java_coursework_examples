/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class Matrix {
    // Initialize a two-dimensional array.
    public static void main(String args[])
    {
        double m[][] = 
        {
            { 0*0, 1*0, 2*0, 3*0 },
            { 0*1, 1*1, 2*1, 3*1 },
            { 0*2, 1*2, 2*2, 3*2 },
            { 0*3, 1*3, 2*3, 3*3 }
                
        };
        int i, j;
        
        for (i=0; i<4; i++)
        {
            for(j=0; j<4; j++)
                  System.out.print(m[i][j] + " ");
                System.out.println();
        }
    }
    
}
