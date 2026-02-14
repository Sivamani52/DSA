// // repeted and missing number

// public class RandMNUM {
//     public static void main(String args[])
//     {
//         int max=0;
//         int a[][]={
//             {9,1,7},{8,9,2},{3,4,6}
//         };

//         //largest 
 
//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=0;j<a[0].length;j++)
//             {
//                       max=Math.max(a[i][j],max);
//             }
           
//         }
//         int AS=0;

//         for(int i=1;i<=max;i++)
//         {
//              AS+=i;
//         }

//         // Secondry sum
//         int ss=0;
//         int arr[]=new int[2];
//          for(int i=0;i<a.length;i++)
//         {
//             for(int j=0;j<a[0].length;j++)
//             {
//                  ss+=a[i][j]; 
//             }
           
//         }

//         int Ts=ss;

//         for(int i=1;i<=max;i++)
//         {
//             for(int j=1;j<=max;j++)
//             {
//                 ss-=i;
//                 ss+=j;

//                 if(ss==AS)
//                 {
//                      arr[0]=i;
//                      arr[1]=j;
//                      break;
//                 }
//                 else{
//                     ss=Ts;
//                 }
//             }
//         }

//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }



//     }
// }



// ----------------simple version-------------
class RandMNUM
{
    public static void main(String args[])
    {
        int a[][]={
            {5,5,7},{8,9,2},{3,4,6}
        };

        int n=a.length*a[0].length;
        int fre[]=new int[n+1];
        int ans[]=new int[2];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                fre[a[i][j]]++;
            }
        }

        for(int i=1;i<=n;i++)
        {
            if(fre[i]==2)
            {
                ans[0]=i;

            }
            if(fre[i]==0)
            {
                ans[1]=i;
            }
        }

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }
}