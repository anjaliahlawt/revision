//Problem Statement: Given an integer N return the reverse of the given number.

public class b2 
{ 
    public static void main(String[] args) 
    {
        int n=12345;
        int rev=0;
        int rem;
        while(n>0)
        {
             rem=n%10;
             rev=(rev*10)+rem;
             n=n/10;
        }
        System.out.println(rev);
    }
    
}
