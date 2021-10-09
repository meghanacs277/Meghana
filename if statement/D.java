import java.util.Scanner;
class D{
public static void main(String []args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number");
int a=scan.nextInt();
if(a==1){
System.out.println("sunday");
}
if(a==2){
System.out.println("monday");
}
if(a==3){
System.out.println("tuesday");
}
if(a==4){
System.out.println("wednesday");
}
if(a==5){
System.out.println("thursday");
}
if(a==6){
System.out.println("friday");
}
if(a==7){
System.out.println("saturday");
}
if(a>7){
System.out.println("not a day");
}
}
}

