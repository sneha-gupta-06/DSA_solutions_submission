class Solution {
    public int trap(int[] height) {

        //O(n2) approach
        int ans = 0;
        int n = height.length;

        for (int i = 1; i < n -1; i++){
            
            int leftMax = height[i];

            for (int j =0; j<i; j++){
                if (height[j] > leftMax){
                    leftMax = height[j];
                }
            }

            int rightMax = height[i];

            for (int  j = i +1; j<n; j++){
                if (height[j] > rightMax){
                    rightMax = height[j];
                }
            }

            ans += Math.min(rightMax, leftMax) - height[i];

        }
        return ans;
        
    }
}
