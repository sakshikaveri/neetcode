class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int tobeFound = target - nums[i];

            if (numToIndex.containsKey(tobeFound)) {
                return new int[] {numToIndex.get(tobeFound), i};
                // resultArray.get(tobeFound) was inserted earlier in the loop, it is guaranteed to
                // be smaller than i
            }

            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}
