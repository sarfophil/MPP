package lesson9;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob2 {
    public static void main(String[] args) {
        Stream<Integer> myIntStream = Stream.of(20,30,409,40);
        IntSummaryStatistics intSummaryStatistics = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Maximum Value: "+intSummaryStatistics.getMax());
        System.out.println("Minimum Value: "+intSummaryStatistics.getMin());
    }
}
