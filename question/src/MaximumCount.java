// 2529
public class MaximumCount {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {-2, -1, -1, 1, 2, 3};
        System.out.println("Output: " + maximumCount(nums1)); // Output: 3

        // Example 2
        int[] nums2 = {-3, -2, -1, 0, 0, 1, 2};
        System.out.println("Output: " + maximumCount(nums2)); // Output: 3
    }


        public static int maximumCount(int[] nums) {
            int firstPositiveIndex = findFirstPositiveIndex(nums);
            int lastNegativeIndex = findLastNegativeIndex(nums);

            int positiveCount = nums.length - firstPositiveIndex; // Count of positive numbers
            int negativeCount = lastNegativeIndex + 1;           // Count of negative numbers

            return Math.max(positiveCount, negativeCount);
        }

        // Binary search to find the first index of a positive number
        private static int findFirstPositiveIndex(int[] nums) {
            int low = 0, high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] > 0) {
                    high = mid - 1; // Look for earlier positives
                } else {
                    low = mid + 1;
                }
            }
            return low; // First positive index
        }

        // Binary search to find the last index of a negative number
        private static int findLastNegativeIndex(int[] nums) {
            int low = 0, high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] < 0) {
                    low = mid + 1; // Look for later negatives
                } else {
                    high = mid - 1;
                }
            }
            return high; // Last negative index
        }


    }




