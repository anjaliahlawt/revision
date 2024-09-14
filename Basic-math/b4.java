public class b4 
{
    public static void main(String[] args) 
    {
       int n1=9,n2=12;
       int ans=1;
       for(int i=1;i<=Math.min(n1,n2);i++)
       {
        if(n1%i==0&&n2%i==0)
        {
          ans=i;
        }
       } 
       System.out.println(ans);
    }
}
