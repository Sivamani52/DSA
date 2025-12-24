public class SortedArray {
    public static String Sortedarray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    return "Not sorted";
                }
            }
        }
        return "sorted";
    }

    public static void main(String args[])
    {
        int a[]={1,2,2,4,6,7,8};
        System.out.println("Array is: "+Sortedarray(a));
    }
}
