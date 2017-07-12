// question 4
// video: https://www.youtube.com/watch?v=a0o6UpA0-s0

// language used: Java
// (further adjustments need to be made for the code to run)

public class Question4{
    private HashMap<String, Node> map = new ...;
    private int overWriteIndex = 0;

    public String[] SortAnagram(String[] input){
        for(int i = 0; i < input.length; i++){
            // Sort all chars in string
            String sortedS = sortString(input[i]);
            addNodeToHashMap(sortedS, input[i]);
        }

        // Loop through hashmap and repopulate array with correct indexes
        for(KeyValuePair<String, Node> pair : map){
            overWriteArray(input, pair.value);
        }
        return input;
    }

    public Node addNodeToHashMap(String key, String value){
		//...
    }

    public Node overWriteArray(...){
    }
}

/// Feedback
// Dealing with characters in strings - Assume longest string
// Be liberal with abstraction when coding
//
