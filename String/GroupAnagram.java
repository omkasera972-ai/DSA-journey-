package String;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {

        String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> result = new ArrayList<>();

        for (String word : arr) {

            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            boolean found = false;

            for (List<String> group : result) {

                char[] first = group.get(0).toCharArray();
                Arrays.sort(first);

                String firstKey = new String(first);

                if (key.equals(firstKey)) {
                    group.add(word);
                    found = true;
                    break;
                }
            }

            if (!found) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(word);
                result.add(newGroup);
            }
        }

        System.out.println(result);
    }
}