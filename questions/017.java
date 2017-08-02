// question 17
// video: https://www.youtube.com/watch?v=AmfKK_m-NcM

// language used: Java
// (further adjustments need to be made for the code to run)

void findPermutations(StringBuilder str, StringBuilder remainingDigits) {

  char[] chars = getCorrespondingLetters(remainingDigits.charAt(0));

  ArrayList<StringBuilder> prefixes = new ArrayList<StringBuilder>();

  for (char c : chars) {
    StringBuilder s = makeCopy(str);
    s.add(c);
    prefixes.add(s);
  }

  if (remainingDigits.length() <= 1) {
    for (StringBuilder prefix : prefixes) {
      System.out.println(prefix.toString());
    }
  }
  else {
    for (StringBuilder prefix : prefixes) {
      findPermutations(prefix, removeFirst(remainingDigits));
    }
  }
}

findPermutations(new StringBuilder(), new StringBuilder("3204562"));
