// question 19
// video: https://www.youtube.com/watch?v=4TwoIUUry4Q

// language used: Java
// (further adjustments need to be made for the code to run)

// Linked list
/*
Given access to a middle node, delete the node
*/

public void DeleteMiddleNode(Node n){
  n.value = n.next.value;
  n.next = n.next.next;
}

// Linked list exmaple better to have values
