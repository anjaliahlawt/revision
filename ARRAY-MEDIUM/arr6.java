//Rearrange the array in alternating positive and negative items value order maintain

import java.util.*;
public class arr6
 {
    public static void main(String[] args) 
    {
        int[]arr={1,2,-4,-5};
        int n=arr.length;
        int posindex=0;
        int negindex=1;
        int[]arr1=new int[n];
        for(int i=0;i<n;i++)
        {
          if(arr[i]<0)
          {
            arr1[negindex]=arr[i];
            negindex=negindex+2;
          }
          else if(arr[i]>=0)
          {
            arr1[posindex]=arr[i];
            posindex=posindex+2;
          }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
