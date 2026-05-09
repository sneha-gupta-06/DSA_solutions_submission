class Solution {
    public int characterReplacement(String s, int k) {

        /*
        // Brute force approach 

        int len = s.length();

       
        int ans = 0;

        for (int i =0; i<len; i++){
            Map<Character, Integer> hm = new HashMap<>();
            int maxF = 0;

            for (int j = i; j<len; j++){
                
                hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0)+1);
                maxF = Math.max(maxF, hm.get(s.charAt(j)));

                int change = (j - i + 1) - maxF ;

                if (change <= k){
                    ans = Math.max(ans, j- i +1);
                }
                else{
                    break;
                }

            }
        }

        return ans;
        */

        int ans = 0;

        int left = 0;
        int right = 0;

        int maxF = 0;
        int n = s.length();

        HashMap<Character, Integer> hm = new HashMap<>();

        while(right < n){
            hm.put(s.charAt(right), hm.getOrDefault(s.charAt(right),0) + 1);

            maxF = Math.max(maxF , hm.get(s.charAt(right)));

            int change = (right - left +1) - maxF;
            if (change > k){
                hm.put(s.charAt(left),hm.get(s.charAt(left))-1);
                left ++;
            }
            ans = Math.max(ans, right - left +1);
            right ++;
        }
        return ans;


        
    }
}
