import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        Set<Character> assigned = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if (map.containsKey(ss) && map.get(ss) != tt) {
                return false;
            }
            if (!map.containsKey(ss) && assigned.contains(tt)) {
                return false;
            }

            map.put(ss, tt);
            assigned.add(tt);

        }
        return true;
    }
}