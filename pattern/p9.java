public class p9 
{
    public static void main(String[] args) 
    {
        int n =5;
        for(int i=1;i<=n;i++)
        {
          for(int k=n;k>=i;k--)
          {
            System.out.print(" ");
          }
          for(int j=1;j<=2*i-1;j++)
          {
            System.out.print("*");
          }
          System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<=i;k++)
            { 
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++)
            {
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
