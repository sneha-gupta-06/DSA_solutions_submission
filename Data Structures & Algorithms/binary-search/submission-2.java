class Solution {
    public int search(int[] nums, int target) {

        // Iterative approach


       /* int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = (low + high)/2;

            if (nums[mid] == target){
                return mid;
            }
            else if (target >nums[mid]){
                low= mid+1;
            }
            else{
                high= mid-1;
            }
        }

        return -1;*/


        //Recurseive Approach

        return bSearch(nums, target, 0, nums.length-1);
    }

    public int bSearch(int[] arr, int target, int start, int end){

        if (start > end){
            return -1;
        }

        int mid = (start + end) / 2;

        if (arr[mid] == target){
            return mid;
        }
        else if (arr[mid] > target){
            return bSearch(arr, target, 0, mid -1);
        }

        return bSearch(arr,target, mid +1, end);


    }
}
