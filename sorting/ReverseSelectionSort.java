public class ReverseSelectionSort {
    public static void main(String args[])
    {
        int a[]={3,6,2,1,8,7,4,5,3,1};
        
        for(int i=0;i<a.length-1;i++)
        {
            int MaxPos=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[MaxPos])
                {
                   MaxPos=j;
                }
            }
                int temp=a[i];
                a[i]=a[MaxPos];
                a[MaxPos]=temp;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
