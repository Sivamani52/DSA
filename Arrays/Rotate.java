// Roate by k-position

public class Rotate {
    
    public static int[] Roatearray(int a[],int key)
    {
        int index=0,ind=0;
        int b[]=new int[a.length];
        
        for(int i=0;i<a.length;i++)
        {
           if(key==a[i])
           {
              index=i;
              break;
           }

        }

        for(int i=a.length-1;i>=index;i--)
        {
            b[ind]=a[i];
            ind++;      
        }

        for(int i=0;i<index;i++)
        {
            b[ind]=a[i];
            ind++;
        }

        return b;


    }
    public static void main(String args[])
    {
           int a[]={1,2,3,4,5};
           int key=3;
           int b[]=Roatearray(a, key);
          for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
                
        }

    }
}
