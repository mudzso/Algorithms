package solutions;

public class MudzsoSolution implements Solution{

    public String reverseString(String word){
        String result = "";
        for (int i = word.length()-1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }

    public long factorialize(int number){
        long sum = 1;
        while (number > 0){
            sum *= number;
            number -= 1;

        }
        return sum;
    }

    public boolean palindrome(String word){
        word = word.toLowerCase().replaceAll("[^a-zA-Z0-9']+","");
        int counter = word.length()-1;
        for (int i = 0; i <word.length()/2 ; i++) {
            if (word.charAt(counter) != word.charAt(i))return false;
            counter -= 1;
        }
        return true;
    }

    public int findLongestWord(String word){
        String[]words = word.split(" ");
        int max = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if(words[i].length() > max)max = words[i].length();
        }
        return max;
    }

    public String titleCase(String word){
        String[]words = word.split("");
        return "";
    }

    @Override
    public int[] largestOfFour(int[][] numbers) {
        return new int[0];
    }

    @Override
    public boolean confirmEnding(String word, String end) {
        return false;
    }

    @Override
    public String repeatStringNumTimes(String word, int counter) {
        return null;
    }

    @Override
    public String truncateString(String word, int counter) {
        return null;
    }

    @Override
    public int[][] chunkArrayInGroups(int[] numbers, int counter) {
        return new int[0][];
    }

    @Override
    public int[] slasher(int[] numbers, int counter) {
        return new int[0];
    }

    @Override
    public int[] destroyer(int[] numbers, int[] remove) {
        return new int[0];
    }

    @Override
    public int getIndexToIns(int[] numbers, float number) {
        return 0;
    }

    @Override
    public String rot13(String word) {
        return null;
    }

}
