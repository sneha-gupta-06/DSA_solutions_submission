class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int[] prodPre = new int[n];
        int[] prodSuf = new int[n];

        int[] res = new int[n];

        prodPre[0] = 1;
        prodSuf[n-1] = 1;

        for (int i =1; i<n; i++){
            prodPre[i] = nums[i-1] * prodPre[i-1];
        }

        for (int i = n-2; i >=0; i--){
            prodSuf[i] = nums[i+1] * prodSuf[i+1];
        }

        for (int i =0; i<n; i++){
            res[i]= prodSuf[i] * prodPre[i];
        }

        return res;
    }
}  
