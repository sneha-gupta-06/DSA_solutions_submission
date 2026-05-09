class Solution {
    public boolean isPalindrome(String s) {

        String newString = "";

        for (int i =0; i<s.length(); i++){
            char temp = s.charAt(i);
            int numericCode = (int)temp;

            if ((numericCode >= 48 && numericCode <= 57)||(numericCode >= 65 && numericCode <=90)||(numericCode >=97 && numericCode <=122)){
                newString += temp;
            }
        }

        int i =0;
        int j = newString.length()-1;

        while(i< j){
            if (Character.toLowerCase(newString.charAt(i)) != Character.toLowerCase(newString.charAt(j))){
                return false;
            }
            i++;
            j--;
        }

        return true;
        
    }
}
