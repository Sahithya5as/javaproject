package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String str1 = "hello world";
		String result ="";
		
		for(int i = str1.length()-1;i>=0;i--) {
			
			result = result + str1.charAt(i);
			
		}
       System.out.println("reversed string is" + result);
       
       
       String str2 = "ram meets sita";
       String[] arr1 = str2.split(" ");
       
       
       String result1= "";
       for (int i = arr1.length-1;i>=0;i--) {
    	   
    	   
    	   result1 = result1 +arr1[i]+ " ";
    	   
       }
       
       System.out.println("result is " + result1.trim());
       
       
       
       
	}

}
