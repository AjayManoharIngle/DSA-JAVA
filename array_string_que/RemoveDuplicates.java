package array_string_que;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int a[] = {10,10,20,30,50,20,40};
		// O/P - 10 20 30 50 40 - preverse order also
		
		System.out.println(java8_1(a)); // [10, 20, 30, 50, 40]
		System.out.println(java8_2(a)); // [10, 20, 30, 50, 40]
		System.out.println(Arrays.toString(java8_3(a)));  // [10, 20, 30, 50, 40]
		System.out.println(normal_1(a));  // [10, 20, 30, 50, 40]
		System.out.println(normal_2(a));  // [10, 20, 30, 50, 40]
		
	}

	private static int[] java8_3(int[] a) {
		return Arrays.stream(a).boxed().distinct().collect(Collectors.toList())
		.stream()
		.mapToInt(Integer :: intValue)
		.toArray();
	}

	private static List<Integer> normal_2(int[] a) {
		return new ArrayList<>(new LinkedHashSet<>(Arrays.stream(a).boxed().collect(Collectors.toList())));
	}

	private static Set<Integer> normal_1(int[] a) {
		Set<Integer> set = new LinkedHashSet<>();
		for(int i : a) {
			set.add(i);
		}
		return set;
	}

	private static Set<Integer> java8_2(int[] a) {
		// Because set will give any randome numbers not preserve order so use linked hash set
		return Arrays.stream(a).boxed().collect(Collectors.toCollection(LinkedHashSet :: new));
	}

	private static List<Integer> java8_1(int[] a) {
		return Arrays.stream(a).boxed().distinct().collect(Collectors.toList());
	}
}
