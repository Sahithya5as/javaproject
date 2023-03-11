package collection;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		HashMap<String,Integer> basket = new HashMap<String, Integer>();
		
		
		basket.put("Item1",2);
		basket.put("Item2",3);
		basket.put("Item3",3);
        
        
        System.out.println("This map is " + basket);
        
        basket.put("Item2",4);
        
        System.out.println("after adding item" + basket);
        
        basket.remove("Item1",2);
        System.out.println("after removing item" + basket);
        
        for (String item:basket.keySet()) {
        	
        	
        	System.out.println("Item name is " + item);
			System.out.println("Item quantity is " + basket.get(item));
        	
           
        }
        
        
        
 for (int values:basket.values()) {
        	
        	
        	System.out.println("Item value is " + values);
        	
           
        }
        
 String str = "Clean World Green World Happy World";
	
	String[] arr1 = str.split(" ");
	HashMap<String,Integer> map1 = new HashMap<String,Integer>();
	
	for(String word:arr1) {	
		if(!map1.keySet().contains(word)) {
			map1.put(word, 1);
		}else {	
			map1.put(word, map1.get(word)+1);
		}
	}
	
	System.out.println("The resulting map  is " + map1);
  
        
	}

}
