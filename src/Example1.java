// Java program to Demonstrate Polymorphism

// This class will contain the same method names,
// yet the program will
// compile & run successfully
// polymorphism means many forms, meaning same method mame with different paramenters , this is overloading
// over Riding:

public class Example1 extends Example2{
    //this is Inheritence.
String name;
public String sayName(){
  return "Myname";
}
public String sayName(String name){
    return name;
}
public int sum(int x,int y){
   return (x+y);

}

public int sum(int x, int y, int z){
    return (x+y+z);
}

public double sum(double x, double y){
    return (x+y);
}

public String test1(String name)
{
    // this method is over Ridding.
    return "testing2";
}
public static void main(String args[])
    {
Example1 s = new Example1();
System.out.println(s.sayName());
System.out.println(s.sayName("Bala"));
System.out.println(s.sum(10,20));
System.out.println(s.sum(2,4,7));
System.out.println(s.sum(10.2,3.5));
System.out.println(s.test1("testing"));
    }
}
