class MinStack {

    Stack<Integer> st;
    Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if (st.isEmpty()){
            st.push(val);
            min.push(val);
        }

        else {
            if(val <= min.peek()){
                st.push(val);
                min.push(val);
            }
            else{
                st.push(val);
            }
        }
        
    }
    
    public void pop() {

        if (st.peek().equals(min.peek())){
            st.pop();
            min.pop();
        }
        else{
            st.pop();
        }
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
