package utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		Map<Long, List<String>> map = new HashMap<Long,List<String>>();
		List<String> list = new ArrayList<String>();
		
		for(long i = 0 ;i < 20000000; i++){
			list = new ArrayList<String>();
			list.add("a");
			list.add("b");
			list.add("c");
			map.put(i, list);
//			if(i == 0){
//			}else{
//				list.add("d");
//				list.add("e");
//				list.add("f");
//				map.put("0", list);
//			}
		}
		
		System.out.println(map.size());
		
		
		
		
		/*
		for(int i = 0; i < 2; i++){
			list.clear();
			if(i == 0){
				list.add("a");
				list.add("b");
				list.add("c");
				map.put("0", list);
			}
			if(i == 1){
				list.add("d");
				list.add("e");
				list.add("f");
				map.put("1", list);
			}
		}
		List<String> tList = map.get("0");
		for(String s : tList){
			System.out.println(s);
		}*/

	}

}
