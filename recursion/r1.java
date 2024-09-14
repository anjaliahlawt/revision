//Recursive code for printing numbers from 0 to 3 : 

/* 
public class r1
{
   public static void main(String[] args)
   {
     
     sum();
   } 
   static int count=0;
    static void sum()
   { 
     if(count==4)
     return ;
     System.out.println(count);
     count++;
     sum();
   }
}
*/

public class r1
{
    public static void main(String[] args) 
    {
        int count=0;
        print(count);
    }
    static void print(int count)
    {
        if(count==4)
        return;
        System.out.println(count);
        count++;
        print(count);
    }

}