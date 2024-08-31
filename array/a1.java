//package array;

public class a1 
{
    public static void main(String[] args)
     {
        int[]arr={1,21,3,20};
        int n =arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
