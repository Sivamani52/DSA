public class ReverseArray {
    public static void main(String srgd[])
    {
        int a[]={2,4,6,8,10};
        int b[]=new int[a.length];
        int j=0;

        for(int i=a.length-1;i>=0;i--)
        {
            b[j]=a[i];
            j++;
        }

        for(int i=0;i<b.length;i++)
        {
           
            System.out.print(b[i]+" ");
        }
    }
}
