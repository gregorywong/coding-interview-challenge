// question 9
// video: https://www.youtube.com/watch?v=qzQgHTRzk_w

// language used: Java
// (further adjustments need to be made for the code to run)

public boolean CheckForBST(Node head){
	return RecursionCheck(head, null, null);
}

private boolean RecursionCheck(Node node, Integer lower, Integer upper){
  if(node == null){
    return true;
	}
	boolean isValid = CheckNode(node, lower, upper);

  boolean isLeftTreeValid = RecursionCheck(node.left, lower, node.value);
	boolean isRightTreeValid = RecursionCheck(node.right, node.value, upper);

	return isValid && isLeftTreeValid && isRightTreeValid;
}

private boolean CheckNode(Node node, Integer lower, Integer upper){
	// Check left first
	boolean lowerCheck = false;
  if(lower != null && node.value > lower)
		lowerCheck = true;
	}
	else if(lower == null){
		lowercheck = true;
	}

	boolean upperCheck = false;
	if(upper != null && node.value < upper)
		upperCheck = true;
	}
	else if(upper == null){
		upperCheck = true;
	}
	return lowerCheck && upperCheck;
}

// 10 valid
// 5 null 10
// ...
// 7 5 10


// Missed duplicates allowed
// Make counter example - sometimes easier
// Inorder traversal
// 4.5
