/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class ThreeDMatrix
{
    // Demonstrate a three-dimensional array.
    public static void main(String args[])
    {
        int threeD[][][] = new int[3][4][5];
        int i, j, k;
        
        for(i=0; i<3; i++) // first dimention loop
            for(j=0; j<4; j++) // second dim loop
                for(k=0; k<5; k++) // third dim loop
                
                    threeD[i][j][k] = i * j * k;
                
        
        for(i=0; i<3; i++)
        {
            for(j=0; j<4; j++)
            {
                for(k=0; k<5; k++)
                    System.out.print(threeD[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
