//Problem Statement: Given an integer N, return true if it is a palindrome else return false
/* 
public class b3
{
    public static void main(String[] args) 
    {
        int n=4554;
        int rem;
        int rev=0;
        int c=n;
        while(n>0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(c==rev)
        {
            System.out.println("palindrome number");
        }
        else
        {
            System.out.println("not a palindroiome");
        }
    }
}
*/
public class b3
{
    public static void main(String[] args) 
    {
        int n=5674;
        boolean ans=palindrome(n);
        System.out.println(ans);
    }
    static boolean palindrome(int n)
    {
        int rev=0;
        int rem;
        int c=n;
        while(n>0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(c==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}