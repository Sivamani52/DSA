import java.util.ArrayList;

public class K_thLargestSubArraySum {
     static class SubArray
    {
        int sum=0;
        int start=0;
        int end=0;

        SubArray(int sum,int start,int end)
        {
           this.sum=sum;
           this.start=start;
           this.end=end;
        }
    }

   public static void main(String args[])
   {
      int arr[]={4, -2, -3, 4, 1};
      int k=5;
      int n=arr.length;

       ArrayList<SubArray> list = new ArrayList<>();

      for(int i=0;i<n;i++)
      {
        int sum=0;

        for(int j=i;j<n;j++)
        {
             sum +=arr[j];
             list.add(new SubArray(sum,i,j));
        }
        
      }

      list.sort((a,b)-> b.sum-a.sum);
      SubArray result=list.get(k-1);
      System.out.println("Max "+k+" th Sum: "+result.sum);

      for(int i=result.start;i<=result.end;i++)
      {
        System.out.print(arr[i]+" ");
      }

   }

}
