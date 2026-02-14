class MergedArray
{
    public static void main(String args[])
    {
        int m=3,n=3;
      
        int num1[]={1,2,3,0,0,0};
        int num2[]={2,5,6};

        int temp=0,x=0,y=0;
        for(int i=0;i<num1.length;i++)

            {
                if(num1[x]==0)
                {
                    num1[x]=num2[y];
                    x++;
                    y++;

                }
                else if(num1[x]<=num2[y])
                {
                    x++;
                }
                
                else{
                    temp=num1[x];
                    num1[x]=num2[y];
                    num2[y]=temp;
                    if(num2[y]==0)
                    {
                        y++;
                    }
                }
                
            }

            for(int i=0;i<num1.length;i++)
            {
                System.out.print(num1[i]+" ");
            }
     
        
    }
}