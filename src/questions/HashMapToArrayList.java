package questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {

		HashMap<String, Integer> compMap = new HashMap<>();

		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 5000);
		compMap.put("Cisco", 15000);

		//First print out method using iterator
//		Iterator iterator = compMap.entrySet().iterator();
//		while (iterator.hasNext()) {
//
//			Map.Entry pairs = (Map.Entry) iterator.next();
//			System.out.println(pairs.getKey() + " = " + pairs.getValue());
//		}
		
		//Second print out method which is better using for each 
		for(Map.Entry pairs : compMap.entrySet()){
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}

		// Convert keys into ArrayList
		List<String> compNameList = new ArrayList<String>(compMap.keySet());

		for (String string : compNameList) {
			System.out.println(string);
		}

		// Convert values into ArrayList
		List<Integer> empValueList = new ArrayList<Integer>(compMap.values());

		for (Integer integer : empValueList) {
			System.out.println(integer);
		}

	}

}
