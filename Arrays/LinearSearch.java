public class LinearSearch
{
            public static int linearSrch(int number[],int key)
            {
                for(int i=0;i<=number.length;i++)
                {
                    if(number[i]==key)
                    {
                        return i;
                    }
                }
                return -1;
            }
        

        public static void main(String args[])
        {
            int numbers[]={10,20,30,40,50,60};
            int key=40;

            int index=linearSrch(numbers,key);
            if(index==-1)
            {
                System.out.print("Index not found:");
            }
          else
            {
                System.out.print("Index  found at:"+index);
            }
        }
}