package solutions;

public interface Solution {
    String reverseString(String word);
    long factorialize(int number);
    boolean palindrome(String word);
    int findLongestWord(String word);
    String titleCase(String word);
    int[] largestOfFour(int[][] numbers);
    boolean confirmEnding(String word,String end);
    String repeatStringNumTimes(String word,int counter);
    String truncateString(String word,int counter);
    int[][] chunkArrayInGroups(int[] numbers,int counter);
    int[] slasher(int[] numbers,int counter);
    int[] destroyer(int[] numbers,int[] remove);
    int getIndexToIns(int[] numbers,float number);
    String rot13(String word);
}
