
// Count how may even and odd numbers i an array

public class Count {


    
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};
         int even=0,odd=0;
         
         
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
        }
      

     
        System.out.print("even:"+even+" odd:"+odd);

    }
}
