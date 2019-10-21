package lesson9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob5 {
    public static void main(String[] args) {
        System.out.println(streamSection(nextStream(), 1, 6).collect(Collectors.joining(", ")));
        System.out.println(streamSection(nextStream(), 4, 5).collect(Collectors.joining(", ")));
        System.out.println(streamSection(nextStream(), 7, 8).collect(Collectors.joining(", ")));
    }


    public static Stream<String> streamSection(Stream<String> stream,int m,int n){
        return stream.skip(m).limit(n-m+1);
    }

    //support method for the main method -- for testing
    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
                "iii").stream();
    }
}
