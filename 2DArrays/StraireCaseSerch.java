public class StraireCaseSerch {
    public static void main(String args[])
    {
        int a[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        int c=a.length-1;
        int r=0;
        int key=32;
        while(r<a.length && c>=0)
        {
            if(a[r][c]==key)
            {
                System.out.print("found "+key+" at ("+r+","+c+").");
                break;
            }
            else if(a[r][c]>key)
            {
                c--;
            }

            else
            {
                r++;
            }

        }
    }
}
