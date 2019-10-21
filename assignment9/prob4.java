package lesson9;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class prob4 {
    public static void main(String[] args) {
      //  printSquares(4);
      //  lastEven();
        List<Set<String>> list = new ArrayList<>();
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(new String[]{"A", "B"}));
        list.add(set1);

        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(new String[]{"D"}));
        list.add(set2);

        Set<String> set3 = new LinkedHashSet<>(Arrays.asList(new String[]{"1", "2", "3"}));
        list.add(set3);

        System.out.println("input: " + list);

        combinedList(list);
    }

    public static void printSquares(int num){
        IntStream intStream = Stream
                                .iterate(1,(n)->n+1)
                                .mapToInt((n)->n*n)
                                .limit(num);

        intStream.forEach(System.out::println);

    }

    static void combinedList(List<Set<String>> list){
        List<String> processed = list.stream().flatMap(v->{
            return v.stream();
        }).collect(Collectors.toList());

        System.out.println(processed);
    }
}
