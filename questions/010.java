// question 10
// video: https://www.youtube.com/watch?v=kSZGa7hTfaE

// language used: Java
// (further adjustments need to be made for the code to run)

String convertChunk(int threeDigits){...}

String convertNumber(int num) { // 0 - 999,9999,999
  if (num == 0){
    return "zero";
  }

  int group1 = num / 1000000
  int group2 = num % 1000000 / 1000;
  int group3 = num % 1000;

  StringBuilder str = new StringBuilder();

  if (group1 > 0) {
    str.append(convertChunk(group1));
    str.append(" million ");
  }
  if (group2 > 0) {
    str.append(convertChunk(group2));
    str.append(" thousand ");
  }
  if (group3 > 0) {
    str.append(convertChunk(group3));
  }

  return str.toString();
}
