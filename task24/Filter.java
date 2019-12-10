package task24;

import java.util.LinkedHashSet;
import java.util.Set;

public class Filter {
    public static void main(String[] args) {
        Set<String> words = new LinkedHashSet<>();
        words.add("foo");
        words.add("buzz");
        words.add("bar");
        words.add("fork");
        words.add("bort");
        words.add("spoon");
        words.add("!");
        words.add("dude");
        System.out.println(words);
        removeEvenLength(words);
        System.out.println(removeEvenLength(words));
    }

    private static Set<String> removeEvenLength(Set<String> set) {
        LinkedHashSet<String> pSet = new LinkedHashSet<>(set);
        pSet.removeIf(s -> s.length() % 2 == 0);
        for (String s : pSet) {
        }
        return pSet;
    }
}
