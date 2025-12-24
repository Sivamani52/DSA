public class BinarySearch 
{

    public static int Binarisrch(int a[],int key)
        {
                int start=0,end=a.length-1,mid=(start+end)/2;
                for(int i=0;i<a.length;i++)
                {
                    if(key==a[mid])
                    {
                        return mid;
                    }
                    if(key> a[mid])
                    {
                        start=mid+1;
                        mid=(start+end)/2;
                    }
                    else{
                        end=mid-1;
                          mid=(start+end)/2;
                    }
                }
            return -1;
        }
    public static void main(String args[])
    {
        int a[]={2,4,6,8,10};
        int key=10;

        int index=Binarisrch(a,key);
        if(index==-1)
        {
            System.out.print("not found");
        }
        else{
             System.out.print(" found at :"+index);
        }

        
    }



}
