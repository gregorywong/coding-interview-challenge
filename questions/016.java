// question 16
// video: https://www.youtube.com/watch?v=MV2QDevFJ8k

// language used: Java
// (further adjustments need to be made for the code to run)

public static class MyQueue<T> {
  Stack<T> stack1 = new Stack<T>();
  Stack<T> stack2 = new Stack<T>();

  public void enqueue(T value) { // Push onto newest stack
    stack1.add(value);
  }

  public T peek() {
    moveToStack2();
    return stack2.isEmpty() ? null : stack2.peek();
  }

  public T dequeue() {
    moveToStack2();
    return stack2.isEmpty() ? null : stack2.pop();
  }

  private void moveToStack2(){
    if(stack2.isEmpty()){
      while(!stack1.isEmpty()){
        stack2.add(stack1.pop());
      }
    }
  }
}
