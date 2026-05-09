class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = maxInArray(piles);

        int ans = Integer.MAX_VALUE;

        while (low <= high){

            int mid = (high + low) / 2;

            int t = timeTaken(piles, mid);

            if (t <= h){
                ans = Math.min(mid, ans);
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            
        }
        return ans;
        
    }

    public int maxInArray(int[] arr){
        int max = arr[0];
        
        for (int i : arr){
            if (i > max){
                max = i;
            }
        }

        return max;
    }

    public int timeTaken(int[] arr, int hour){

        int ans = 0;

        for (int i = 0; i<arr.length; i++){
            ans = ans + (int)Math.ceil((double)arr[i] / hour);

            // or we can use this formula --->   ans += (arr[i] + hour - 1) / hour;
        }
        return ans;
    }
}
