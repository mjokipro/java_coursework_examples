/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class TwoDArray {
    // Demonstrate a two-dimensional array.
      
    public static void main(String args[]) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;
        
        for(i=0; i<4; i++)
        {
            for(j=0; j<4; j++)
            {
                twoD[i][j] = k;
                //System.out.print(k + " ");
                k++;
            }
        }
        
        for(i=0; i<4; i++) 
        {
            for(j=0; j<5; j++)
            {
            System.out.print(twoD[i][j] + " ");
            System.out.println();
            }
        }
    }
}
