public class Equilibrium 
{
    public static int EquilibriumIndex(int a[])
    {
        int leftSum[]=new int[a.length],rightSum[]=new int[a.length];
        int n=a.length;

        leftSum[0]=0;
        for(int i=1;i<n;i++)
        {
            leftSum[i]=a[i-1]+leftSum[i-1];
            
        }

        rightSum[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            rightSum[i]=a[i+1]+rightSum[i+1];
        }



        for(int i=0;i<n;i++)
        {
            if(leftSum[i]==rightSum[i])
            {
                return i;
            }
           
        }

     
        return -1;
    }
    public static void main(String args[])
    {
        // int a[] = {3, 6, 9, 12, 15, 18, 21};
        int a[] ={5, 10, 15, 20, 50, 20, 15, 10, 5};
        System.out.print("index: "+EquilibriumIndex(a));


    }
}
