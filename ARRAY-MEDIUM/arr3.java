

//In this approch 26 case pass but some case is not pass 

/* 
public class arr3 
{
    public static void main(String[] args)
    {
       int []arr={6,5,5};
       int n=arr.length;
       int target=n/2;
       int count=0;
       int i=0;
        
        for(int j=1;j<n;j++)
        {
        if(arr[i]==arr[j])
        {
            count++;
        }
        }
        
       if(count>=target)
       {
          System.out.println(arr[i]);
       }
    }
}
*/

//2 approch o(n2)
/* 
public class arr3
{
    public static void main(String[] args)
     {
        int[]arr={8};
        int n=arr.length;
        int ans=majority(arr, n);
        System.out.println(ans);
     }
     static int majority(int[]arr,int n){
        int target=n/2;
        int count;
        if(n==1)
        {
            return arr[0];
        }
        for(int i=0;i<n-1;i++)
        {   
            count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
        
        if(count>target)
           {
            return arr[i];
           }
    }
    return -1;
}
}
*/

//3 approch using moore voting algorithm.o(n)


public class arr3
{
    public static void main(String[] args) 
    {
        int[]arr={8,8,7,7,7};
        int n=arr.length;
        int ans=majority(arr, n);
        System.out.println(ans);
    }
    static int majority(int[]arr,int n)
    { 
        int count=0;
        int value=0;
       for(int i=0;i<n;i++)
       {
         if(count==0)
         {
            value=arr[i];
         }
         if(arr[i]==value)
         {
           count++;
         }
         else
         {
            count--;
         }
         System.out.println(count);
       }
       System.out.println(count);
       return value;
    }
}