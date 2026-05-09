class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Map.Entry<Integer, Integer>> st = new Stack<>();

        int n = temperatures.length;
        int index = n-1;
        int[] res = new int[n];

        st.push(Map.entry(temperatures[n-1], n-1));

        res[index]= 0;
        index --;

        for (int i = n-2; i>= 0; i--){
            
            while(!st.isEmpty() && st.peek().getKey() <= temperatures[i]){
                st.pop();
            }

            if (st.isEmpty()){
                st.push(Map.entry(temperatures[i], i));
                res[index--] = 0;
            }
            else{
                res[index--] = st.peek().getValue() - i;
                 st.push(Map.entry(temperatures[i], i));
            }
        }
        return res;
    }
}
