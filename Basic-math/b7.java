public class b7 
{
    public static void main(String[] args)
    {
        int n =10;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count=count+1;
            }
        }
        if(count==2)
        {
            System.out.println("is a prime number"+n);
        }
        else
        {
            System.out.println("is not a prime number"+n);
        }
    }
}
