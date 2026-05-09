class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0 || s.length() == 1){

            return s.length();
        }

        boolean[] freq = new boolean[128];

        int left =0;
        int right = 0;
        int ans = 0;

        int n = s.length();

        while(right < n){

            while (freq[s.charAt(right)] == true){
                freq[s.charAt(left)] = false;
                left ++;
            }

            freq[s.charAt(right)] = true;

            ans = Math.max(ans , right - left +1);

            right++;

        }
        return ans;
    }
}
