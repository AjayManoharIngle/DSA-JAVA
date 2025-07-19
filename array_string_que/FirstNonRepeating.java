package array_string_que;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,50,20,40,10};
		// output : 30

		String s ="nitin";
		// Output : t
		
		System.out.println(normal_1(a)); // 30
		System.out.println(normal_2(s)); // t
		System.out.println(java8_1(s)); // t
	}

	private static char java8_1(String s) {
		return s.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(
					Function.identity(),
					LinkedHashMap :: new,
					Collectors.counting())
				)
		.entrySet()
		.stream()
		.filter(i -> i.getValue()==1)
		.map(Map.Entry :: getKey)
		.findFirst()
		.orElse('\0');
	}

	private static char normal_2(String s) {
		HashSet<Character> seen = new HashSet<>();
		HashSet<Character> repeat = new HashSet<>();
		for(char i : s.toCharArray()) {
			if(!seen.add(i)) {
				repeat.add(i);
			}	
		}
		System.out.println(seen + " " + repeat); // [t, i, n] [i, n]
		
		for(char i : seen) {
			// we want that element which is not in repeat if found first then return it 
			if(!repeat.contains(i)) {
				return i;
			}
		}
		
		return 0;
	}

	private static Integer normal_1(int[] a) {
		// get first count of each numbers and after that whoes count is 1 
		// then it is first non repeating and preserve order so use linked hash map
		
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		for(int i : a) {
			map.put(i,map.getOrDefault(i,0)+1);
		}
		for(Map.Entry<Integer,Integer> i : map.entrySet()) {
			if(i.getValue() == 1) {
				return i.getKey();
			}
		}
		return -1;
	}

}
