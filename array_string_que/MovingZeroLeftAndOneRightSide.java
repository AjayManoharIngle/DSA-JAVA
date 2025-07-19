package array_string_que;

import java.util.Arrays;

public class MovingZeroLeftAndOneRightSide {

	public static void main(String[] args) {
		
		// array only contain 0 and 1 
		int a[] = {1,0,1,0,0,1};
		// OP - [0,0,0,1,1,1]
		
		System.out.println(Arrays.toString(normal_1(a))); // [0, 0, 0, 1, 1, 1]
		System.out.println(Arrays.toString(normal_2(a))); // [0, 0, 0, 1, 1, 1]
		System.out.println(Arrays.toString(normal_3(a))); // [0, 0, 0, 1, 1, 1]
	}

	// use two pointer approach 
	private static int[] normal_3(int[] a) {
		
		int left = 0;
		int right = a.length-1;
		
		while(left < right) {
			// if 0 is more at left side then no swap rquired 
			while(a[left] == 0 && left < right) {
				left++;
			}
			
			// if 1 is more at right side thne no swap required
			while(a[right] == 1 && left < right) {
				right--;
			}
		
			if(left < right) {
				int t = a[right];
				a[right] = a[left];
				a[left] = t;
				left++;
				right--;
			}
		}
		
		return a;
	}

	private static int[] normal_2(int[] a) {
		// if right value is 0 then only swap it other wise no swap
		int left = 0;
		for(int right =0; right < a.length;right++) {
			if(a[right] == 0) {
				int t = a[right];
				a[right] = a[left];
				a[left] = t;
				left++;
			}
		}
		return a;
	}

	private static int[] normal_1(int[] a) {
		// count of zeroes and put remaining as 1
		int zeroCount = 0;
		for(int i : a) {
			if(i == 0) {
				zeroCount++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(i < zeroCount) {
				a[i] = 0;
			}else {
				a[i] = 1;
			}
		}
		return a;
	}
}
