//Find the Largest element in an array
package ARRAY;
public class a1 
{
    public static void main(String[] args) 
    {
        int []arr={8,10,5,7,9};
        int n =arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=max)
            {
               max=arr[i];
            }
        }
        System.out.println("the largest elemnet is"+ max);
    }
}
