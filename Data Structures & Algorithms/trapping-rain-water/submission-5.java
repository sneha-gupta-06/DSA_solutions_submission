class Solution {
    public int trap(int[] height) {

        //O(n2) approach
       /* int ans = 0;
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
        */


        //prefix and suffix max array using 

       /* int n = height.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

         prefix[0]= height[0];
        int high = height[0];

        for (int i = 1; i<n; i++){
            prefix[i] = Math.max(height[i], high);
            high = Math.max(high, height[i]);
        }

        high = height[n-1];
        suffix[n-1]= height[n-1];

        for ( int i = n-2; i>=0; i--){
            suffix[i] =  Math.max(height[i], high);
            high = Math.max(high, height[i]);
        }

        int ans = 0;
        for (int i =0; i<n; i++){
            ans += Math.min(prefix[i], suffix[i]) - height[i];

        }
        return ans;
        */


        // two pointer approach

        int n = height.length;

        int lMax = height[0];
        int rMax = height[n-1];

        int left = 1;
        int right = n - 2;

        int ans = 0;

        while (left <= right){

            if (lMax <= rMax){ // here we gonna calculate for leftMax

                ans += Math.max(0,lMax - height[left]);
                lMax = Math.max(height[left], lMax);
                left ++;
            }
            else{

                ans += Math.max(0, rMax - height[right]);
                rMax = Math.max(rMax, height[right]);
                right--;

            }
        }
        return ans;
    }
}
