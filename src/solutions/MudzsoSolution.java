package solutions;

import java.util.Arrays;

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
        String[]words = word.toLowerCase().split(" ");
        String result = "";
        for (int i = 0; i<words.length;i++) {
            String chars = words[i];
            String resultWord="";
            for (int j = 0; j < chars.length() ; j++) {
                if (j==0){
                    resultWord+=Character.toUpperCase(chars.charAt(0));
                    continue;
                }
                resultWord+=chars.charAt(j);
            }
            if (i< words.length-1){
            result += resultWord+ " ";
            continue;}
            result += resultWord;

        }
        return result;
    }

    @Override
    public int[] largestOfFour(int[][] numbers) {
        int[]result= new int[4];
        for (int i = 0; i < numbers.length; i++) {
            int[]inerNumbers = numbers[i];
            int max = inerNumbers[0];
            for (int j = 1; j < inerNumbers.length; j++) {
                if (inerNumbers[j]>max)max = inerNumbers[j];
            }
            result[i] = max;
        }
        return result;
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
    public Object[][] chunkArrayInGroups(Object[] numbers, int counter) {
        return new Object[0][];
    }

    @Override
    public Object[] slasher(Object[] numbers, int counter) {
        return new Object[0];
    }

    @Override
    public Object[] destroyer(Object[] numbers, Object... remove) {
        return new Object[0];
    }

    @Override
    public int getIndexToIns(Object[] numbers, float number) {
        return 0;
    }


    @Override
    public String rot13(String word) {
        return null;
    }

}
