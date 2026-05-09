class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int right = 0;
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        int sum = 0;

        while (right < n){

            sum += nums[right];

            while (sum >= target){

                 ans = Math.min(ans, right - left +1);
                sum = sum - nums[left];
                left ++;
            }

            right++;

        }

        return (ans == Integer.MAX_VALUE)? 0: ans;
        
    }
}