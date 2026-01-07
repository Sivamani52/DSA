// public class spiral {
//     public static void main(String args[])
//     {
//         // int a[][]={
//         //     {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
//         // };

//         int a[][]={
//             {1,2,3},{4,5,6},{7,8,9}
//         };

//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=0;j<a[0].length;j++)
//             {
//                 System.out.print(a[i][j]+" ");
//             }
//             System.out.println();
//         }

//         int SR=0,SC=0,ER=a.length-1,EC=a[0].length-1;

//  System.out.println();
//   System.out.println();
//         for(int i=0;i<a.length;i++)
//         {
//             if(SR>ER)
//             {
//                 break;
//             }

//             for(int k=SR;k<ER;k++)
//             {
//                 System.out.print(a[SR][k]+" ");
//             }

//              for(int k=SR;k<EC;k++)
//             {
//                 System.out.print(a[k][EC]+" ");
//             }

//              for(int k=ER;k>SR;k--)
//             {
//                 System.out.print(a[ER][k]+" ");
//             }

//              for(int k=ER;k>SR;k--)
//             {
//                 System.out.print(a[k][SC]+" ");
//             }

//             SR++;
//             ER--;
//             SC++;
//             EC--;


//         }
//     }
// }






public class spiral {
    public static void main(String args[])
    {
        int a[][]={
            {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };

        // int a[][]={
        //     {1,2,3},{4,5,6},{7,8,9}
        // };

            for(int i=0;i<a.length;i++)
            {  
              for(int j=0;j<a[0].length;j++)
                      {
                            System.out.print(a[i][j]+" ");
                      }
                    System.out.println();
              }


        int SR=0,SC=0,ER=a.length-1,EC=a[0].length-1;
        System.out.println();
        System.out.println();

        while(SR<=ER && SC<=EC)
        {

                   for(int k=SR;k<=ER;k++)
                        {
                            System.out.print(a[SR][k]+" ");
                        }

                        for(int k=SR+1;k<=ER;k++)
                        {
                            System.out.print(a[k][EC]+" ");
                        }

                        if(SR<ER)
                        {
                            for(int k=ER-1;k>=SR;k--)
                            {
                                System.out.print(a[ER][k]+" ");
                            }
                        }


                        if(SR<ER)
                        {
                            
                            for(int k=ER-1;k>SR;k--)
                            {
                                System.out.print(a[k][SC]+" ");
                            }
                        }
                        
                        SR++;
                        ER--;
                        SC++;
                        EC--;
        }

    }

}

