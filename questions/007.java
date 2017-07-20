// question 7
// video: https://www.youtube.com/watch?v=ulMsZOIrdMs

// language used: Java
// (further adjustments need to be made for the code to run)

public ArrayList<ArrayList<int>> FindSubsets(ArrayList<int> set){
  // Base case
  if(set.empty()){
    ArrayList<ArrayList<int>> listOfList = new ArrayList<ArrayList<int>>()
    listOfList.append(set);
    return listOfList;
  }

  // Chop off one element and recurse it // LOL = listofList
  ArrayList<ArrayList<int>> returnedLOL = FindSubsets(GetSubArrayWithoutLast(set));
  // Double the list returning int
  returnedLOL = DoubleList(returnedLOL);
  int middleIndex = returnedLOL.length / 2;

  for(int i = middleIndex; i < returnedLOL.length; i++){
    returnedLOL[i].append(set.getLast());
  }

  return returnedLOL;
}

// 1,2,3	// - , 1, 2 , 12, 3 , 13, 23, 123
// 1,2		// - , 1, 2 , 12
// 1		// - , 1
// -

Space O(2^n)
Time O(n * 2^n)

// Recursion tip, List out all case examples and detect pattern
// Top down or bottom up
