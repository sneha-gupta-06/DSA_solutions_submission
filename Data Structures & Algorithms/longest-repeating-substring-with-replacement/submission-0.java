class Solution {
    public int characterReplacement(String s, int k) {

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
        
    }
}
