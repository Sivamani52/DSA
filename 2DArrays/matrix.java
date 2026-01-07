import java.util.Scanner;

class matrix
{
   public static boolean search(int a[][],int key)
   {

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==key)
                {
                    System.out.print("key:"+key+" found at: ("+i+","+j+")");
                    return true;
                }
            }
        }

        return false;


   }

    public static void main(String args[])
    {
        int matrix[][]=new int [3][3];

        Scanner sc=new Scanner(System.in);

        int n=matrix.length,m=matrix[0].length;

        System.out.print("enter the matrix values:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
 
        sc.close();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }

        int key=5;
        search(matrix, key);
    }
}

// import java.util.Scanner;

// public class matrix {

//     public static void main(String args[])
//     {
      
//         Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a val:");
//         int n=sc.nextInt();
//         System.out.println("Enter a val is:"+n);
//     }
// }