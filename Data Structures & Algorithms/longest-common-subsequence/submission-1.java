class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        int[][] memo = new int[m+1][n+1];

        for (int i = 0; i<memo.length; i++){
            Arrays.fill(memo[i], -1);
        }

        return lcs(text1, text2, m, n, memo);
        
    }

    private int lcs(String a, String b, int m, int n, int[][] memo){
        if (m == 0 || n == 0){
            return 0;
        }

        if (memo[m][n] != -1){
            return memo[m][n];
        }

        if (a.charAt(m-1) == b.charAt(n-1)){
            return memo[m][n] = 1 + lcs(a, b, m-1,  n-1,memo) ;
        }

        else {
            return memo[m][n] = Math.max(lcs(a, b, m-1,n, memo), lcs(a,b, m, n-1, memo));
        }
    }
}
