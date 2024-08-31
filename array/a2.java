//find the second smallest and largest in arrry
//package array;


public class a2 
{
    public static void main(String[] args)
    {
        int []arr={7,7,2,3};
        int n =arr.length;
        
    

        int max1=arr[0];
        int max2=Integer.MIN_VALUE;
         int min1=arr[0];
         int min2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2&&arr[i]!=max1)
            {
                max2=arr[i];
            }
            if(arr[i]<min1)
            {
              min2=min1;
              min1=arr[i];
            }
            else if(arr[i]<min2&&arr[i]!=min1)
            {
                min2=arr[i];
            }
        }
       System.out.println(max1);
       System.out.println(max2);
       System.out.println(min1);
       System.out.println(min2);
    
    }
}
