import java.util.*;
public class prb1 {
 
    public static void main(String args[])
    {
        int max=Integer.MIN_VALUE;

        String s="eceba";
        List<Character> list = new ArrayList<>();

        for(int i=0;i<s.length();i++)
        {
             list.add(s.charAt(i));
            int count=0,ind=0,left=0;
            while(!list.contains(s.charAt(i)) && list.size()>2)
            {
                if(list.get(ind)!=s.charAt(i))
                {
                    count++;
                }

                if(count>=2)
                {
                    list.remove(s.charAt(left));
                    left++;
                    count-=1;

                }
                ind++;

            }

            max=Math.max(max,i-left+1);
           





        }

        System.out.print(max);
    }
}
