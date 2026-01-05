class InsertionSort
{
    public static void main(String args[])
    {
        int a[]={5,4,1,3,2};
        for(int i=1;i<a.length;i++)
        {
           int cur=a[i];
           int pre=i-1;

           while(pre>=0 && a[pre]>cur)
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