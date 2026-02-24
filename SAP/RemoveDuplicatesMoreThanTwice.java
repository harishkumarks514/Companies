package SAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicatesMoreThanTwice {

	public static void main(String[] args) {
		int[] arr = {14,2,11,12,1,2,14,2,1,3,14,12,1};
		
		Map<Integer, Integer> CountMap = new HashMap<>();
		
		List<Integer> result = new ArrayList<>();
		
		for(int num : arr)
		{
			int count = CountMap.getOrDefault(num,0);
			if(count<2)
			{
				result.add(num);
				CountMap.put(num, count+1);
			}
		}
		System.out.println(result);
	}
}
