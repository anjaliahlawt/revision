import java.util.*;

public class arr7 {
   public static void main(String[] args) {
      int[] arr = new int[5];
      int n=arr.length;
      
      Scanner in=new Scanner(System.in);
      System.out.println("enter the array value");
      for(int i=0;i<n;i++)
      {
         arr[i]=in.nextInt();
      }
      
      for (int i = 0; i < n; i++) {
         for (int j = i + 1; j < n - 1; j++) {
            if (arr[j] == 0) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
         }
      }
      System.out.println(Arrays.toString(arr));
   }
}
