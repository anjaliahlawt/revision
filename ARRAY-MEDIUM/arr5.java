//Stock Buy And Sell

// 1 approch o(n2)
/* 
public class arr5
{
    public static void main(String[] args) 
    {
        int[]arr={7,6,4,3,1};
        int n=arr.length;
        int ans=stock(arr, n);
        System.out.println(ans);
    }
    static int stock(int[]arr,int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    max=Math.max(arr[j]-arr[i],max);
                }
            }
        }
        return max;

    }
    
}
    */


//2 approch o(n)

public class arr5
{
    public static void main(String[] args) 
    {
        int[]arr={7,6,4,3,1};
        int n =arr.length;
        int ans=stock(arr, n);
        System.out.println(ans);
    }
    static int stock(int[]arr,int n)
    {
        int min=arr[0];
        int max=0;
        for(int i=1;i<n;i++)
        {
            int cost=arr[i]-min;
            max=Math.max(max,cost);
            min=Math.min(min,arr[i]);
        }
        return max;
    }
}