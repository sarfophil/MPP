package lesson9;

import java.util.Arrays;
import java.util.List;

public class prob3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cuc","God","muc");
        prob3 prob3 = new prob3();
        int countWords = prob3.countWords(words,'c','d',3);
        System.out.println(countWords);
    }

    public  int countWords(List<String> words,char c,char d,int len){
        return  (int) words.stream() //
                      .filter(word -> word.length() == len && word.contains("" + c) && !word.contains("" + d)) //
                      .count();
    }
}
