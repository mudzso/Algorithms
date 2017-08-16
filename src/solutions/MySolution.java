package solutions;

public class MySolution {

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

}
