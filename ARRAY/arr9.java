//Union of Two Sorted Arrays

public class arr9
{
    public static void main(String[] args) 
    {
        int[]arr1={2,3,4,5};
        int[]arr2={1,2,3,4};
        int n1=arr1.length;
        int n2=arr2.length;
        union(arr1, arr2, n1, n2);
    }
    static void union(int arr1[],int arr2[],int n1,int n2)
    {
      int i=0,j=0;
      while(i<n1&&j<n2)
      {
        if(arr1[i]<arr2[j])
        {
            System.out.print(arr1[i]);
            i++;
        }
        else if(arr1[i]>arr2[j])
        {
            System.out.print(arr2[j]);
            j++;
        }
        else
        {
            System.out.print(arr1[i]);
            i++;
            j++;
        }
      }
      while(i<n1)
      {
        System.out.print(arr1[i]);
        i++;
      }
      while(j<n2)
      {
        System.out.print(arr2[j]);
        j++;
      }
    }
}
