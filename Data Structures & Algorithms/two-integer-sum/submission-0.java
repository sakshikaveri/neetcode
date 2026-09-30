class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> resultArray = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int tobeFound = target - nums[i];

            if (resultArray.containsKey(tobeFound)) {
                return new int[] {resultArray.get(tobeFound), i};
            }

            resultArray.put(nums[i], i);
        }
        return new int[] {};
    }
}
