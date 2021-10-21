package www.wolken.solarsystem;

import java.util.Scanner;

import www.wolken.solarsystem.dao.solarsystem_detailsDAO;
import www.wolken.solarsystem.dao.solarsystem_detailsDAOimp;
import www.wolken.solarsystem.entity.solarsystem_detailss;

public class testerss {
	@SuppressWarnings("null")
	public static void main(String []arg) {
	solarsystem_detailsDAO dao =new solarsystem_detailsDAOimp();
  	
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	String ans = null;
	
	
	
	do {
		System.out.println("1.Save");
		System.out.println("2.Display by Id");
		System.out.println("3.Update by Id");
		System.out.println("4.Delete by Id");
		System.out.println("Enter your choice");
		int ch=scanner.nextInt();
		if(ch==1) {
			System.out.println("Enter solar Id");
			int id=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter solar name");
			String name=scanner.nextLine();
			System.out.println("Enter solar distance");
			int distance=scanner.nextInt();
			System.out.println("Enter color");
			String color=scanner.nextLine();
			
			solarsystem_detailss entity=new solarsystem_detailss();
			entity.setId(id);
			entity.setDistance(distance);
			entity.setColor(color);
			entity.setName(name);
			
			boolean isSaved=dao.save(entity);
			if(isSaved) {
				System.out.println("Data Saved");
			}else {
				System.out.println("Data not saved");
			}
		}
		else if(ch==2) {
			System.out.println("Enter solarsystem Id");
			int id=scanner.nextInt();
			boolean found=dao.getById(id);
			if(found){
				System.out.println("Data found");
			}else {
				System.out.println("Data not found");
			}
		}
		else if(ch==3) {
			System.out.println("Enter solar Id");
			int id=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter solar name");
			String name=scanner.nextLine();
			System.out.println("Enter solar distance");
			int distance=scanner.nextInt();
			System.out.println("Enter color");
			String color=scanner.nextLine();
			
			solarsystem_detailss entity=new solarsystem_detailss();
			entity.setId(id);
			entity.setId(id);
			entity.setName(name);
			entity.setColor(color);
			entity.setDistance(distance);
			
			boolean isUpdated=dao.updateById(entity);
			if(isUpdated) {
				System.out.println("Data Updated");
			}else {
				System.out.println("Data not updated");
			}
		}
		else if(ch==4) {
			System.out.println("Enter solarsytem Id");
			int id=scanner.nextInt();
			solarsystem_detailss entity=new solarsystem_detailss();
			
			entity.setId(id);
			boolean found=dao.deleteById(entity);
			if(found){
				System.out.println("Data Deleted");
			}else {
				System.out.println("Data not found");
			}
		}
		scanner.nextLine();
		System.out.println("Do you want to continue");
	
	}while(ans.equals(ans));
}
}

		