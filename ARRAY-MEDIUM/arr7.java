//next permuattion and o(n)
import java.util.*;
public class arr7
 {
    public static void main(String[] args) 
    {
        int[]arr={3,2,1};
        int n=arr.length;
         nextperm(arr, n);
         System.out.println(Arrays.toString(arr));

    }
    static void nextperm(int[]arr,int n)
    {
        if(arr==null||n<=1)
        {
            return;
        }
        int i=n-2;
        while(i>=0&&arr[i]>=arr[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j=n-1;
            while(arr[j]<=arr[i])
            {
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,n-1);
    }
    static void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[]arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
