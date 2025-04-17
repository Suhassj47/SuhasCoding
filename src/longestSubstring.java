import java.util.HashSet;

public class longestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxLength = Math.max(maxLength, i - left + 1);

        }


        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));  // Output: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));     // Output: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));    // Output: 3
    }
}
