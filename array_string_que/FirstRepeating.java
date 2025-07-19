package array_string_que;

import java.util.HashSet;

public class FirstRepeating {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,50,20,40,10};
		// output : 20

		String s ="nitin";
		// Output : i

		System.out.println(normal_1(a)); // 20
		System.out.println(normal_2(s)); // i
		System.out.println(java8_1(s));  // i
	}

	private static Character java8_1(String s) {
		HashSet<Character> set = new HashSet<>();
		return s.chars().mapToObj(c -> (char)c).filter(i -> !set.add(i)).findFirst().get();
	}

	private static char normal_2(String s) {
		HashSet<Character> set = new HashSet<>();
		for(char i : s.toCharArray()) {
			if(!set.add(i)) {
				return i;
			}
		}
		return 0;
	}
	
	private static int normal_1(int[] a) {
		HashSet<Integer> set = new HashSet<>();
		for(int i : a) {
			if(set.contains(i)) {
				return i;
			}else {
				set.add(i);
			}
		}
		return -1;
	}
}
