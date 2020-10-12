package week2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Day5_BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length())
            return false;
        if (A.equals(B)) {
            HashSet<Character> set = new HashSet();
            for (char c : A.toCharArray()) {
                set.add(c);
            }
            return set.size() < B.length();
        }

        List<Integer> diff = new ArrayList();
        for (int i=0; i<A.length(); i++) {
            if (A.charAt(i) != B.charAt(i))
                diff.add(i);
        }
        if (diff.size() == 2 && A.charAt(diff.get(0)) == B.charAt(diff.get(1))
                && A.charAt(diff.get(1)) == B.charAt(diff.get(0)))
            return true;
        else return false;
    }
}
