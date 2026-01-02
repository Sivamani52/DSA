// 9. Sorted Subsequence of Size 3

// Problem: Find a subsequence a < b < c in sorted order of indices.
// Idea: Track minimum on left and maximum on right.

public class SortedSubsequence {
    
    public static int[] SortedSubSequence(int a[])
    {
        int b[]=new int[3];

        for(int i=0;i<a.length-2;i++)
        {
              for(int j=i+1;j<a.length-1;j++)
              {
                if (a[i]<a[j])
                {
                    for(int k=j+1;k<a.length;k++)
                    {
                       if(a[j]<a[k])
                       {
                         b[0]=a[i];
                        b[1]=a[j];
                         b[2]=a[k];
                         return b;
                       }
                    }
                }
              }
        }
        return b;
    }
    public static void main(String args[])
    {
        // int a[]={3, 7, 1, 2, 8};
        int a[]={5, 1, 4, 2, 3};

        int b[]=SortedSubSequence(a);
        System.out.print("Sorted subsequence of 3: "+b[0]+"<"+b[1]+"<"+b[2]);
    }
}
