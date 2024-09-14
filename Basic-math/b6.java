//Problem Statement: Given an integer N, return all divisors of N.
public class b6
{
 public static void main(String[] args) 
 {
    int n =36;
    System.out.print("divisors of 36 is :");
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            System.out.print(i+" ");
        }
    }
 }
}





/*import java.util.*;
public class p6 
{
    public static void main(String[] args)
    {
        int n=36;
        int[]divisor=new int[n];
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                divisor[count++]=i;
            }
          
        }
        int[] result = Arrays.copyOf(divisor, count); 
        System.out.println(Arrays.toString(result));
    }
}
*/