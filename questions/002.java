// question 2
// video: https://www.youtube.com/watch?v=TxzNHQl_itE

// language used: Java
// (further adjustments need to be made for the code to run)

public class calculatePermutation(){
  	public HashMap<Integer, Integer>() workDoneHash = new ...

    public int permutations(int n){
        // Sanitize inputs
        if(n < 1 || n > INT.max){
            //throw exception;
        }
        // Base case
      	else if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        else if(n == 3){
            return 4;
        }
        else if(workDoneHash.hasKey(new Integer(n)){
        	return workDoneHash.get(new Integer(n));
        }
        else{
          	// sum up all the values and store
          	int sum = permutation(n-1) + permutation(n-2) + permutation(n-3);
          	workDoneHash.add(new Integer(n), new Integer(sum));
            return(sum);
        }
    }
}

// As is without optimizing
// t: O(3^n)
// s: O(n)

// Allocate memory to remember work done, Hashmap
// t: O(n)
// s: O(n)

/// Feedback
// can use array to store instead of hashmap
// value will overflow when n = 37
// debug algorithm before jumping into to code
// start with basic pseudocode first before coding
// analyze runtimes faster
//
