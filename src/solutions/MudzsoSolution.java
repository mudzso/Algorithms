package solutions;

import java.util.*;

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
        String result = word.substring(word.length()-end.length());
        return result.equals(end);
    }

    @Override
    public String repeatStringNumTimes(String word, int counter) {
        String result="";
        for (int i = 0; i < counter; i++) {
            result += word;
        }
        return result;
    }

    @Override
    public String truncateString(String word, int counter) {
        if (counter > word.length())
            return word;
        return (counter > 3) ? word.substring(0,counter-3)+"..." : word.substring(0,counter)+"...";
    }

    @Override
    public Object[][] chunkArrayInGroups(Object[] numbers, int counter) {

        final int length = numbers.length;
        final Object[][] result = new Object[(length + counter - 1)/counter][];
        int destIndex = 0;
        int stopIndex = 0;

        for (int startIndex = 0; startIndex + counter <= length; startIndex += counter)
        {
            stopIndex += counter;
            result[destIndex++] = Arrays.copyOfRange(numbers, startIndex, stopIndex);
        }

        if (stopIndex < length)
            result[destIndex] = Arrays.copyOfRange(numbers, stopIndex, length);

        return result;
        /*int res = numbers.length % counter;
        int chunks = numbers.length / counter +( res > 0 ? 1 : 0);
        Object [][] result = new Object[chunks][];


        for (int i = 0; i < (res > 0 ? chunks-1:chunks); i++) {
            result[i] = Arrays.copyOfRange(numbers,i*counter,i*(counter*2));
        }
        if (res>0){
            result[chunks-1] = Arrays.copyOfRange(numbers,(chunks-1)*counter,(chunks-1)* counter +res);
        }
        return result;
        */
    }


    @Override
    public Object[] slasher(Object[] numbers, int counter) {
        if (counter>numbers.length)return new Object[0];
        Object[] result = new Object[numbers.length-counter];
        int innercounter = 0;
        for (int i = counter; i < numbers.length; i++) {
            result[innercounter] = numbers[i];
            innercounter++;
        }
        return result;
    }

    @Override
    public Object[] destroyer(Object[] numbers, Object... remove) {
        List<Object>exp = Arrays.asList(remove);
        List<Object> temp= new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!exp.contains(numbers[i])){
                temp.add(numbers[i]);

            }
        }
        return temp.toArray();
    }

    @Override
    public int getIndexToIns(Object[] numbers, float number) {
        Arrays.sort(numbers);

        int result = numbers.length;
        for (int i = 0; i < numbers.length-1; i++) {
            if ((int)numbers[i] == number){
                return i;
            }
            if (number < (int)numbers[i+1]) {
                result = i + 1;
                break;
            }

        }

        return result;
    }


    @Override
    public String rot13(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c:word.toCharArray()) {
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            sb.append(c);
        }

        return sb.toString();
    }

}
