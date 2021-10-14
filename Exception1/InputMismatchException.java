import java.util.Scanner;
public class InputMismatchException {
	public static void main (String args[]){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your name: ");
	      String name = sc.next();
	      System.out.println("Enter your age: ");
	      int age = sc.nextInt();
	      StudentData obj = new StudentData(name, age);
	      obj.display();
	   }

}
