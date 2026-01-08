public class TransposeMatrix {
    public static void main(String args[])
    {

       String arr[][]={
                 {"a11","a12","a13"},
                 {"a21","a22","a23"}
       };

       int n=arr.length,m=arr[0].length;
       String arr1[][]=new String[m][n];

       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {

            arr1[j][i]=arr[i][j];

        }
       }


       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }


        System.out.println();
         System.out.println();

       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            System.out.print(arr1[i][j]+" ");
        }
        System.out.println();
       }













// ------------------Print out the sum of the numbers inthe second row of the “nums” array----------------


        
        //     int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        //    int ind=1;
        //    int sum=0;

        //     for(int i=0;i<nums[0].length;i++)
        //     {
        //             sum+=nums[ind][i];
        //     }
            
        //     System.out.println(sum);





// -----------------------:Print the number of 7’s that are inthe 2d array.---------------------

        //  int[][] arr = { {4,7,8},{8,8,7} };
        //  int key=7,val=0;

        //  for(int i=0;i<arr.length;i++)
        //  {
        //     for(int j=0;j<arr[0].length;j++)
        //     {
        //         if(arr[i][j]==key)
        //         {
        //             val++;
        //         }
        //     }
        //  }

        //  System.out.println(val);
    }
}
