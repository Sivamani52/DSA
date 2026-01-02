public class MaxCircularSum {
    public static void main(String args[])
    {
        int a[]={5, -2, 3, 4};
        int Maxsum=Integer.MIN_VALUE;
        int start=0,length=0;
        
        for(int i=0;i<a.length;i++)
        {
            int sum=0;
            for(int j=1;j<=a.length;j++)
            {
                int index=(i+j-1)%a.length;
                sum +=a[index];
               
                if(sum>Maxsum)
                {
                    Maxsum=sum;
                    start=i;
                    length=j;

                }
            }
          
        }

        System.out.print("Max Sum: "+Maxsum);
        System.out.println();
        System.out.println("Max Sum sub arrays is : ");
        for(int i=0;i<length;i++)
        {
            System.out.print(a[(start+i)%a.length]+" ");
        }
    }
}
