public class p6 
{
  public static void main(String[] args) 
  {
     int n =5;
     
     for(int i=1;i<=n;i++)
     { int count=1;
        for(int j=1;j<=n+1-i;j++)
        { 
            System.out.print(count);
            count++;
        }
        System.out.println();
        
     }
  }
}
