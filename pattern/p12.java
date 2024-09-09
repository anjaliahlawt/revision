public class p12 
{
    public static void main(String[] args) 
    {
       int n =4;
       int count1=1;
       
       for(int i=1;i<=n;i++)
       {  int count=1;
         for(int j=1;j<=i;j++)
         {
            System.out.print(count);
            count++;
         }
         
        for(int k=1;k<=2*4-2*i;k++)
         {
            System.out.print(" ");
         }
         
         for(int j=i;j>=1;j--)
         {
            System.out.print(j);
            
         }
          System.out.println();
       }
    }
    
}
