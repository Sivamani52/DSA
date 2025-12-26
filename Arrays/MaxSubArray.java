// find max sub array sum by Prefix array 
// aray=[3, -4, 5, 4, -1, 7, -8, 2, -3, 6]
// prefix array=[3, -1, 4, 8, 7, 14, 6, 8, 5, 11]     formula:prefixArray[i]=prefixArray[i-1]+a[i];
// method 2: kadanes

public class MaxSubArray
{

    public static void PrefixArray(int a[])
    {
        int prefixArray[]=new int[a.length];
        int max=Integer.MIN_VALUE;


        prefixArray[0]=a[0];
        for(int i=1;i<prefixArray.length;i++)
        {
            
            prefixArray[i]=prefixArray[i-1]+a[i];
        }

        for(int i=0;i<a.length;i++)
        {
            int start=i;
         
             for(int j=start;j<a.length;j++)
             {
                int end=j;
                int currSum=0;

                    if(i==0)
                        {
                            currSum=prefixArray[end];
                        }   
                    else
                    {
                         currSum=prefixArray[end]-prefixArray[start-1];     // subsum=prefix[j]=prefix[i-1];
                    }

                     max = Math.max(max,currSum);

             }
        }

        System.out.println("Prefix_max:"+max);
    }












    // method:2
    public static void kadanes(int a[])
    {
        int max=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<a.length;i++)
        {
            currsum +=a[i];
            if(currsum<0)
            {
                currsum=0;
            }
            max=Math.max(max,currsum);
        }

         System.out.println("kadanes_max:"+max);
        
    }

    public static void main(String args[])
    {
        int a[]={3, -4, 5, 4, -1, 7, -8, 2, -3, 6};

        PrefixArray(a);

        kadanes(a); 
        
    }
}