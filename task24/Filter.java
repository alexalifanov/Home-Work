package task24;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Filter {
    public static void main(String[] args) {
        LinkedHashSet<String> wordList = new LinkedHashSet<>();
        wordList.add("папа");
        wordList.add("мама");
        wordList.add("бабушка");
        wordList.add("дедушка");
        System.out.println(wordList);
        evenWordFilter(wordList);
    }

    private static Set<String> evenWordFilter(Set<String> set) {
        set.removeIf(s -> s.length() % 2 == 0);
        for (String s : set) {
            System.out.print(s + " ");
        }
        return set;
    }
}
