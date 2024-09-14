//Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

public class b5 
{
    public static void main(String[] args)
     {
        int n=423;
        if (armstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n+ " is not an Armstrong number.");
        }
     }
     //calculate digit
       static int digit(int n)
       {
         int count=0;
         while(n>0)
         {
             n=n/10;
             count=count+1;
         }
         return count;
       }
      
          //calculate power
    static int power(int base, int exp) 
    {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
    static boolean armstrong(int n)
    {
        int rem;
        int d=digit(n);
        int arm=0;
        int c=n;
        while(n>0)
        {
            rem=n%10;
            arm=arm+power(rem,d);
            n=n/10;
        }
        return arm==c;
    }
    
}
