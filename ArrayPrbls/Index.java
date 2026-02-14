public class Index {

    public static int findindex(int a[],int target)
    {
        int val=0,min=Integer.MAX_VALUE,left=0;
        long slw=0;

        for(int i=0;i<a.length;i++)
        {
            slw+=a[i];
            val++;
            if(slw>=target)
            {
                min=Math.min(min,val);
                val=val-1;
                slw=slw-a[left];
                left++;
            }

            if(left>0 && slw>=target)
            {
                for(int j=left;j<=i;j++)
                {
                    if(slw<target)
                    {
                        break;
                    }
                    else{
                            min=Math.min(min,val);
                            val=val-1;
                            slw=slw-a[left];
                            left++;
                        }
                }
            }
        }

        return min;
    }
    public static void main(String args[])
    {
        int a[]={1,4,4};
        int target=4;

        System.out.print(findindex(a,target));
    }
}
