class Verify{
public static void main(String args[]){

//upcasting
Olympic oly=new Outdoorgame();
oly.noofgames();

// not possible only parent method can be accessble =oly.shift();

//downcasting=only after upcasting we can do downcasting
//Outdoorgame outd=new Outdoorgame();


Outdoorgame outd=(Outdoorgame)oly;
outd.noofgames();
outd.shift();

}
}

