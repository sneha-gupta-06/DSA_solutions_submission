class Solution {
    public int findMin(int[] nums) {

// brute force

    /*int min = nums[0];
        int n = nums.length;

        for (int i =1; i<n; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        return min;
       */

       //using binary search 

       int left = 0;
       int right = nums.length - 1;

       int ans = Integer.MAX_VALUE;

       while (left <= right){

            int mid = (left + right) / 2;

            if (nums[mid] >= nums[left]){ //left half is sorted;

            ans = Math.min(nums[left], ans);
            left = mid +1;

            }

            else{ //right half is sorted

                ans = Math.min(ans,nums[mid]);
                right = mid - 1;
            }

       }

        return ans;
    }
}
