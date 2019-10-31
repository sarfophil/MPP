import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class Scratch {
    public static void main(String[] args) {
        LinkedList<Set<String>> linkedList = new LinkedList<>();
        linkedList.add(Collections.singleton("a"));linkedList.add(Collections.singleton("b"));linkedList.add(Collections.singleton("t"));linkedList.add(Collections.singleton("p"));
        powerSet(linkedList);
    }

    static LinkedList<Set<String>> powerSet(LinkedList<Set<String>> X){
        LinkedList<Set<String>> P = new LinkedList<>();
        Set<String> S = new HashSet<>();
        P.add(S);
        Set<String> T = new HashSet<>();
        while (!X.isEmpty()){
            Set<String> f = X.removeFirst();
            for (Set<String> x : X){
                T = Collections.singleton(x + "," + f);
                P.add(T);
            }
        }
        System.out.println(P.toString());
        return P;
    }
}