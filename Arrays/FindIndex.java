// to rotate array based on k index and find target element in that rotated array

public class FindIndex
{
    public static int  FindInd(int a[],int target)
    {
        int b[]=new int[a.length];
        int ind=0,k=3;
        for(int i=k;i<a.length;i++)
        {
            b[ind]=a[i];
            ind++;

        }
        for(int i=0;i<k;i++)
        {
            b[ind]=a[i];
            ind++;

        }

        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");

        }

        for(int i=0;i<b.length;i++)
        {
               ind=0;
               if(b[i]==target)
               {
                ind=i;
                break;
               }
        }
        return ind;


    
    }
    public static void main(String args[])
    {
        int a[]={0,1,2,4,5,6,7};
        int target=4;
        System.out.println();
        System.out.println("index:"+FindInd(a,target));

    }
}