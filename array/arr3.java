//check the array is sorted 

public class arr3 
{
    public static void main(String[] args) 
    {
        int[]arr={1,2,3,4};
        int n =arr.length;
        boolean ans=sorted(arr,n);
         System.out.println(ans);
    }
    static boolean sorted(int[]arr,int n){
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
}
