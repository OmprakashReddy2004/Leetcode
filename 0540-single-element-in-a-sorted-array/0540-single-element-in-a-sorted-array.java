class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if nums[mid] is not equal to its neighbors
            if ((mid == 0 || nums[mid] != nums[mid - 1]) && (mid == n - 1 || nums[mid] != nums[mid + 1])) {
                return nums[mid]; // Found the single non-duplicate element
            }

            // If mid is even and nums[mid] is equal to its next element
            if (mid % 2 == 0 && mid + 1 < n && nums[mid] == nums[mid + 1]) {
                left = mid + 2; // Move left pointer to the right of mid
            }
            // If mid is odd and nums[mid] is equal to its previous element
            else if (mid % 2 != 0 && mid - 1 >= 0 && nums[mid] == nums[mid - 1]) {
                left = mid + 1; // Move left pointer to the right of mid
            } else {
                right = mid; // Move right pointer to mid (including mid)
            }
        }

        return nums[left]; // Single non-duplicate element found
    }
}
