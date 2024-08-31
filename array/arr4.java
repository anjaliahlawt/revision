//remove duplicate in  sorted array 
//package array;

public class arr4 
{
    public static void main(String[] args) 
    {
        int []arr={1,2,2,3,4};
        
      int ans = duplicate(arr);
        for(int k=0;k<ans;k++)
        {
            System.out.println(arr[k]);
        }
    }
   public static int duplicate(int[]arr)
    { int n =arr.length;
        int i=0;
        for(int j=1;j<n;j++)
            {
               if(arr[i]!=arr[j])
               {
                 
                 arr[i+1]=arr[j];
                 i++;
               }
            }
            return i+1;
            
    }
    }

