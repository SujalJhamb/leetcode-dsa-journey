class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fp = firstPos(nums, target);
        int lp = lastPos(nums, target);
        return new int[] {fp, lp};
    }
    public int firstPos(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public int lastPos(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (target == nums[mid]) {
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}