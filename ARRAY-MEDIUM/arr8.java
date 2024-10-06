//Leaders in an Array o(n)

public class arr8 
{
    public static void main(String[] args)
    {
        int[]arr={4,7,1,0};
        int n=arr.length;
        int index=0;
        int[]arr1=new int[n];
        
        int max=arr[n-1];
        arr1[index]=max;
        index++;
        for(int i=n-2;i>=0;i--)
        {
           if(arr[i]>max)
           {
              max=arr[i];
              arr1[index]=max;
              index++;
           }

        }
     for(int i=index-1;i>=0;i--)
     {
        System.out.print(arr1[i]+" ");
     }
    

    }
}
