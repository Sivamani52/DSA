public class TrappedWater {
    public static int TrappedWaterCount(int heigth[])
    {
        int n=heigth.length;
        
        // find left max boundary
        int leftMax[]=new int[n];
        leftMax[0]=heigth[0];
        for(int i=1;i<n;i++)
        {
               leftMax[i]=Math.max(heigth[i],leftMax[i-1]);
        }

        // find right max boundary

        int rigthMax[]=new int[n];
        rigthMax[n-1]=heigth[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rigthMax[i]=Math.max(heigth[i],rigthMax[i+1]);
        }

        // find waterlevel

        int waterlevel[]=new int[n];
        for(int i=0;i<n;i++)
        {
            waterlevel[i]=Math.min(leftMax[i],rigthMax[i]);
        }
    // find trapped water
       int TrappedWater=0;
       for(int i=0;i<n;i++)
       {
           TrappedWater +=waterlevel[i]-heigth[i];
       }

       return TrappedWater;

    }
    public static void main(String args[])
    {
        int heigth[]={4,2,0,6,3,2,5};

        int trappedwater=TrappedWaterCount(heigth);
        System.out.println("Trappedwater: "+trappedwater);
    }
}
