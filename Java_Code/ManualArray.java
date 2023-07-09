/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CareerPractice;

/**
 *
 * @author mjokipro
 */
public class ManualArray {

    public static void Main(String args[]) {
        int twoD[][] = new int[4][];
        twoD[0] = new int[5];
        twoD[1] = new int[5];
        twoD[2] = new int[5];
        twoD[3] = new int[5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }

            System.out.println();
        }

    }

}
