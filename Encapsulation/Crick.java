import java.util.Scanner;
class Crick{
public static void main(String []nik){
Scanner sc = new Scanner(System.in);
System.out.println("Enter no of teams");
int n;
n=sc.nextInt();
IPLTeams []ipl=new IPLTeams[n];
for(int i=0;i<ipl.length;i++){
sc.nextLine();
System.out.println("enter the no of players");
int Iplayers=sc.nextInt();
System.out.println("enter the no of days");
int Idays=sc.nextInt();
sc.nextLine();
System.out.println("enter the color of dress");
String Idress=sc.nextLine();
IPLTeams teams=new IPLTeams();
teams.setPlayer(Iplayers);
teams.setDays(Idays);
teams.setDresscolor(Idress);
 
ipl[i]=teams;
}
for(int i=0;i<ipl.length;i++){
IPLTeams teams=ipl[i];

int players=teams.getPlayer();
int days=teams.getDays();
String dresscolor=teams.getDresscolor();
System.out.println(players+" "+days+" "+dresscolor);
}
}
}


