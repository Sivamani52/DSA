// Second largest element in an array....

public class SecondLargest {
 
    public static int secondlarge(int a[])
    {
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                second=max;
                max=a[i];
            }
            
            if(a[i]>second & a[i]!=max )
            {
                second=a[i];
            }
        }

        return second;
       

    }
    public static void main(String args[])
    {
        int a[]={10,20,30,20,60,90,20,100};
        System.out.print("Second largest element: "+secondlarge(a));
    }
}
