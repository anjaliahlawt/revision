//Two Sum : Check if a pair with given sum exists in Array

//1 approch
/* 
import java.util.*;
public class arr1
 {

   public static void main(String[] args) 
   {
      int[] arr = {2, 6, 5, 8, 11};
      int n = arr.length;
      int k = 14;
      String ans = sum(arr, n,k);
      System.out.println(ans);
   }

   static String sum(int[]arr, int n, int k) {
      int start = 0;
      int end= n-1;
      Arrays.sort(arr);

      while(start< end) {
         int count= arr[start] + arr[end];
         if (count==k) {
            return "yes";
         }

          else if (count<k) {
            start++;
         } else {
            end--;
         }
      }

      return "NO";
   }
}


*/

//2 approch

public class arr1
{
    public static void main(String[] args)
    {
        int[]arr={2,6,5,8,11};
        int n =arr.length;
        int k=14;
        String ans=sum(arr,n,k);
        System.out.println(ans);
    }
     static String sum(int[]arr,int n,int k)
     {
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i+1;j<n;j++)
            {
              count=arr[i]+arr[j];
              if(count==k)
              {
                 return "yes";
              }
              
            }
        }
        return "no";
     }
}