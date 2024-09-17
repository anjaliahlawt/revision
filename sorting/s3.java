//Insertion sort

// ist approch
/* 
import java.util.*;
public class s3 
{
    public static void main(String[] args) 
    {
       int arr[]={7,8,3,1,2};
       int n =arr.length;
      for(int i=1;i<n;i++)
      {
        for(int j=i;j>0;j--)
        {
            if(arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            else
            {
                break;
            }
        }
      }  
      System.out.println(Arrays.toString(arr));
    }
    
}
*/

public class s3
{
    public static void main(String[] args)
     { 
        int arr[]={7,8,3,1,2};
        int n =arr.length;
        for(int i=0;i<=n-1;i++)
        {
          int j=i;
          while(j>0&&arr[j-1]>arr[j])
          {
             int temp=arr[j];
              arr[j]=arr[j-1];
              arr[j-1]=temp;
              j--;
            
          }
          
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]);
        }
    }
}