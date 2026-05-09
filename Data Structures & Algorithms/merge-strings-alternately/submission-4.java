class Solution {
    public String mergeAlternately(String word1, String word2) {
        
       /* String ans ="";

        int i =0, j=0;

        while(i< word1.length() && j < word2.length()){
            ans = ans+word1.charAt(i);
            ans = ans + word2.charAt(j);
            i++;
            j++;
        }

        if (i < word1.length()){
            ans = ans + word1.substring(i);
        }

        if (j < word2.length()){
            ans = ans + word2.substring(j);
        }
        return ans;
        */

        //approach 2

        /*
        
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()){

            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));


        }

        if (i < word1.length()){
            sb.append(word1.substring(i));
           
        }

          if (j < word2.length()){
            sb.append(word2.substring(i));
           
        }

        return sb.toString();


        */

          StringBuilder result = new StringBuilder();
        int n = Math.max(word1.length(), word2.length());

        for (int i = 0; i < n; i++) {
            if (i < word1.length()) result.append(word1.charAt(i));
            if (i < word2.length()) result.append(word2.charAt(i));
        }

        return result.toString();
    }
}