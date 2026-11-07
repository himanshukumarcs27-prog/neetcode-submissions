
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int slow = 0;

        for(int fast = 0; fast < nums.length; fast++) {

            while(fast - slow > k) {
                slow++;
            }

            for(int j = slow; j < fast; j++) {

                if(nums[j] == nums[fast]) {
                    return true;
                }
            }
        }

        return false;
    }
}
