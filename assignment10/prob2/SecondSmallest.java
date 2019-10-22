package lesson10.prob2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallest {
    public static void main(String[] args) {
        List<Integer> sampleList = Arrays.asList(10,2,9,40,50,60);
        System.out.println(secondSmallest(sampleList));
    }


    /**
     * Finds second smallest value in a list.
     * @param list
     * @param <T>
     * @return T
     * @throws IndexOutOfBoundsException
     */
    public static <T> T secondSmallest(List<? extends T> list) throws IndexOutOfBoundsException{
            List<T> sort = list.stream().sorted()
                    .collect(Collectors.toList());
            //Values in data arranged in ascending order
            return sort.get(1);

    }
}
