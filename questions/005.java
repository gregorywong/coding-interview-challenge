// question 5
// video: https://www.youtube.com/watch?v=80iCJEj6jWs

// language used: Java
// (further adjustments need to be made for the code to run)

public class StackWithMin(){
  Stack normalStack = new Stack();
  Stack minStack = new Stack();

  public void Push(int i){
    normalStack.push(i);
    if(minStack.empty() || i <= minStack.peek()){
    	minStack.push(i);
    }
  }

  public int Pop(){
    int poppedInt = normalStack.pop();
    if(minStack.peek() == poppedInt){
    	minStack.pop();
    }
    return poppedInt;
  }

  public int Min(){
    return minStack.peek();
  }
}

/// Feedback ///
// Define the question better
// Say that you're assuming something
// Assume ints, unique, empty
