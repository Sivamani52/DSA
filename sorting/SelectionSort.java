public class SelectionSort 
{

    public static int[] SelectionSort(int a[])
    {

        for(int i=0;i<a.length-1;i++)
        {
            int temp=i;
            for(int j=i+1;j<a.length;j++)
            {
                
                if(a[j]<a[temp])
                {
                    temp=j;
                }
            }

            int val=a[i];
            a[i]=a[temp];
            a[temp]=val;
        }

        return a;

    }
    public static void main(String args[])
    {
        int a[]={5,3,4,1,2};
        int arr[]=SelectionSort(a);

         for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i]+" ");
        }

    }
}
