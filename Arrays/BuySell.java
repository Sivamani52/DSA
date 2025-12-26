//  Maxiumum profit

public class BuySell 
{
    public static int Buysell(int stocks[])
    {
        int profit=0,MaxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for(int i=0;i<stocks.length;i++)
        {
            if(buyPrice< stocks[i])
            {
                profit= stocks[i]-buyPrice;
                MaxProfit=Math.max(profit,MaxProfit);
            }
            else
            {
                buyPrice=stocks[i];
            }
        }

       return MaxProfit;
    }

    public static void main(String args[])
    {
        int stocks[]={7,1,5,3,6,4};
        System.out.println("profit: "+Buysell(stocks));

    }
    
}
