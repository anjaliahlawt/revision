//linear serach

import java.util.Scanner;

public class arr8
{
    public static void main(String[] args) 
    {
        int[]arr=new int[5];
        Scanner in=new Scanner(System.in);
        System.out.println("emter the value of array");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]= in.nextInt();
        }
        int n =arr.length;
        int num;
        System.out.println("enter the value of num");
        num=in.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                System.out.println("index number of numm value :"+i);
            }
        }
    }
}
