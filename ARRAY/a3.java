//Check if an Array is Sorted

//package ARRAY;

public class a3 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4};
        int n =arr.length;
        boolean ans=sorted(arr,n);
        System.out.println(ans);
    }
    static boolean sorted(int[]arr,int n)
    {
        for(int i=0;i<n;i++)
        {
          if(arr[i]<=arr[i+1])
          {
             return true;
          }
         
        }
        return false;
    }
}
