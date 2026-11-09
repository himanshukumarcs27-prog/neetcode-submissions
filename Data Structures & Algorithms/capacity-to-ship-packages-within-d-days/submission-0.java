class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight :weights)
        {
            low=Math.max(low,weight);
            high+=weight;
        }
        while(low<=high)
        {
            int day=1;
            int currweight=0;
            int mid=low+(high-low)/2;
            for(int weight :weights)
            {
                if(currweight+weight <= mid)
                {
                    currweight+=weight;
                }
                else{
                    day++;
                    currweight=weight;
                }
            }
            if(day<=days)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}