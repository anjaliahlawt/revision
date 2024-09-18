
//Merge sort
import java.util.*;

public class s4 {
    public static void main(String[] args) 
    {
        int[] arr = { 6, 2, 5, 1, 4, 2, 3 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        System.out.print(Arrays.toString(arr));
    }

    static void divide(int[] arr, int start, int end) 
    {
        if (start == end) 
        {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    static void conquer(int[] arr, int start, int mid, int end) 
    {
        int[] arr1 = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int index = 0;
        while (left <= mid && right <= end) 
        {
            if (arr[left] <= arr[right]) 
            {
                arr1[index] = arr[left];
                left++;
                index++;
            } else 
            {
                arr1[index] = arr[right];
                right++;
                index++;
            }
        }
        while (left <= mid) 
        {
            arr1[index] = arr[left];
            left++;
            index++;
        }
        while (right <= end)
         {
            arr1[index] = arr[right];
            right++;
            index++;
        }
        index = 0;
        while (start <= end) 
        {
            arr[start] = arr1[index];
            start++;
            index++;
        }
    }
}
