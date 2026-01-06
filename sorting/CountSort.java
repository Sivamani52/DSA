class CountSort
{
    public static void main(String args[])
    {
        int a[]={1,4,1,3,2,4,3,7};

        int lar=Integer.MIN_VALUE;

        // find largest element in array

            for(int i=0;i<a.length;i++)
            {
                lar=Math.max(lar, a[i]);
            }
         
            // count arr is laregst+1 size because arr starts with 0 to last
            int count[]=new int[lar+1];

            // find frequency
            for(int i=0;i<a.length;i++)
            {
                count[a[i]]++;
            }

            // sorting
            int j=0;
            for(int i=0;i<a.length;i++)
            {
                while(count[i]>0)
                {
                    a[j]=i;
                    j++;
                    count[i]--;
                }
            }

            // print values
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
    }
}