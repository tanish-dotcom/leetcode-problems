class MyStack {

    private Queue<Integer> input;
    private Queue<Integer> output;

    public MyStack() {
        input = new LinkedList<>();
        output = new LinkedList<>();
    }
    
    public void push(int x) {
        input.offer(x);
        while(!output.isEmpty()){
            input.offer(output.poll());
        }
        Queue<Integer> temp = output;
        output = input;
        input = temp; 
    }   
    public int pop() {
        return output.poll();
    }
    
    public int top() {
        return output.peek();
    }
    
    public boolean empty() {
        return output.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */