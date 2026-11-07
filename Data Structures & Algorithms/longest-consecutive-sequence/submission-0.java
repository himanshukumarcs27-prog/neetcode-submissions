class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int num : nums)
        {
            map.add(num);
        }
        int longest=0;
        for(int num : map)
        {
            if(!map.contains(num-1))
            {
                int count=1;
                int start=num;
                while(map.contains(start+1))
                {
                    count++;
                    start++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
