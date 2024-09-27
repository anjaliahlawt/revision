//Remove Duplicates in-place from Sorted Array

//sorted array

//package ARRAY;

public class a4 
{
    public static void main(String[] args) 
    {
        int[] arr = { 1, 1, 2, 2, 3, 3, 3 };
        // int n =arr.length;
        int k = duplicate(arr);
        for (int i = 0; i < k; i++) 
        {
            System.out.print(arr[i]);
        }
    }

    static int duplicate(int[] arr) 
    {

        int i = 0;
        for (int j = 0; j < arr.length; j++) 
        {
            if (arr[i] != arr[j]) 
            {
                i++;
                arr[i] = arr[j];
            }

        }
        return i+1 ;

    }
}

// unsorted array
