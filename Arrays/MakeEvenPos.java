// Make Even Positioned Greater

// Array: [2, 1, 3, 5, 4, 6, 7, 8]

// After rearranging:
// 👉 [2, 1, 5, 3, 6, 4, 8, 7]

// Check:

// index 0: 2 > 1 ✅

// index 2: 5 > 3 ✅

// index 4: 6 > 4 ✅


public class MakeEvenPos {
    public static void main(String args[])
    {
        // int a[]={2, 1, 3, 5, 4, 6, 7, 8};
        // int a[]={1, 4, 2, 7, 3, 6};
        int a[]={2, 9, 1, 8, 3, 7, 4, 6};
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            if(i==0 && a[i]<a[i+1])
            {
                  temp=a[i];
                  a[i]=a[i+1];
                  a[i+1]=temp;
            }

            if(i%2==0 && i!=0)
            {
                for(int j=i+1;j>=i-1;j--)
                {
                     if(a[j]>a[i])
                     {
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                     }
                }

            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
