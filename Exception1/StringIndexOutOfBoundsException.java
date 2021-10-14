
public class StringIndexOutOfBoundsException {
	 
     //System.out.println("Length of the String: "+str.length());
	 void fun() {
		 
		 String str="Meghana";
		 
	 
		 for(int i=0; i<str.length(); i++) {
			 
			 System.out.print(str.charAt(i)+" ");
		 
		 }
		 
     //Accessing element at greater than the length of the String
		 System.out.print(str.charAt(10));

}
}