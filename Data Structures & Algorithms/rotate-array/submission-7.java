class Solution {
    public void rotate(int[] nums, int k) {
        // using auxilary space rotating the array

        /*int n = nums.length;
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
       }*/

       

       /*using reverse algorithm {
       for right rotate array :

       1- roatate all array
       2- rotate d element
       3- rotate remaining element



        for left rotate array :
       
      
       1- rotate d element
       2- rotate remaining element
       3- rotate all elements 
              }

       */

       k = k% nums.length;

        rotation(nums,0, nums.length -1);
        rotation (nums, 0, k -1);
        rotation (nums, k, nums.length -1);

        
    }

    public void rotation(int[] arr, int start, int end){

        int left = start; 
        int right = end;

        while (left < right ){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
    }

  
}