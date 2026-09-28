class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> alreadyPresent = new HashSet<>();

        for (int num : nums) {
            if (alreadyPresent.contains(num)) {
                return true;
            }

            alreadyPresent.add(num);
        }

        return false;
    }
}