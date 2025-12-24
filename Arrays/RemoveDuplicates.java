public class RemoveDuplicates {
    public static int[] RemoveDupli(int a[])
    {
        int b[]=new int[a.length];
        int index=0;
        
       
        for(int i=0;i<a.length;i++)
        {

            boolean value=false;
                
                    for(int j=0;j<=index;j++)
                    {
                        if(b[j]==a[i])
                        {
                            value=true;
                            break;
                        }
                    }

                    if(value==false)
                    {
                        b[index]=a[i];
                        index++; 
                    }

                    
        }
           
        int result[]=new int[index];
        for(int i=0;i<index;i++)
        {
            result[i]=b[i];
        }
        return result;
    }
    public static void main (String args[])
    {
         int a[]={1,2,3,2,1,4,5,4,5,6,7,6,7};
         int b[]=RemoveDupli(a);
         for(int i=0;i<b.length;i++)
         {
            System.out.print(b[i]);
         }
    }
}
