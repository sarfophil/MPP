package lesson9;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.stream.Stream;

public class prob6 {
    public static void main(String[] args) {
        List<Set<String>> list = new ArrayList<>();
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(new String[]{"A", "B"}));
        list.add(set1);

        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(new String[]{"D"}));
        list.add(set2);

        Set<String> set3 = new LinkedHashSet<>(Arrays.asList(new String[]{"1", "2", "3"}));
        list.add(set3);

        System.out.println("input: " + list);

        System.out.println("output:" + union(list));
    }

    public static Set<String> union(List<Set<String>> sets){
        Optional<Set<String>> union = sets.stream().reduce((t, u) -> {
                                            t.addAll(u);
                                            return t;
                                        });
        return union.get();
    }
}
