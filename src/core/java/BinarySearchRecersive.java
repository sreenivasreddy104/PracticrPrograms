package core.java;

public class BinarySearchRecersive {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 16, 17, 19, 20 };
		int target = 15;
		int findElemt = findElemt(nums, 0, nums.length - 1, target);
		System.out.println("Element found at index : " + findElemt);

	}

	static int findElemt(int[] nums, int left, int right, int target) {

		if (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				return findElemt(nums, mid + 1, right, target);
			} else {
				return findElemt(nums, left, mid - 1, target);
			}
		}
		return -1;
	}
}
