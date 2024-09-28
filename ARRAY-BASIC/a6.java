//Rotate array by K elements

/* 
import java.util.*;
public class a6
{
   public static void main(String[] args) 
   {
     int[]arr={1,2,3,4,5,6,7};
     int n =arr.length;
     int d=3;
     int[]temp=new int[d];
     for(int i=0;i<d;i++)
     {
        temp[i]=arr[i];
     }
     for(int i=d;i<n;i++)
     {
        arr[i-d]=arr[i];
     }
     for(int i=n-d;i<n;i++)
     {
        arr[i]=temp[i-(n-d)];
     }
    System.out.println(Arrays.toString(arr));
   } 
}
*/

//left rotate

/* 
import java.util.*;
public class a6
{
    public static void main(String[] args) 
    {
        int[]arr={1,2,3,4,5,6,7};
        int n =arr.length;
        int d=3;
        rotate(arr,n,d);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[]arr,int start,int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

}
static void rotate(int[]arr,int n,int d)
{
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
}
}
*/

//right rotate

/* 
import java.util.*;
public class a6
{
    public static void main(String[] args) 
    {
        int []arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int d=3;
        rotate(arr,n,d);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[]arr,int start,int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void rotate(int[]arr,int n,int d)
    {
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
    }
}
    */