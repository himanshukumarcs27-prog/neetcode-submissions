class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
      
      for(int i=0;i<prices.length;i++)
      {
        int greater=0;
        for(int j=i+1;j<prices.length;j++)
        {
            if(prices[j]>greater)
            {
                greater=prices[j];

            }
        }
        if(greater -prices[i] >=0)
        {
           max= Math.max(max,greater -prices[i]);
        }
      }
      return max;

    }
}
