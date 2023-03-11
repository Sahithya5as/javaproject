package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] names = { "sahi", "shammi","mad"};
		System.out.println("second name " + names[1]);
		
		
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		
        list1.add("john");
        list1.add("mike");
        list1.add("marry");
        list1.add("nick");
        list1.add("Anna");
        System.out.println("the list is" + list1);
        System.out.println("size of the list is" + list1.size());
        System.out.println("frist name is " + list1.get(0));
        System.out.println("Last name is " + list1.get(list1.size()-1));
        
        list1.set(2,"rick");
        System.out.println("the list is" + list1);
        
        list1.remove(3);
        System.out.println("the list is" + list1);
        
        Collections.sort(list1);
        System.out.println("the list is" + list1);
        
        
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("after reverse of the list"+ list1);
        
        
	}

}
