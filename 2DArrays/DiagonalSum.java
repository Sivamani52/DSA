class DiagonalSum {
    public static void main(String arg[])
    {
        //  int a[][]={
        //     {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        // };

        int a[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };

        
        int PS=0,SS=0,j=0;

    for(int i=0;i<a.length;i++)
    {
        PS+=a[i][i];

        j=a.length-1-i;

        if(i!=j)
        {
            SS+=a[i][j];

        }

    }

    System.out.print("PS:"+PS+" SS: "+SS+" sum: "+(PS+SS));

    }
}
