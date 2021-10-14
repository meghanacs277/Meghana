import java.util.Scanner;
public class TestExam {
public static void main(String []ar) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the choice :hallticket,idcard,pen,copy,calculator");
	String a=sc.nextLine();
	switch(a) {
	case "hallticket":
		System.out.println("type yes if hallticket is present and type no");
		String b=sc.nextLine();
		
		try {
			if(b.equals("yes")) {
				System.out.println("can attend exam");
			}
			else {
				
				throw new ExamException("can not attend exam");
			}
			
		}catch(ExamException e) {
			System.err.println(e.getMessage());
		}
		
		break;
		
	case "idcard":
		System.out.println("type yes if idcard is present and type no");
		String c=sc.nextLine();
		
		try {
			if(c.equals("yes")) {
				System.out.println("can attend exam");
			}
			else {
				
				throw new ExamException("can not attend exam");
			}
			
		}catch(ExamException e) {
			System.err.println(e.getMessage());
		}
		
		break;
	
	case "pen":	
		System.out.println("type yes if idcard is present and else  type no");
		String d=sc.nextLine();
		
		try {
			if(d.equals("yes")) {
				System.out.println("can attend exam");
			}
			else {
				
				throw new ExamException("can not attend exam");
			}
			
		}catch(ExamException e) {
			System.err.println(e.getMessage());
		}
		
		break;
		
	case "copy":
		System.out.println("type yes if copy is present and else type no");
		String f=sc.nextLine();
		
		try {
			if(f.equals("yes")) {
				System.out.println("cannot attend exam");
			}
			else {
				
				throw new ExamException("can attend exam");
			}
			
		}catch(ExamException e) {
			System.err.println(e.getMessage());
		}
		
		break;
		
		
	case "calculator":
		System.out.println("type yes if calculator is present and else type no");
		String g=sc.nextLine();
		
		try {
			if(g.equals("yes")) {
				System.out.println("can attend exam");
			}
			else {
				
				throw new ExamException("can not attend exam");
			}
			
		}catch(ExamException e) {
			System.err.println(e.getMessage());
		}
		
		break;
		
	case "vaccinated":
		System.out.println("type yes if vaccinated is present and else  type no");
		String h=sc.nextLine();
		
		try {
			if(h.equals("yes")) {
				System.out.println("can attend exam");
			}
			else {
				
				throw new ExamException("can not attend exam");
			}
			
		}catch(ExamException e) {
			System.err.println(e.getMessage());
		}
		
		break;	
	}
}
}

		
	
			
					
		
		
		
			
				

