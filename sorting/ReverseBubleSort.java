public class ReverseBubleSort {
    public static void main(String args[])
    {
        int a[]={3,6,2,1,8,7,4,5,3,1};

        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length-1;j++)
            {
                     if(a[j]<a[j+1])
                     {
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                     }

            }            
            
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
