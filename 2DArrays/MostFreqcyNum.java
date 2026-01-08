public class MostFreqcyNum {
     
    public static void main(String args[]) {
        int  a[] = {2,5,2,1,5,1,2,2,5,5,5};
        int val=0,ind=0;
        int max=0,index=0;

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                        if(i==j)
                    {
                        continue;
                    }
                    if(a[j]==a[i])
                    {
                        val++;
                    ind=a[i];
                    }
           }

           if(max<val)
                {
                    max=val;
                    index=a[i];
                }
            val=0;

            }

        System.out.print(index);
        
    }
}

