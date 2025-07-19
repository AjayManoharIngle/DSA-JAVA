package array_string_que;

import java.util.Arrays;
import java.util.Comparator;

public class SecondMaxNo {

	public static void main(String[] args) {
		
		int a[] = {10,11,10,2,3,9,10,11,12};
		// OP - 11
		
		System.out.println(normal_1(a)); // 11
		System.out.println(normal_2(a)); //  11
		System.out.println(java8_1(a)); // 11
		
	}

	private static int java8_1(int[] a1) {
		return Arrays.stream(a1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	}

	private static int normal_2(int[] a) {
		
		// find first max no 
		int max = Integer.MIN_VALUE;
		for(int i : a) {
			if(max < i) {
				max = i;
			}
		}
		
		// secondmax always not equal with max and current value it should be greater than that
		int secondMax = Integer.MIN_VALUE;
		for(int i : a) {
			if(i > secondMax && i != max) {
				secondMax = i;
			}
		}
		return secondMax;
	}

	private static int normal_1(int[] a) {
		if(a.length == 0) {
			return -1;
		}
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i : a) {
			if(max < i) {
				secondMax = max;
				max = i;
			}else if(i < max && i > secondMax) {
				secondMax = i;
			}
		}
		return secondMax; 
	}
}
