package hashSetAndHashMap;

import java.util.*;

public class FrequencyOfElementInAnArray {

	static void frequency(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int e: a) {
			if(map.containsKey(e)) {
				int temp = map.get(e);
				map.put(e, temp+1);
			} else {
				map.put(e, 1);
			}
			System.out.println(e+" "+ map);
		}
		
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,1,3,2};
		
		frequency(a);

	}

}
