//Print Name N times using Recursion


public class r2 
{
    public static void main(String[] args) 
    {
        int n =5;
        
        printname(n,1);
    }
    static void printname(int n,int i)
    {
        if(i>n)
       return;
       System.out.println("anjali");
       //i++;
       printname(n,i+1);
    }
}
