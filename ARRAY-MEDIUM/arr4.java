//Kadane's Algorithm : Maximum Subarray Sum in an Array

//1 approch o(n3)
/* 
public class arr4
 {
    public static void main(String[] args) 
    {
        int[]arr={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {   
            for(int j=i;j<n;j++)
            { int sum=0;
              for(int k=i;k<=j;k++)
              {
                 sum=sum+arr[k];
              }
              max1=Math.max(sum,max1);
            }
            
        }
        System.out.println(max1);
    }
}
*/

//2 approch o(n2)

/* 
public class arr4
{
    public static void main(String[] args) 
    {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+arr[j];
                max1=Math.max(sum,max1);
            }
             
        }
        System.out.println(max1);
    }
}
    */

//3 approch 0(n);

public class arr4 {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        int ans = majortiy(arr, n);
        System.out.println(ans);
    }

    static int majortiy(int[] arr, int n) {
        int max1 = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            sum = sum + arr[i];
            max1 = Math.max(sum, max1);
            if (sum < 0) 
            {
                sum = 0;
            }

        }
        return max1;
    }
}
   