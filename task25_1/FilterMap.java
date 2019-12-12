package task25_1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FilterMap {
    public static void main(String[] args) {
        Map<String, String> memberMap1 = derivationMap1();
        isUnique(memberMap1);
        Map<String, String> memberMap2 = derivationMap2();
        isUnique(memberMap2);
    }

    private static Map<String, String> derivationMap1() {
        Map<String, String> memberMap1 = new HashMap<>();
        memberMap1.put("Вася", "Иванов");
        memberMap1.put("Петр", "Петров");
        memberMap1.put("Виктор", "Сидоров");
        memberMap1.put("Сергей", "Савельев");
        memberMap1.put("Вадим", "Викторов");
        return memberMap1;
    }

    private static Map<String, String> derivationMap2() {
        Map<String, String> memberMap2 = new HashMap<>();
        memberMap2.put("Вася", "Иванов");
        memberMap2.put("Петр", "Петров");
        memberMap2.put("Виктор", "Иванов");
        memberMap2.put("Сергей", "Савельев");
        memberMap2.put("Вадим", "Петров");
        return memberMap2;
    }


    public static boolean isUnique(Map<String, String> map) {
        HashMap<String,String> hashMap = new HashMap<>(map);
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            int replay = Collections.frequency(hashMap.values(), entry.getValue());
            if (replay > 1) {
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }
}
