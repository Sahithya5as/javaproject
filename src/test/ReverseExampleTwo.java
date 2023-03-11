package test;

public class ReverseExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello world";
		String result="";
		
		for (int i=str.length()-1;i>=0;i--) {
			
			result= result + str.charAt(i);
			
		}
		System.out.println("Reversed = " + result);
	}

}