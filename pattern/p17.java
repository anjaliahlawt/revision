public class p17 
{
    public static void main(String[] args) 
    {
        int n =5;
        
        for(int i=0;i<n;i++)
        {  
            for(int k=0;k<n-i-1;k++)
            {
               System.out.print(" ");
            }
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print(j);
               System.out.print(ch);
               if(j<=breakpoint)
               {
                ch++;
               }
               else
               {
                ch--;
               }
               
            }
            
            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            System.out.println();
            
            
        }
        
    }
    
}
