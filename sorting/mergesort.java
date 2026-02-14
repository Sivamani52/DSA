public class mergesort
{

    private static void conquir(int arr[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int leftpart=si;
        int rightpart=mid+1;
        int x=0;

        while(leftpart<=mid && rightpart<=ei)
        {
            if(arr[leftpart]<=arr[rightpart])
            {
                temp[x]=arr[leftpart];
                x++;
                leftpart++;

            }
            else
            {
                temp[x]=arr[rightpart];
                x++;
                rightpart++;
            }


           
        }
            while(leftpart<=mid)
            {
                    temp[x++]=arr[leftpart++];
            }
                 while(rightpart<=ei)
                {
                    temp[x++]=arr[rightpart++];
                }
                
        for(int k=0,j=si;k<temp.length;k++,j++)
        {
              arr[j]=temp[k];
        }
    }

    public static void devide(int arr[],int si,int ei)
    {

        if(si>=ei)
        {
            return;
        }

        int mid=si+(ei-si)/2;

        devide(arr, si, mid);
        devide(arr, mid+1,ei);

        conquir(arr,si,mid,ei);
         
    }
    public static void main(String args[])
    {
        int a[]={1,4,5,3,2,1,8};
        int n=a.length-1;

        devide(a,0,n-1);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}
