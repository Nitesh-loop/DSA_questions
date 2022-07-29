package hashSetAndHashMap;

import java.util.*;

public class CountDistinctElements {

	static int distinct(int[] a) {
		Set<Integer> set = new HashSet<>();
		for(int e: a) {
			set.add(e);
		}
		return set.size();
	}
	
	public static void main(String[] args) {
		int[] a = {1,1,2,3,1,2,4,9,2,1,3};
		System.out.println(distinct(a));
	}

}
