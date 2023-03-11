package test;

public class ArryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {10,20,30,40,50};
		
		System.out.println("lenth of the ARRAY" + num1.length);
		System.out.println("first  item of the array is " + num1[0]);
		System.out.println("Last item of the array is " + num1[num1.length-1]);
	
		
        String[] arr2 = {"Mon","Tue","Wed","Thu","Fri"};
		
		System.out.println("Value at third position is " + arr2[2]);
		
		
		String str = "Clean World Green World Happy World";
		
		String[] arr3 = str.split(" ");  // {"Clean","World","Green","World"}
		
		System.out.println("Total num of words inside the string is " + arr3.length);


		

	}

}
