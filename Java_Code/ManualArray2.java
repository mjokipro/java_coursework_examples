/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class ManualArray2 
{
    // Manually allocate differing size second dimensions.
     public static void Main(String args[])
    {
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int i, j, k = 0;
        
        for(i = 0; i < 4; i++)
        {
            for(j = 0; j < i+1; j++)
            {
                k = twoD[i][j];
                k++;
            }
                //System.out.print(twoD[i][j] + " ");
            
            
            for(i=0; i< 4; i++)
            {
                for(j=0; j<i+1; j++)
                {
                    System.out.print(twoD[i][j] + " ");
                     System.out.println();
                }
            } 
            

        }
        

    }
    
}
