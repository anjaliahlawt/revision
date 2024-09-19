//Find Second Smallest and Second Largest Element in an array

public class a2 
{
    public static void main(String[] args) 
    {
        int[] arr = { 0, 2, 3, 0, 9, 0, 7 };
        int n = arr.length;
        int ans1 = smallest(arr, n);
        System.out.println("the second smaleest number in array is" + ans1);
        int ans2 = largest(arr, n);
        System.out.println("the second largest number in array is" + ans2);
    }

    static int smallest(int[] arr, int n) 
    {
        if (n < 2) 
        {
            return -1;
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] < min1)
            {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] != min1)
            {
                min2 = arr[i];
            }
        }
        return min2;
    }

    static int largest(int[] arr, int n) 
    {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MAX_VALUE;
        if (n < 2)
        {
            return -1;
        }
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] > max1)
            {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1)
            {
                max2 = arr[i];
            }
        }
        return max2;
    }
}
