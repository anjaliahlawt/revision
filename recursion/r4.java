
//Sum of first N Natural Numbers
/* 

public class r4
{
    public static void main(String[] args) 
    {
        int n=5;
        print(n);
    }
    static void print(int n)
    { int sum=0;
       for(int i=1;i<=n;i++)
       {
         sum=sum+i;
       }
       System.out.println(sum);
    }
}
*/

public class r4
{
    public static void main(String[] args) 
    {
        int n =5;
        int c=print(n);
        System.out.println(c);
    }
    static int print(int n)
    {
        if(n==0)
        {
          return 0;
        }
        return n +print(n-1);

    }
}