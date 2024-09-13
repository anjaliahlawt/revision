//Problem Statement: Given an integer N, return the number of digits in N.

public class b1 
{
   public static void main(String[] args) 
   {
     int n =45678;
    int ans=digit(n);
    System.out.println(ans);
   } 
   static int digit(int n)
   {
     int count=0;
     while(n>0)
     {
        count++;
        n=n/10;
     }
     return count;
   }
     
}
