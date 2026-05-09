class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

       int[] arr = new int[n];

       for (int i = n - k, j =0; i< n; i++, j++ ){
        arr[j]= nums[i];
       }

       for (int i = 0; i< n - k; i++){
        arr[k +i] = nums[i];
       }

       for (int i=0; i<n; i++){
        nums[i] = arr[i];
       }
        
    }

  
}