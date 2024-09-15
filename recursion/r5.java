//Factorial of a Number : Iterative and Recursive

/* 
public class r5 
{
    public static void main(String[] args) 
    {
        int n=5;
        int ans=print(n);
        System.out.println(ans);
    }
    static int print(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n*print(n-1);

    }
    
}
*/


public class r5
{
    public static void main(String[] args) 
    {
        int n =5;
        int c= print(n);
        System.out.println(c);
    }
    static int print(int n)
     {   

        int ans=1;
        for(int i=1;i<=n;i++)
        {
           ans=ans*i;
        }
        return ans;
        

        
    }
}