

public class MinMaxSum {
public static void main(String [] args) {
          // Write your code here
          long minSum = 0;
          long maxSum = 0;
          long sum = 0;
          
          for(int j = 0; i < arr.length; i++) {
              for(int i = 0; i < arr.length; i++) {
               sum += arr.get(i);
              }
              sum -= arr.get(i);
              
              if(sum < maxSum)
                  minSum = sum;
                  
              else 
                  maxSum = sum;
          }
          System.out.println(minSum + "  " + maxSum);
             }
}
