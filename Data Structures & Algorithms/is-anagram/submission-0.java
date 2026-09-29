class Solution {
    public boolean isAnagram(String s, String t) {
        // length of both string don't match, so they're not anagrams
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();

        // Counting frequncies of all characters in string 1
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // reducing frequencies of all characters in string 2
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            // If the character doesn't exist in the map, it's not an anagram
            if (!charCount.containsKey(ch)) {
                return false;
            }
            charCount.put(ch, charCount.get(ch) - 1);

            // removing the key if the count reaches zero
            if (charCount.get(ch) == 0) {
                charCount.remove(ch);
            }
        }

        // If the map is empty, all character counts perfectly matched
        return charCount.isEmpty();
    }
}
