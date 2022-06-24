package sort;

import java.util.Arrays;

// 거품 정렬 / 버블 정렬

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] nums = {1, 5, 3, 6, 2, 7, 4, 9, 0};
		
		System.out.println(Arrays.toString(bubbleSort(nums)));
		
	}
	
	public static int[] bubbleSort(int[] nums) {
		
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				// if (nums[j - 1] < num[j]) {		내림차순
				if (nums[j - 1] > nums[j]) {	// 	오름차순
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		return nums;
	}
	
}
