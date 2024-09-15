//Problem Statement: "Given a string, check if the string is palindrome or not."  A string is said to be palindrome if the reverse of the string is the same as the string.

/* 
public class r7 
{
    public static void main(String[] args)
     {
        String s="anjali";
        int n =s.length();
        boolean ans=print(s,n);
        if(ans==true)
        {
            System.out.println("the string is palindrome");
        }
        else
        {
            System.out.println(" the string not palindrome");
        }
     }
     static boolean print(String s,int n){
        int i=0;int j=n-1;
        while(i<j)
        {
           char l=s.charAt(i),r=s.charAt(j);
           //Character.isLetterOrDigit(l):
          // This is a built-in Java method that checks whether the character l is either a letter (a-z, A-Z) or a digit (0-9).
           if(!Character.isLetterOrDigit(l)) 
           i++;
           else if(!Character.isLetterOrDigit(r))
           j--;
           else if(Character.toLowerCase(l)!=Character.toLowerCase(r))
           return false;
           else
           {
            i++;
            j--;
           }

        }
        return true;
    }
}
*/  

public class r7
{
    public static void main(String[] args) 
    {
        String s="anjali";
        int n=s.length();
        boolean ans=print(s,n,0,n-1);
        if(ans==true)
        {
            System.out.println("ths string is aplindrome");
        }
        else
        {
            System.out.println("ths string is not palindrome");
        }
    }
    static boolean print(String s,int n,int i,int j)
    {
        if(i>=j)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }
        return print(s,n,i+1,j-1);
    }
}