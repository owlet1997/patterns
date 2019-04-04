package Adapter_design_pattern;

public class Stack {
    int[] array;
    int sp;
    int size;

    public Stack() {
    }

    public Stack(int s)
    {
        this.array = new int[s];
        this.size = s;
        this.sp = 0;
    }

    public static boolean isEmpty(Stack stack)    {
        return stack.sp == 0;
    }

    public static boolean isFull(Stack stack)     {

        return stack.sp == stack.size;
    }

    public static void push(Stack stack, int item){
        if (!isFull(stack)) {
           stack.array[stack.sp++]=item;
        }
        else System.out.println("error");
    }

    public static int pop(Stack stack) {

        if (isEmpty(stack)) return 0;
        else return stack.array[--stack.sp];

    }
}
