package Adapter_design_pattern;

public class Queue {
    protected Stack stack;

    public Queue(int s){
        stack = new Stack(s);
    }

    public boolean isEmpty()    {
        return Stack.isEmpty(stack);
    }


    public void push(int item){
        Stack.push(stack,item);
    }

    public int pop() {
        return Stack.pop(stack);
    }

    public void enque(int i) {
        this.push(i);
    }

    public int deque(){

        Queue q1 = new Queue(15);

        while(!this.isEmpty()) {
            q1.push(this.pop());
        }

        int temp = q1.pop();

        while(!q1.isEmpty()) {
           int x = q1.pop();
          this.push(x);
        }
        return temp;
    }

    public static void main(String[] arg )
    {
        Queue queue = new Queue(15);

        for (int i=0; i < 15; i++) queue.enque(i);

        while (!queue.isEmpty())
              System.out.print(queue.deque()+" ");
    }
}
