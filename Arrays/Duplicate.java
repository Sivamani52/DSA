// 1. Duplicate within K Distance

// Array: [10, 5, 3, 4, 3, 6, 7]
// k = 3

// 3 appears at index 2 and 4

// Distance = 4 − 2 = 2 ≤ 3

// ✅ Duplicate exists within K distance



public class Duplicate
{
    public static void main(String args[])
    {
        int a[]={10,5,3,4,3,6,7};
        int k=3,ind=0,val=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j] & (j-i<=k))
                { 
                    ind=i;
                    val=j;
                    System.out.print("yes.."+a[i]+" is in "+i+" "+j+" positions");
                    break;
                    
                }
            }

        }


    }
}