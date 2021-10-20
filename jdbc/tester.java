package jdbc;
import java.util.Scanner;

import jdbc.marketABDAO;
import jdbc.marketABDAOImp;
import jdbc.matketeEnDTO;

public class tester {
	public static void main(String []args) {
    	Scanner sc = new Scanner(System.in);
		marketABDAO dao = new marketABDAOImp();
		matketeEnDTO dto = new matketeEnDTO();
		String temp;
		do {
			System.out.println("1. Save");
			System.out.println("2. Get All");
			System.out.println("3. Get By Location");
			System.out.println("4. Update Locatiom");
			System.out.println("5. Delete By Id");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter the Market Id: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Market Name: ");
				String name = sc.nextLine();
				System.out.println("Enter the Market Location: ");
				String location = sc.nextLine();
				System.out.println("Enter the Market NoOfShops: ");
				int noOfShop = sc.nextInt();
				
				dto.setId(id);
				dto.setName(name);
				dto.setLocation(location);
				dto.setNoOfShop(noOfShop);
				
				boolean isSaved = dao.save(dto);
				if(isSaved) {
					System.out.println("Data Saved");
				}else {
					System.out.println("Data not saved");
				}
			}
			else if(choice == 2) {
				dao.getAll();
			}
			else if(choice == 3) {
				sc.nextLine();
				System.out.println("Enter Market Location");
				String loaction = sc.nextLine();
				dto.setLocation(loaction);
				boolean found = dao.getByLocation(dto);
				if(found) {
					System.out.println("Data Found");
				}else {
					System.out.println("Data not found");
				}
			}
			
			else if(choice == 4) {
				sc.nextLine();
				System.out.println("Enter Market Name");
				String name = sc.nextLine();
				System.out.println("Enter Market location");
				String location= sc.nextLine();
				
				
				dto.setName(name);
				dto.setLocation(location);
				
				boolean isUpdated = dao.updateByLocation(dto);
				if(isUpdated) {
					System.out.println("Data Updated");
				}else {
					System.out.println("Data not updated");
				}
			}
			
			else if(choice == 5) {
				System.out.println("Enter the Market Id");
				int id = sc.nextInt();
				
				dto.setId(id);
				boolean isDeleted = dao.deleteById(dto);
				if(isDeleted) {
					System.out.println("Data Deleted");
				}else {
					System.out.println("Not found");
				}
			}
			else {
				System.out.println("Enter valid number");
			}
			sc.nextLine();
			System.out.println("Enter Yes/yes to continue or any other letter to exit");
			temp = sc.nextLine();
		}while(temp.equals("yes"));
	}	
    

}
