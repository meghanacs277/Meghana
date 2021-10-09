import java.util.Scanner;
class Type{
public static void main(String []args){
//Countries co =new Countrie();
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of country");
int n;
n=scan.nextInt();
Countries []countrys=new Countries[n];

for(int i=0;i<countrys.length;i++){
scan.nextLine();
System.out.println("Enter the nationality of the country");
String cnationality=scan.nextLine();
System.out.println("Enter the language of the country");
String clanguage=scan.nextLine();
System.out.println("Enter the no of river of the country");
Byte cnoofriver=scan.nextByte();
Countries co =new Countries();
co.setNationality(cnationality);
co.setLanguage(clanguage);
co.setNoofrivery(cnoofriver);
countrys[i]=co;

}
for(int i=0;i<countrys.length;i++){
	Countries co=countrys[i];
	String nationality=co.getNationality();
	String language=co.getLanguage();
	byte noofriver=co.getNoofriver();
	System.out.println(nationality+"    "+language+"  "+noofriver);
}
	

}
}







