//QuickSort

import java.util.*;
public class s5
{
    public static void main(String[] args) 
    {
        int[]arr={6,2,5,1,4,2,3};
        int n =arr.length;
        quicksort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[]arr,int start,int end)
    { if(start>=end)
        {
            return;
        }
        int pivot=partition(arr,start,end);
        quicksort(arr,start,pivot-1);
        quicksort(arr,pivot+1,end);

    }
    static int partition(int[]arr,int start,int end)
    {
        int pos=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[i]<=arr[end])
            {
                int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
                pos++;
            }
        }
        return pos-1;

    }
    
}
