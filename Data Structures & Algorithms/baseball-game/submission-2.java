class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        int n = operations.length; 

        for (int i =0; i<n; i++){
            if (operations[i].equals("C") && !st.isEmpty()){
                st.pop();
            }
            else if (operations[i].equals("D") && !st.isEmpty()){
                st.push(st.peek() * 2);
            }
            else if (operations[i].equals("+") && st.size() >= 2){
                int a = st.pop();
                int b = st.peek();
                int c = a + b;

                st.push(a);
                st.push(c);
            }
            else {
                st.push(Integer.parseInt(operations[i]));
            }
        }

        int res = 0;

        while (!st.isEmpty()){
            res = res + st.pop();
        }
        
        return res;
    }
}