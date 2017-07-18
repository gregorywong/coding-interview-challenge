// question 6
// video: https://www.youtube.com/watch?v=20ds5u3XMl0

// language used: Java
// (further adjustments need to be made for the code to run)

public int largestContinguousSequence(int[] nums) {
  int largestSum = 0;
  int currentSum = 0;
  for (int n : nums) {
    currentSum += n;
    if (currentSum < 0) {
      currentSum = 0;
    }
    largestSum = currentSum > largestSum ? currentSum : largestSum;
  }
  return largestSum;
}
