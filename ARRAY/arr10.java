//Find the missing number in an array

public class arr10 
{
    public static void main(String[] args) 
    {
        int[]arr={1,3,4,5};
        int n=arr.length;
        int ans=missing(arr,n);
        System.out.println(ans);
        
    }
    static int missing(int[]arr,int n){
        
        for(int i=1;i<=n;i++)
        { int flag=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==i)
                {
                    flag=1;
                    break;
                }
                if(flag==0)
                {
                  return i;
                }
            }
     
        }
        return -1;
    }
}
