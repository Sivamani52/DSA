public class MostFreqcyNum {
     
    public static void main(String args[]) {
        int  a[] = {2,5,2,1,5,1,2,2,5,5,5};
      int count=0;
        int max=0,mostereted=0;

        for(int i=0;i<a.length;i++)
        {
            count=0;
            for(int j=0;j<a.length;j++)
            {
                    
                    if(a[i]==a[j])
                    {
                       count++;
                    }
           }

           if(max<count)
                {
                    max=count;
                    mostereted=a[i];
                }

            }

        System.out.print(mostereted);
        
    }
}

