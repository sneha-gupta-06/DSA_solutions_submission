class Solution {
    public int removeDuplicates(int[] nums) {

        int index = 0;

        int ans = 0;
       
        for (int i = 0; i<nums.length; i++){

            if (nums[i] != nums[index]){
                index ++;
                swap(i, index, nums);

                ans ++;
            }
        }   
        return ans+1;
    }

    private void swap(int i ,int j , int[] arr){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

}