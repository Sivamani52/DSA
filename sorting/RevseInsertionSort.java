public class RevseInsertionSort {
    public static void main(String args[])
    {
        int a[]={3,6,2,1,8,7,4,5,3,1};
        for(int i=1;i<a.length;i++)
        {
             int cur=a[i];
             int pre=i-1;

             while(pre>=0 && a[pre]<cur)
             {
                a[pre+1]=a[pre];
                pre--;
             }

             a[pre+1]=cur;
        }


        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
