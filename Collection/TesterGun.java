import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesterGun {
	static Scanner sc=new Scanner(System.in);
	static List<Gun> guns = new LinkedList();
	
	public static void main(String[] args)
	{
		TesterGun t=new TesterGun();
		String answer;
		do {
			System.out.println("enter choice as per requirement");
			System.out.println("1 for Insert");
			System.out.println("2 for  Insert all");
			System.out.println("3 for display all");
			System.out.println("4 for  display by name");
			System.out.println("5 for update");
			System.out.println("6 for  Delete one ");
			System.out.println("7 for Delete all");
			
			System.out.println("enter choice");
			int choice=sc.nextInt();
			
			if(choice==1)
			{
				Gun gun = new Gun();
				sc.nextLine();
				System.out.println("enter gun name");
				String name=sc.nextLine();
				System.out.println("enter gun color");
				String color=sc.nextLine();
				System.out.println("enter gun validate");
				String validate=sc.nextLine();
				System.out.println("enter gun cost");
				float cost=sc.nextFloat();
				System.out.println("enter nobullets");
				int nobullets=sc.nextInt();
				
				
				gun.setName(name);
				gun.setColor(color);
				gun.setValidate(validate);
				gun.setCost(cost);
				gun.setNobullets(nobullets);
			
				t.save(gun);
			}
			else if(choice==2)
			{
				List<Gun> list = new ArrayList<>();
				System.out.println("enter the no of guns");
				int n=sc.nextInt();
				for(int i=0;i<n;i++)
				{
					Gun gun = new Gun();
					sc.nextLine();
					System.out.println("enter gun name");
					String name=sc.nextLine();
					System.out.println("enter gun color");
					String color=sc.nextLine();
					System.out.println("enter gun validate");
					String validate=sc.nextLine();
					System.out.println("enter gun cost");
					float cost=sc.nextFloat();
					System.out.println("enter nobullets");
					int nobullets=sc.nextInt();
					
					
					gun.setName(name);
					gun.setColor(color);
					gun.setValidate(validate);
					gun.setCost(cost);
					gun.setNobullets(nobullets);
					list.add(gun);
				}
				t.saveall(list);
			}
			else if(choice==3)
			{
				t.getAll();
			}
			else if(choice==4)
			{
				sc.nextLine();
				System.out.println("enter gun name");
				String name=sc.nextLine();
				t.getByName(name);
			}
			else if(choice==5)
			{
				sc.nextLine();
				System.out.println("enter gun color to update");
				String color=sc.nextLine();
				t.updateColor(color);
				boolean verify=t.updateColor(color);
				if(verify) {
					System.out.println("updated");
				}
				else {
					System.out.println("not updated");
				}
			}
			else if(choice==6)
			{
				sc.nextLine();
				System.out.println("enter gun name  to delete "); 
				String name=sc.nextLine();
				boolean check=t.delete(name);
				if(check)
					System.out.println("deleted successfully1");
				else
					System.out.println("not deleted");
			}
			else if(choice==7)
			{
				t.deleteAll();
			}
			sc.nextLine();
			System.out.println("do u want to continue? yes/no");
			answer=sc.nextLine();
		}while(answer.equals("yes"));
	}
	void save(Gun gun)
	{
		guns.add(gun);
		
	}
	
	void saveall(List<Gun> list)
	{
		guns.addAll(list);
	}
	
	void getAll()
	{
		for(Gun gun: guns)
		{
			System.out.println(gun.getName()+"\t"+gun.getColor()+"\t"+gun.getValidate()+"\t"+gun.getCost()+"\t"+gun.getNobullets());
		}
		
	}
	void getByName(String name)
	{
		for(Gun gun:guns)
		{
			if(gun.getName().equals(name))
			{
				System.out.println(gun.getName()+"\t"+gun.getColor()+"\t"+gun.getValidate()+"\t"+gun.getCost()+"\t"+gun.getNobullets());
			}
		}
	}
	boolean updateColor(String color)
	{
		for(Gun gun:guns)
		{
			if(gun.getColor().equals(color))
			{
				sc.nextLine();
				System.out.println("enter gun name");
				String name=sc.nextLine();
				System.out.println("enter gun color");
				color=sc.nextLine();
				System.out.println("enter gun validation");
				String validate=sc.nextLine();
				System.out.println("enter gun cost of thr gun");
				float cost=sc.nextFloat();
				System.out.println("enter number of bullets present ");
				int nobullets=sc.nextInt();
			
			
				gun.setName(name);
				gun.setColor(color);
				gun.setValidate(validate);
				gun.setCost(cost);
				gun.setNobullets(nobullets);
				guns.set(guns.indexOf(gun), gun);
				return true;
			}
		}return false;
	}
	boolean delete(String name)
	{
		for(Gun gun:guns)
		{
			if(gun.getName().equals(name))
			{
				guns.remove(gun);
				return true;
			}
		}return false;
	}
	
	boolean deleteAll()
	{
		for(Gun gun:guns)
		{
			guns.clear();
			return true;
		}
	return false;
	}
										
	

}


	
		