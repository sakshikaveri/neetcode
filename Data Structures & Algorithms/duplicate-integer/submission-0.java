class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> alreadyPresent = new HashSet<>();
        boolean hasDuplicates = false;

        for (int num : nums) {
            if (!alreadyPresent.add(num)) {
                hasDuplicates = true;
                System.out.println("Duplicate found in array - " + num);
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found!");
        }

        return hasDuplicates;
    }
}