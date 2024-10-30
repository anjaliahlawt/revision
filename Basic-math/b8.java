//second maximum number
import java.util.*;
public class b8 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
        if(x>=y&&x>=z)
        {
            if(y>=z)
            {
                System.out.println(y);
            }
            else
            {
                System.out.println(z);
            }
        }
        else if(y>=x&&y>=z)
        {
           if(x>=z)
           {
             System.out.println(x);
           }
           else
           {
            System.out.println(z);
           }
        }
        else
        {
            if(y>=x)
            {
             System.out.println(y);
            }
            else
            {
                System.out.println(x);
            }
        }

    }
}
