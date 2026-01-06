import java.lang.classfile.constantpool.IntegerEntry;

public class RvseCountSort {
    public static void main(String args[])
    {
        int a[]={3,6,2,1,8,7,4,5,3,1};

        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            largest=Math.max(largest, a[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<a.length;i++)
        {
            count[a[i]]++;
        }

        int j=count.length;

        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                a[j]=i;
                j--;
                count[i]--;
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
