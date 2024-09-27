//Find the number that appears once, and the other numbers twice

public class arr12
 {
    public static void main(String[] args) 
    {
        int[]arr={2,2,1,1,3,4};
        int n=arr.length;
         int ans=count(arr, n);
         System.out.println(ans);
    }
    static int count(int[]arr,int n){
        for(int i=0;i<n;i++)
        { int count=0;
            int num=arr[i];
            for(int j=0;j<n;j++)
            {
                if(arr[j]==num)
                {
                    count++;
                }
            }
            if(count==1)
            {
                return num;
            }
           }
           return -1;
          
        }
    }

