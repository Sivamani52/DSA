// find the heighes max of sum of sub array

public class MaxSubArraySum {
     public static void main(String args[])
    {
        int a[]={2,4,6,8,10};
        int sum=0,max=0;

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<=a.length;j++)
            {
                 int subsum=0;
                 System.out.print("[");
                for(int k=i;k<j;k++)
                {
                       System.out.print(a[k]);
                        sum+=a[k];
                       if(k+1!=j)
                       {
                         System.out.print(",");
                       }
                       subsum+=a[k];
                }
                System.out.print("] ");
                if(subsum>max)
                {
                    max=subsum;
                }
            }
            System.out.println();
        }

         System.out.print("Total sum of Sub arrays: "+sum);
         System.out.println();
         System.out.println("Max sub arrray sum: "+max);
    }
}
