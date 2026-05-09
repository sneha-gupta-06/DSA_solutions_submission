class Solution {
    public int findDuplicate(int[] nums) {

       //naive solution
       
        /*Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i<nums.length; i++){

            hm.put(nums[i],hm.getOrDefault(nums[i], 0) + 1);

        }
        
        for (Map.Entry<Integer, Integer> e : hm.entrySet()){
            if (e.getValue() > 1) {
                return e.getKey();
            }
        }
        return -1;*/


        // we can also use the cycle sort method 

        int i = 0;
        int n = nums.length;

        while(i < n){
            int index = nums[i] - 1;

            if (nums[i] != nums[index]){
                swap(nums, i, index);
            }
            else{
                i++;
            }
        }

        for ( i= 0;i<n; i++){
            if (nums[i] != i +1){
                return nums[i];
            }
        }
        return -1;
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
}
