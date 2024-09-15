//Print Fibonacci Series up to Nth term
/* 
public class r8 
{
    public static void main(String[] args) 
    {
        int n=5;
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++)
        {
           System.out.print(a);
           int c=a+b;
           a=b;
           b=c;
           
        
    }
}
}
*/
/* 
public class r8
{
    public static void main(String[] args) 
    {
        int n=5;
        if(n==0)
        {
            System.out.print(0);
        } 
        int a=0;
        int b=1;
        System.out.print(a+""+b);
        int c;
        for(int i=2;i<=n;i++)
        {
          c=a+b;
          a=b;
          b=c;
          System.out.print(c);
        }
    }
}
    */

    public class r8
    {
        public static void main(String[] args)
         {
            int n=5;
            print(n);
            for(int i=0;i<=n;i++)
            {
                System.out.print(print(i));
            }
        }
        static int print(int n)
        {
            if(n<=1)
            {
                return n;
            }
            return print(n-1)+print(n-2);
        }
    }