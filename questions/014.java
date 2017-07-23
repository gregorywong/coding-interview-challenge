// question 14
// video: https://www.youtube.com/watch?v=nP0FmRJwjN0

// language used: Java
// (further adjustments need to be made for the code to run)

int smallestDiff(int[] A, int[] B) {
  A = Arrays.sort(A);
  B = Arrays.sort(B);

  int minDiff = Integer.MAX_VALUE;

  int newDiff;

  int a_i = 0;
  int b_i = 0;

  while (a_i < A.length && b_i < B.length) {
    newDiff = getDiff(A[a_i], B[b_i]);
    minDiff = minDiff < newDiff ? minDiff : newDiff;
    if (A[a_i] <= B[b_i]) {
      a_i++;
    }
    else if (A[a_i] > B[b_i]) {
      b_i++;
    }
  }

  return minDiff;
}
