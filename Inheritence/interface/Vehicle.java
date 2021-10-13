interface Vehicle{
String brand="Tata";
//variable behave like a  final in interface 
void type();
default void fuel(){
System.out.println("the fuel type may be petrol or disel");
}
}
