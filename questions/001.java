// question 1
// video: https://www.youtube.com/watch?v=raAJssFm2Js

// language used: Java
// (further adjustments need to be made for the code to run)

Node findIntersection(Node m, Node n){
  int lm = findLength(m);
  int ln = findLength(n);

  // Balance longer list
  Node trimmedLongerList = trimList(lm > ln ? m : n, Math.abs(lm - ln));
  if (lm > ln) {
    m = trimmedLongerList;
  }
  else {
    n = trimmedLongerList;
  }

  while (n != null){
    if (m == n){
      return m;
    }
    m = m.next();
    n = n.next();
  }
  return null;
}

int findLength(Node node){
  int len = 0;
  while (node != null){
    len++;
    node = node.next();
  }
  return len;
}

Node trimmedLongerList(Node node, int trim) {
  for (int i = 0; i < trim; i++) {
    node = node.next();
  }
  return node;
}
