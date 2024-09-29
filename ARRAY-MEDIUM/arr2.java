//Sort an array of 0s, 1s and 2s

//1 approch time complexity is:o(n2)
/* 
import java.util.*;
public class arr2 
{
    public static void main(String[] args) 
    {
        int[]arr={2,0,2,1,1,0};
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
          {
            if(arr[i]>arr[j])
            {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
            }
          }
        }
        System.out.println(Arrays.toString(arr));
    }
  }
  
*/

//2 approch: dutch national flag algorithm.o(n)

import java.util.*;
public class arr2
{
  public static void main(String[] args) 
  {
    int arr[]={2,0,2,1,1,0};
    int n=arr.length;
    int start=0;
    int mid=0;
    int end=n-1;
    while(mid<end)
    {
      if(arr[mid]==0)
      {
        int temp=arr[mid];
        arr[mid]=arr[start];
        arr[start]=temp;
        start++;
        mid++;
      }
      else if(arr[mid]==1)
      {
        mid++;
      }
      else if(arr[mid]==2)
      {
        int temp=arr[mid];
        arr[mid]=arr[end];
        arr[end]=temp;
        end--;
      }
    }
    System.out.println(Arrays.toString(arr));
    
  }
}