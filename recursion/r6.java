//Problem Statement: You are given an array. The task is to reverse the array and print it. 
/* 
import java.util.*;
public class r6
 {
    public static void main(String[] args) 
    {
        int n=5;
        int arr[]={5,4,3,2,1};
        print(n,arr);
    }
    static void print(int n,int arr[])
    {   int i=0;
        int j=n-1;
        while(i<j)
        {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;

        }
        System.out.print(Arrays.toString(arr));
       
    }
    
}
*/
/* 
import java.util.*;
public class r6
{
    public static void main(String[] args) 
    {
        int n =5;
        int[]arr={5,4,3,2,1};
        print(n,arr);
    }
    static void print(int n,int arr[])
    {
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            ans[n-i-1]=arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
    */

    
    import java.util.*;
    public class r6
    {
        public static void main(String[] args) 
        {
            int n =5;
            int arr[]={5,4,3,2,1};
           
            print(arr,n,0,n-1);
            System.out.println(Arrays.toString(arr));
            
        }
        static void print(int arr[],int n,int i,int j)
        {
           if(i>=j)
           return;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

           print(arr,n,i+1,j-1);
        }
    }
        
        // import java.util.*;
        // public class r6
        // {
        //     public static void main(String[] args) 
        //     {
        //         int n=5;
        //         int arr[]={5,4,3,2,1};
        //         print(arr,n,0);
        //         System.out.println(Arrays.toString(arr));

        //     }
        //      static void print(int[]arr,int n,int i)
        //      {
        //         if(i>=n/2)
        //         return;
        //         int temp=arr[i];
        //         arr[i]=arr[n-i-1];
        //         arr[n-i-1]=temp;
        //         print(arr,n,i+1);
        //      }

        // }