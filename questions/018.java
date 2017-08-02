// question 18
// video: https://www.youtube.com/watch?v=Qk1GR_xv4WE

// language used: Java
// (further adjustments need to be made for the code to run)

public boolean hasSequenceSum(int[] input, int target){
  int startIndex = 0;
  int endIndex = 0;
  int currentSum = 0;

  if(target == 0){
    for(int i : input){
      if(i == 0){
        return true;
      }
    }
  }

  while(endIndex < input.length && startIndex < input.length){
    // current sum is less than target
    else if(currentSum < target){
      currentSum += input[endIndex];
      endIndex++;
    }
    // current sum is greater than target
    else if(currentSum > target){
      currentSum -= input[startIndex];
      startIndex++;
      if(endIndex < startIndex){
        endIndex = startIndex;
      }
    }

    // current sum is target, return true
    if(currentSum == target){
      return true;
    }
  }
  return false;
}

// input 2 6 3 7 5 1 99 => 100
// input length 7
// startIndex 4
// endIndex   6
// currentSum 100

// Feedback
// Think about starting with first element !!!! messing up while increments
// While loop increment in beginning or end
